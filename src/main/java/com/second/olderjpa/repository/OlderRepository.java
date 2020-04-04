package com.second.olderjpa.repository;

import com.second.olderjpa.entity.OlderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OlderRepository extends JpaRepository<OlderEntity,Integer> {
}
