package com.second.olderjpa.contorller;

import com.second.olderjpa.dto.data.BmiQuery;
import com.second.olderjpa.entity.data.BmiEntity;
import com.second.olderjpa.service.DataService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/Data")
public class DataController {
    @Resource
    private DataService dataService;

    @PostMapping("/setBmi")
    public BmiEntity setBmiEntity(@RequestBody BmiQuery bmiQuery){
        Integer id = bmiQuery.getBmiId();
        BmiEntity bmiEntity = new BmiEntity();
        bmiEntity.setBmiId(bmiQuery.getBmiId());
        bmiEntity.setJudgeLevel(bmiQuery.getJudgeLevel());
        bmiEntity.setMaxValue(bmiQuery.getMaxValue());
        bmiEntity.setMinValue(bmiQuery.getMinValue());
        bmiEntity.setTargetingStrategy(bmiQuery.getTargetingStrategy());
        dataService.setBmi(bmiEntity);
        return bmiEntity;
    }
}
