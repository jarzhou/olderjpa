package com.second.olderjpa.repository;

import com.second.olderjpa.Entity.ManageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManageRepository extends JpaRepository<ManageEntity,Integer> {
}