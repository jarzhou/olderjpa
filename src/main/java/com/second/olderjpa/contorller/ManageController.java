package com.second.olderjpa.contorller;


import com.second.olderjpa.Entity.ManageEntity;
import com.second.olderjpa.repository.ManageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("manage/")
public class ManageController {

    @Autowired
    ManageRepository manageRepository;

    @GetMapping("findAll")
    public List<ManageEntity> findAll(){
        return manageRepository.findAll();

    }
}
