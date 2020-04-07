package com.second.olderjpa.service.serviceImpl;

import com.second.olderjpa.entity.data.BmiEntity;
import com.second.olderjpa.repository.data.BmiRepository;
import com.second.olderjpa.service.DataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DataServiceImpl implements DataService {
    @Resource
    private BmiRepository bmiRepository;


    public String findMarksByValue(String value) {
        float m = Float.parseFloat(value);
        float max = m + 2;
        float min = m - 2;
        BmiEntity bmiEntity = bmiRepository.findBmiEntityByMaxValueBetween(min, max);
        return bmiEntity.getJudgeLevel();

    }

}
