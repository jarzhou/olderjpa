package com.second.olderjpa.contorller;

import com.second.olderjpa.Entity.BodyDataEntity;
import com.second.olderjpa.repository.BodyDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/BodyData")
public class BodyDataController {
    @Autowired
    BodyDataRepository bodyDataRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page <BodyDataEntity> findAll(@PathVariable("page") Integer page,@PathVariable("size") Integer size){
        PageRequest pageRequest = PageRequest.of(page,size);
//        Page<BodyDataEntity> page = bodyDataRepository.findAll(pageRequest);
//        System.out.println(bodyDataRepository.findAll());
        return bodyDataRepository.findAll(pageRequest);
    }
    @GetMapping("/findAll")
    public List <BodyDataEntity> findAll(){
//        System.out.println(bodyDataRepository.findAll());
        return bodyDataRepository.findAll();
    }
}
