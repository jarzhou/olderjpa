package com.second.olderjpa.service;

import com.second.olderjpa.entity.ManageEntity;

import java.util.List;
import java.util.Optional;

public interface ManageService {
    ManageEntity findAllById(Integer id);
}
