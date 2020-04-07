package com.second.olderjpa.service;

import com.second.olderjpa.entity.data.*;

public interface DataService {

    String findFatPercentageMark(String value);

    String findBasalMetabolismMark(String value);
    //获取 heartRate mask
    String findHeartRateMark(String value);
    //获取 MuscleContent mask
    String findMuscleContentMark(String value);
    //获取sleepTime mask
    String findSleepTimeMark(String value);
    //获取BMI JudgeLevel mask
    String findBmiMark(String value);
    //获取boneMass mask
    String findBoneMask(String value);
    //获取visceralFat mask
    String findVisceralFatMask(String value);
    //获取waterContent mask
    String findWaterMask(String value);

}
