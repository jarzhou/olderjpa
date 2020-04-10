package com.second.olderjpa.repository.data;

import com.second.olderjpa.entity.data.MuscleContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuscleContentRepository extends JpaRepository<MuscleContentEntity,Integer> {
    MuscleContentEntity findAllByMaxValueLessThanEqualAndMinValueGreaterThan(float value1,float value2);
}
