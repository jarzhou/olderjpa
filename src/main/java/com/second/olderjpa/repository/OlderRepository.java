package com.second.olderjpa.repository;

import com.second.olderjpa.entity.OlderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface OlderRepository extends JpaRepository<OlderEntity,Integer> {

    //老人年龄范围的数据
    List<OlderEntity> findAllByBirthdayBetween(Date date1, Date date2);
}
