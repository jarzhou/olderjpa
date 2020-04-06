package com.second.olderjpa.service.serviceImpl;

import com.second.olderjpa.entity.BodyDataEntity;
import com.second.olderjpa.repository.BmiRepository;
import com.second.olderjpa.repository.BodyDataRepository;
import com.second.olderjpa.service.BmiService;
import com.second.olderjpa.service.BodyDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class BodyDataServiceImpl implements BodyDataService {
    @Resource
    private BodyDataRepository bodyDataRepository;
    @Resource
    private BmiService bmiService;
    @Override
    public BodyDataEntity save(BodyDataEntity bodyDataEntity){
        String bmiTask = bmiService.findMarksByValue(bodyDataEntity.getBmi());

        bodyDataEntity.setPhysicalAssessment(bmiTask);
        return bodyDataRepository.save(bodyDataEntity);
    }
}