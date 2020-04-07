package com.second.olderjpa.repository.data;

import com.second.olderjpa.entity.data.WaterContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaterContentRepository extends JpaRepository<WaterContentEntity,Integer> {
    WaterContentEntity findWaterContentEntityByWaterContentBetween(float min,float max);
}
