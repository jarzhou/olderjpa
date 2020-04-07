package com.second.olderjpa.repository.data;

import com.second.olderjpa.entity.data.BmiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BmiRepository extends JpaRepository<BmiEntity,Integer>{

//    @Modifying
//    @Transactional
    BmiEntity findBmiEntityByMaxValueBetween(float min,float max);
}
