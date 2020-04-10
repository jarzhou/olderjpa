package com.second.olderjpa.repository.data;

import com.second.olderjpa.entity.data.FatPercentageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FatPercentageRepository extends JpaRepository<FatPercentageEntity,Integer> {
    FatPercentageEntity findAllByMaxValueLessThanEqualAndMinValueGreaterThan(float value1,float value2);
}
