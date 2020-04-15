package com.second.olderjpa.service.serviceImpl;

import com.second.olderjpa.dto.BodyDataQuery;
import com.second.olderjpa.entity.BodyDataEntity;
import com.second.olderjpa.repository.BodyDataRepository;
import com.second.olderjpa.repository.data.BasalMetabolismRepository;
import com.second.olderjpa.service.DataService;
import com.second.olderjpa.service.BodyDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


@Service
public class BodyDataServiceImpl implements BodyDataService {
    @Resource
    private BodyDataRepository bodyDataRepository;
    @Resource
    private DataService dataService;

    @Override
    //计算所有指数的总评分
    public Boolean save(BodyDataEntity bodyDataQuery){
        int bmiMark = Integer.valueOf(dataService.findBmiMark(bodyDataQuery.getBmi()));
        int basalMetabolismMark = Integer.valueOf(dataService.findBasalMetabolismMark(bodyDataQuery.getBasalMetabolism()));
        int boneMask = Integer.valueOf(dataService.findBoneMask(bodyDataQuery.getBoneMass()));
        int fatPercentageMark = Integer.valueOf(dataService.findFatPercentageMark(bodyDataQuery.getFatPercentage()));
        int heartRateMark= Integer.valueOf(dataService.findHeartRateMark(bodyDataQuery.getHeartRate()));
        int muscleContentMark  = Integer.valueOf(dataService.findMuscleContentMark(bodyDataQuery.getMuscleContent()));
        int WaterMask = Integer.valueOf( dataService.findWaterMask(bodyDataQuery.getWaterContent()));
        int VisceralFatMask = Integer.valueOf(dataService.findVisceralFatMask(bodyDataQuery.getVisceralFat()));
        int sleepTimeMark = Integer.valueOf(dataService.findSleepTimeMark(bodyDataQuery.getSleepTimer()));
        String Task = String.valueOf((bmiMark + basalMetabolismMark +
                boneMask + fatPercentageMark + heartRateMark + muscleContentMark +
                WaterMask + VisceralFatMask + sleepTimeMark)/9*2);
//        BodyDataEntity bodyDataEntity = new BodyDataEntity();
        bodyDataQuery.setPhysicalAssessment(Task);
//        bodyDataEntity.setBasalMetabolism(bodyDataQuery.getBasalMetabolism());
//        bodyDataEntity.setBmi(bodyDataQuery.getBmi());
//        bodyDataEntity.setBodyId(bodyDataQuery.getBodyId());
        return true;
    }
    @Override
    //计算某个日期所有评级的数量
    public ArrayList<HashMap<String ,Integer>> findAllCount(Date date){

        int count1 = bodyDataRepository.countBodyDataEntitiesByDataDateAndPhysicalAssessmentBetween
                (date,"23","34");
        int count2 = bodyDataRepository.countBodyDataEntitiesByDataDateAndPhysicalAssessmentBetween
                (date,"35","46");

        HashMap<String ,Integer> hashMap = new HashMap<>();
        HashMap<String ,Integer> hashMap1 = new HashMap<>();
        HashMap<String ,Integer> hashMap2 = new HashMap<>();
        HashMap<String ,Integer> hashMap3 = new HashMap<>();
        HashMap<String ,Integer> hashMap4 = new HashMap<>();

        hashMap.put("健康问题严重",count1);
        hashMap1.put("健康问题较严重",count2);
        hashMap2.put("健康问题一般",count2);
        hashMap3.put("健康良好",count2);
        hashMap4.put("十分健康",count2);

        ArrayList<HashMap<String ,Integer>> list = new ArrayList<>();
        list.add(hashMap);
        list.add(hashMap1);
        list.add(hashMap2);
        list.add(hashMap3);
        list.add(hashMap4);

        return list;
    }
    @Override
    //
    public List<BodyDataEntity> findAllByTask(String low ,String high){
        return bodyDataRepository.findAllByPhysicalAssessmentBetween( low, high);
    }


}

