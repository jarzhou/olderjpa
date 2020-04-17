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

    //获取BMI JudgeLevel mask
    //String findMask(String value);

    //设置bmi标准
    BmiEntity setBmi(BmiEntity bmiEntity);
    //设置FatPercentage标准
    FatPercentageEntity setFatPercentage(FatPercentageEntity fatPercentageEntity);
    //设置BasalMetabolism标准
    BasalMetabolismEntity setBasalMetabolism(BasalMetabolismEntity basalMetabolismEntity);
    //设置heartRate标准
    HeartRateEntity setHeartRate(HeartRateEntity heartRateEntity);
    //设置MuscleContent标准
    MuscleContentEntity setMuscleContent(MuscleContentEntity muscleContentEntity);
    //设置sleepTime标准
    SleepTimeEntity setSleepTime(SleepTimeEntity sleepTimeEntity);
    //设置boneMass 标准
    BoneMassEntity setBoneMass(BoneMassEntity boneMassEntity);
    //设置visceralFat标准
    VisceralFatEntity setVisceralFat(VisceralFatEntity visceralFatEntity);
    //设置waterContent 标准
    WaterContentEntity setWaterContent(WaterContentEntity waterContentEntity);
}
