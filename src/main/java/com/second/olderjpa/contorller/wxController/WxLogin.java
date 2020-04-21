package com.second.olderjpa.contorller.wxController;

import com.second.olderjpa.entity.ManageEntity;
import com.second.olderjpa.entity.OlderEntity;
import com.second.olderjpa.repository.ManageRepository;
import com.second.olderjpa.repository.OlderRepository;
import com.second.olderjpa.service.OlderService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/wxLogin")
public class WxLogin {
    @Resource
    private OlderService olderService;
    @Resource
    private OlderRepository olderRepository;
    @PostMapping("/getLogin")
    public boolean getLogin(@Param("id") String id, @Param("passwords") String passwords){
        System.out.println(id);
        System.out.println(passwords);
        int id1 = Integer.valueOf(id);
        System.out.println(id1);
        OlderEntity olderEntity = olderRepository.findAllByOlderId(id1);
        System.out.println(olderEntity);
        if(olderEntity == null){ return false;}
        else if(olderEntity.getOlderPassword().equals(passwords)){
            System.out.println(olderEntity.getOlderPassword());
            return true;}
        return false;
}
}

