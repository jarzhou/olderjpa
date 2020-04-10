package com.second.olderjpa.repository.data;


import com.second.olderjpa.entity.data.VisceralFatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisceralFatRepository extends JpaRepository<VisceralFatEntity,Integer> {
    VisceralFatEntity findAllByMaxValueLessThanEqualAndMinValueGreaterThan(float value1,float value2);
}
