package com.second.olderjpa.repository;

import com.second.olderjpa.entity.BodyDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface BodyDataRepository extends JpaRepository<BodyDataEntity, Integer> {
    //根据日期，评估级别查询数量
    int countBodyDataEntitiesByDataDateAndPhysicalAssessmentBetween(Date date,String low,String high);
}
