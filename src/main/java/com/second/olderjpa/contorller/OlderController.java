package com.second.olderjpa.contorller;


import com.second.olderjpa.entity.BodyDataEntity;
import com.second.olderjpa.entity.OlderEntity;
import com.second.olderjpa.repository.OlderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/older")
public class OlderController {
    @Autowired
    OlderRepository olderRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<OlderEntity> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest pageRequest = PageRequest.of(page,size);
//        Page<BodyDataEntity> page = bodyDataRepository.findAll(pageRequest);
//        System.out.println(bodyDataRepository.findAll());
        return olderRepository.findAll(pageRequest);

    }

}
