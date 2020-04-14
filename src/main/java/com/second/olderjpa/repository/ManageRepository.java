package com.second.olderjpa.repository;

import com.second.olderjpa.entity.ManageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManageRepository extends JpaRepository<ManageEntity,Integer> {

    ManageEntity findAllById(Integer id);
}
