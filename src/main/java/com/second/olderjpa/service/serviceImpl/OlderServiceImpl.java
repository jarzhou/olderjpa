package com.second.olderjpa.service.serviceImpl;

import com.second.olderjpa.entity.OlderEntity;
import com.second.olderjpa.repository.ManageRepository;
import com.second.olderjpa.repository.OlderRepository;
import com.second.olderjpa.service.OlderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class OlderServiceImpl implements OlderService {

    @Resource
    private OlderRepository olderRepository;

    public OlderEntity findAllById(Integer id){
        return  olderRepository.findAllByOlderId(id);
    }

}
