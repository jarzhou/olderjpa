package com.second.olderjpa.repository.data;

import com.second.olderjpa.entity.data.HeartRateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeartRateRepository extends JpaRepository<HeartRateEntity,Integer> {
}
