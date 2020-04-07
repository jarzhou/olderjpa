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
        float m = Float.parseFloat(value);
        float max = m + 2;
        float min = m - 2;
        FatPercentageEntity fatPercentageEntity = fatPercentageRepository.findFatPercentageEntityByFatPercentageBetween(min, max);
        return fatPercentageEntity.getJudgeLevel(); }
    //获取 BasalMetabolism mask
    public String findBasalMetabolismMark(String value) {
        float m = Float.parseFloat(value);
        float max = m + 2;
        float min = m - 2;
        BasalMetabolismEntity basalMetabolismEntity = basalMetabolismRepository.findBasalMetabolismEntityByBasalMetabolismBetween(min, max);
        return basalMetabolismEntity.getJudgeLevel(); }
    //获取 heartRate mask
    public String findHeartRateMark(String value) {
        float m = Float.parseFloat(value);
        float max = m + 2;
        float min = m - 2;
        HeartRateEntity heartRateEntity = heartRateRepository.findHeartRateEntityByHeartRateBetween(min, max);
        return heartRateEntity.getJudgeLevel(); }
    //获取 MuscleContent mask
    public String findMuscleContentMark(String value) {
        float m = Float.parseFloat(value);
        float max = m + 2;
        float min = m - 2;
        MuscleContentEntity muscleContentEntity = muscleContentRepository.findMuscleContentEntityByMuscleContentBetween(min, max);
        return muscleContentEntity.getJudgeLevel(); }
    //获取sleepTime mask
    public String findSleepTimeMark(String value) {
        float m = Float.parseFloat(value);
        float max = m + 2;
        float min = m - 2;
        SleepTimeEntity sleepTimeEntity = sleepTimeRepository.findSleepTimeEntityBySleepTimeBetween(min, max);
        return sleepTimeEntity.getJudgeLevel(); }
    //获取BMI JudgeLevel mask
    public String findBmiMark(String value) {
        float m = Float.parseFloat(value);
        float max = m + 2;
        float min = m - 2;
        BmiEntity bmiEntity = bmiRepository.findBmiEntityByMaxValueBetween(min, max);
        return bmiEntity.getJudgeLevel(); }
    //获取boneMass mask
    public String findBoneMask(String value){
        float m = Float.parseFloat(value);
        float max = m + 2;
        float min = m - 2;
        BoneMassEntity boneMassEntity = boneMassRepository.findBoneMassEntitiesByBoneMassBetween(min, max);
        return boneMassEntity.getJudgeLevel();
    }
    //获取visceralFat mask
    public String findVisceralFatMask(String value){
        float m = Float.parseFloat(value);
        float max = m + 2;
        float min = m - 2;
        VisceralFatEntity visceralFatEntity = visceralFatRepository.findVisceralFatEntityByVisceralFatBetween(min, max);
        return visceralFatEntity.getJudgeLevel();
    }
    //获取waterContent mask
    public String findWaterMask(String value){
        float m = Float.parseFloat(value);
        float max = m + 2;
        float min = m - 2;
        WaterContentEntity waterContent = waterContentRepository.findWaterContentEntityByWaterContentBetween(min, max);
        return waterContent.getJudgeLevel();
    }

}
