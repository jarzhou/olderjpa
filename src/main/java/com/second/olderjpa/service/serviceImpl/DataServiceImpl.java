package com.second.olderjpa.service.serviceImpl;

import com.second.olderjpa.entity.data.*;
import com.second.olderjpa.repository.data.*;
import com.second.olderjpa.service.DataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DataServiceImpl implements DataService {
    @Resource
    private BmiRepository bmiRepository;
    @Resource
    private BasalMetabolismRepository basalMetabolismRepository;
    @Resource
    private BoneMassRepository boneMassRepository;
    @Resource
    private FatPercentageRepository fatPercentageRepository;
    @Resource
    private HeartRateRepository heartRateRepository;
    @Resource
    private MuscleContentRepository muscleContentRepository;
    @Resource
    private SleepTimeRepository sleepTimeRepository;
    @Resource
    private VisceralFatRepository visceralFatRepository;
    @Resource
    private WaterContentRepository waterContentRepository;
    //获取 FatPercentage mask
    public String findFatPercentageMark(String value) {
        float max = Float.parseFloat(value);
        float min =Float.parseFloat(value);
        FatPercentageEntity fatPercentageEntity = fatPercentageRepository.findAllByMaxValueLessThanEqualAndMinValueGreaterThan(min, max);
        return fatPercentageEntity.getJudgeLevel(); }
    //获取 BasalMetabolism mask
    public String findBasalMetabolismMark(String value) {
        float value1 = Float.parseFloat(value);
        float value2 = Float.parseFloat(value);
        BasalMetabolismEntity basalMetabolismEntity = basalMetabolismRepository.findAllByMaxValueLessThanEqualAndMinValueGreaterThan(value1,value2);
        return basalMetabolismEntity.getJudgeLevel(); }
    //获取 heartRate mask
    public String findHeartRateMark(String value) {
        float max = Float.parseFloat(value);
        float min = Float.parseFloat(value);
        HeartRateEntity heartRateEntity = heartRateRepository.findAllByMaxValueLessThanEqualAndMinValueGreaterThan(min, max);
        return heartRateEntity.getJudgeLevel(); }
    //获取 MuscleContent mask
    public String findMuscleContentMark(String value) {
        float max = Float.parseFloat(value);
        float min = Float.parseFloat(value);
        MuscleContentEntity muscleContentEntity = muscleContentRepository.findAllByMaxValueLessThanEqualAndMinValueGreaterThan(min, max);
        return muscleContentEntity.getJudgeLevel(); }
    //获取sleepTime mask
    public String findSleepTimeMark(String value) {
        float max = Float.parseFloat(value);
        float min = Float.parseFloat(value);
        SleepTimeEntity sleepTimeEntity = sleepTimeRepository.findAllByMaxValueLessThanEqualAndMinValueGreaterThan(min, max);
        return sleepTimeEntity.getJudgeLevel(); }
    //获取BMI JudgeLevel mask
    public String findBmiMark(String value) {
        float max = Float.parseFloat(value);
        float min = Float.parseFloat(value);
        BmiEntity bmiEntity = bmiRepository.findAllByMaxValueLessThanEqualAndMinValueGreaterThan(min, max);
        return bmiEntity.getJudgeLevel(); }
    //获取boneMass mask
    public String findBoneMask(String value){
        float max = Float.parseFloat(value);
        float min =Float.parseFloat(value);
        BoneMassEntity boneMassEntity = boneMassRepository.findAllByMaxValueLessThanEqualAndMinValueGreaterThan(min, max);
        return boneMassEntity.getJudgeLevel();
    }
    //获取visceralFat mask
    public String findVisceralFatMask(String value){
        float max = Float.parseFloat(value);
        float min = Float.parseFloat(value);
        VisceralFatEntity visceralFatEntity = visceralFatRepository.findAllByMaxValueLessThanEqualAndMinValueGreaterThan(min, max);
        return visceralFatEntity.getJudgeLevel();
    }
    //获取waterContent mask
    public String findWaterMask(String value){
        float max = Float.parseFloat(value);
        float min = Float.parseFloat(value);
        WaterContentEntity waterContent = waterContentRepository.findAllByMaxValueLessThanEqualAndMinValueGreaterThan(min, max);
        return waterContent.getJudgeLevel();
    }
    /*
    获取BMI JudgeLevel mask
     */
    public String findMask(String value) {
        float max = Float.valueOf(value);
        float min = Float.valueOf(value);
        return bmiRepository.findAllByMaxValueLessThanEqualAndMinValueGreaterThan(min,max).getJudgeLevel();
    }
//    //设置bmi标准
//    public BmiEntity setBmi(){
//        return bmiRepository.saveAll(bmiEntity);
//    }


}
