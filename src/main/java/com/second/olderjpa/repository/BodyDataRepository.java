package com.second.olderjpa.repository;

import com.second.olderjpa.dto.BodyDataQuery;
import com.second.olderjpa.entity.BodyDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface BodyDataRepository extends JpaRepository<BodyDataEntity, Integer> {
    //根据日期，评估级别查询数量
    int countBodyDataEntitiesByDataDateAndPhysicalAssessmentBetween(Date date,String low,String high);

    //更新身体数据的管理员评价
    @Modifying
    @Transactional
    @Query("update BodyDataEntity a set " +
            "a.manageAssessment = CASE WHEN :#{#testAre.manageAssessment} IS NULL THEN a.manageAssessment ELSE :#{#testAre.manageAssessment} END " +
            "where a.bodyId = :#{#testAre.bodyId}")
    int update(@Param("testAre") BodyDataQuery testAre);

    //某日数据的身体参数
    List<BodyDataEntity> findAllByDataDateEquals(Date date);

    //时间间隔的数据
    List<BodyDataEntity> findAllByDataDateBetween(Date date1, Date date2);

    //g根据评级查询
     List<BodyDataEntity> findAllByPhysicalAssessmentBetween(String low,String high);

}
