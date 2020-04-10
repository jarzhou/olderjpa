package com.second.olderjpa.repository.data;

import com.second.olderjpa.entity.data.BoneMassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoneMassRepository extends JpaRepository<BoneMassEntity,Integer> {
    BoneMassEntity findAllByMaxValueLessThanEqualAndMinValueGreaterThan(float value1,float value2);

}
