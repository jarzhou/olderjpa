package com.second.olderjpa.service.serviceImpl;


import com.second.olderjpa.entity.ManageEntity;
import com.second.olderjpa.repository.ManageRepository;
import com.second.olderjpa.service.ManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.file.OpenOption;
import java.util.Optional;

@Service
public class ManageServiceImpl implements ManageService {

    @Resource
    private ManageRepository manageRepository;

    public ManageEntity findAllById(Integer id){

    return  manageRepository.findAllById(id);
    }
}
