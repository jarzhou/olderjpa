package com.second.olderjpa.repository.data;

import com.second.olderjpa.dto.data.BmiQuery;
import com.second.olderjpa.entity.data.BmiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface BmiRepository extends JpaRepository<BmiEntity,Integer>{

//    @Modifying
//    @Transactional
    BmiEntity findBmiEntityByMaxValueBetween(float min,float max);

    BmiEntity findAllByMaxValueLessThanEqualAndMinValueGreaterThan(float value1,float value2);

//    @Modifying
//    @Transactional
//    @Query("update Test a set " +
//            "a.bmi = CASE WHEN :#{#bmiQuery.bmiId} IS NULL THEN a.name ELSE :#{#bmiQuery.bmiId} END ," +
//            "a.age = CASE WHEN :#{#bmiQuery.age} IS NULL THEN a.age ELSE :#{#bmiQuery.age} END ," +
//            "a.insertTime = CASE WHEN :#{#bmiQuery.insertTime} IS NULL THEN a.insertTime ELSE :#{#bmiQuery.insertTime} END ," +
//            "a.spare =  CASE WHEN :#{#bmiQuery.spare} IS NULL THEN a.spare ELSE :#{#bmiQuery.spare} END " +
//            "where a.id = :#{#testAre.id}")
//    int update(@Param("bmiQuery") BmiQuery bmiQuery);
}
