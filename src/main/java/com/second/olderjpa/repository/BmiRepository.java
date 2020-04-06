package com.second.olderjpa.repository;

import com.second.olderjpa.entity.BmiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

public interface BmiRepository extends JpaRepository<BmiEntity,Integer>{

//    @Modifying
//    @Transactional
    BmiEntity findBmiEntityByMaxValueBetween(float min,float max);

}
