package com.second.olderjpa.repository.data;

import com.second.olderjpa.entity.data.BasalMetabolismEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasalMetabolismRepository extends JpaRepository<BasalMetabolismEntity,Integer> {
    BasalMetabolismEntity findAllByMaxValueLessThanEqualAndMinValueGreaterThan(float value1,float value2);


}
