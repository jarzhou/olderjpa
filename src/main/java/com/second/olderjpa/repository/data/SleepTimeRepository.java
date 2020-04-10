package com.second.olderjpa.repository.data;

import com.second.olderjpa.entity.data.SleepTimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SleepTimeRepository extends JpaRepository<SleepTimeEntity,Integer> {
    SleepTimeEntity findAllByMaxValueLessThanEqualAndMinValueGreaterThan(float value1,float value2);
}
