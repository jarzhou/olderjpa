package com.second.olderjpa.contorller;


import com.second.olderjpa.entity.ManageEntity;
import com.second.olderjpa.repository.ManageRepository;
import com.second.olderjpa.service.ManageService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
public class Login {
    @Resource
    private ManageService manageService;
    @Resource
    private ManageRepository manageRepository;
    @PostMapping("/getLogin")
    public boolean getLogin(@Param("id") String id,@Param("password") String password){
        int id1 = Integer.valueOf(id);
        System.out.println(id1);
        System.out.println(password);
        ManageEntity manageEntity = manageRepository.findAllById(id1);
        System.out.println(manageEntity);
        if(manageEntity == null){ return false;}
        else if(manageEntity.getManagePassword().equals(password)){
            System.out.println(manageEntity.getManagePassword());
            return true;}

        return false;
    }
}
