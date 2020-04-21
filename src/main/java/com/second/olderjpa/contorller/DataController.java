package com.second.olderjpa.contorller;

import com.second.olderjpa.dto.data.*;
import com.second.olderjpa.entity.data.*;
import com.second.olderjpa.repository.data.*;
import com.second.olderjpa.service.DataService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Data")
public class DataController {
    @Resource
    private DataService dataService;
    @Resource
    private FatPercentageRepository fatPercentageRepository;
    @Resource
    private  BmiRepository bmiRepository;
    @Resource
    private BasalMetabolismRepository basalMetabolismRepository;
    @Resource
    private HeartRateRepository heartRateRepository;
    @Resource
    private MuscleContentRepository muscleContentRepository;
    @Resource
    private SleepTimeRepository sleepTimeRepository;
    @Resource
    private BoneMassRepository boneMassRepository;
    @Resource
    private VisceralFatRepository visceralFatRepository;
    @Resource
    private WaterContentRepository waterContentRepository;

    @GetMapping("/findBmi")//查找bmi
    public List<BmiEntity> findBmi(){
        List<BmiEntity> list = bmiRepository.findAll();
        return list;
    }
    @PostMapping("/setBmi")
    public BmiEntity setBmiEntity(@RequestBody BmiQuery bmiQuery){
        String id = bmiQuery.getBmiId();
        String x =bmiQuery.getJudgeLevel();
        System.out.println(bmiQuery);
        System.out.println(id);
        System.out.println(x);
        BmiEntity bmiEntity = new BmiEntity();
        bmiEntity.setBmiId(bmiQuery.getBmiId());
        bmiEntity.setJudgeLevel(bmiQuery.getJudgeLevel());
        bmiEntity.setMaxValue(bmiQuery.getMaxValue());
        bmiEntity.setMinValue(bmiQuery.getMinValue());
        bmiEntity.setNumber(bmiQuery.getNumber());
        bmiEntity.setTargetingStrategy(bmiQuery.getTargetingStrategy());
        dataService.setBmi(bmiEntity);
        return bmiEntity;
    }
//    @PostMapping("/setFatPercentage")//设置FatPercentage标准
//    public boolean setFatPercentage(@Param("fat")  Object o){
//        System.out.println(o);
//        return true;
//    }
    @PostMapping("/setFatPercentage")//设置FatPercentage标准
    public FatPercentageEntity setFatPercentage(@RequestBody FatPercentageQuery fatPercentageQuery){
        //Integer id = FatPercentageQuery.getFatPercentageId();
        FatPercentageEntity fatPercentageEntity = new FatPercentageEntity();
        fatPercentageEntity.setFatPercentageId(fatPercentageQuery.getFatPercentageId());
        fatPercentageEntity.setJudgeLevel(fatPercentageQuery.getJudgeLevel());
        fatPercentageEntity.setMaxValue(fatPercentageQuery.getMaxValue());
        fatPercentageEntity.setMinValue(fatPercentageQuery.getMinValue());
        fatPercentageEntity.setTargetingStrategy(fatPercentageQuery.getTargetingStrategy());
        fatPercentageEntity.setNumber(fatPercentageQuery.getNumber());
        fatPercentageEntity.setMean(fatPercentageQuery.getMean());
        fatPercentageEntity.setWork(fatPercentageQuery.getWork());
        dataService.setFatPercentage(fatPercentageEntity);
        return fatPercentageEntity;
    }
    @GetMapping("/findFatPercentage")//查找FatPercentage
    public List<FatPercentageEntity> findFatPercentage(){
        List<FatPercentageEntity> list = fatPercentageRepository.findAll();
        return list;
    }
    @GetMapping("/findBasalMetabolism")//查找BasalMetabolism
    public List<BasalMetabolismEntity> findBasalMetabolism(){
        List<BasalMetabolismEntity> list = basalMetabolismRepository.findAll();
        return list;
    }
    @PostMapping("/setBasalMetabolism")//设置BasalMetabolism标准
    public BasalMetabolismEntity setBasalMetabolism(@RequestBody BasalMetabolismQuery basalMetabolismQuery){
        //Integer id = FatPercentageQuery.getFatPercentageId();
        BasalMetabolismEntity basalMetabolismEntity = new BasalMetabolismEntity();
        basalMetabolismEntity.setBasalMetabolismId(basalMetabolismQuery.getBasalMetabolismId());
        basalMetabolismEntity.setJudgeLevel(basalMetabolismQuery.getJudgeLevel());
        basalMetabolismEntity.setMaxValue(basalMetabolismQuery.getMaxValue());
        basalMetabolismEntity.setMinValue(basalMetabolismQuery.getMinValue());
        basalMetabolismEntity.setTargetingStrategy(basalMetabolismQuery.getTargetingStrategy());
        dataService.setBasalMetabolism(basalMetabolismEntity);
        return basalMetabolismEntity;
    }
    @GetMapping("/findHeartRate")//查找HeartRate
    public List<HeartRateEntity> findHeartRate(){
        List<HeartRateEntity> list = heartRateRepository.findAll();
        return list;
    }
    @PostMapping("/setHeartRate")// 设置heartRate标准
    public HeartRateEntity setHeartRate(@RequestBody HeartRateQuery heartRateQuery){
        //Integer id = FatPercentageQuery.getFatPercentageId();
        HeartRateEntity heartRateEntity = new HeartRateEntity();
        heartRateEntity.setHeartRateId(heartRateQuery.getHeartRateId());
        heartRateEntity.setJudgeLevel(heartRateQuery.getJudgeLevel());
        heartRateEntity.setMaxValue(heartRateQuery.getMaxValue());
        heartRateEntity.setMinValue(heartRateQuery.getMinValue());
        heartRateEntity.setTargetingStrategy(heartRateQuery.getTargetingStrategy());
        dataService.setHeartRate(heartRateEntity);
        return heartRateEntity;
    }
    @GetMapping("/findMuscleContent")//查找HeartRate
    public List<MuscleContentEntity> findMuscleContent(){
        List<MuscleContentEntity> list = muscleContentRepository.findAll();
        return list;
    }
    @PostMapping("/setMuscleContent")//设置MuscleContent标准
    public MuscleContentEntity setMuscleContent(@RequestBody MuscleContentQuery muscleContentQuery){
        //Integer id = FatPercentageQuery.getFatPercentageId();
        MuscleContentEntity muscleContentEntity = new MuscleContentEntity();
        muscleContentEntity.setMuscleContentId(muscleContentQuery.getMuscleContentId());
        muscleContentEntity.setJudgeLevel(muscleContentQuery.getJudgeLevel());
        muscleContentEntity.setMaxValue(muscleContentQuery.getMaxValue());
        muscleContentEntity.setMinValue(muscleContentQuery.getMinValue());
        muscleContentEntity.setTargetingStrategy(muscleContentQuery.getTargetingStrategy());
        dataService.setMuscleContent(muscleContentEntity);
        return muscleContentEntity;
    }
    @GetMapping("/findSleepTime")//查找HeartRate
    public List<SleepTimeEntity> findSleepTime(){
        List<SleepTimeEntity> list = sleepTimeRepository.findAll();
        return list;
    }
    @PostMapping("/setSleepTime")   //设置sleepTime标准
    public SleepTimeEntity setSleepTime(@RequestBody SleepTimeQuery sleepTimeQuery){
        //Integer id = FatPercentageQuery.getFatPercentageId();
        SleepTimeEntity sleepTimeEntity = new SleepTimeEntity();
        sleepTimeEntity.setSleepTimeId(sleepTimeQuery.getSleepTimeId());
        sleepTimeEntity.setJudgeLevel(sleepTimeQuery.getJudgeLevel());
        sleepTimeEntity.setMaxValue(sleepTimeQuery.getMaxValue());
        sleepTimeEntity.setMinValue(sleepTimeQuery.getMinValue());
        sleepTimeEntity.setTargetingStrategy(sleepTimeQuery.getTargetingStrategy());
        dataService.setSleepTime(sleepTimeEntity);
        return sleepTimeEntity;
    }
    @GetMapping("/findBoneMass")//查找HeartRate
    public List<BoneMassEntity> findBoneMass(){
        List<BoneMassEntity> list = boneMassRepository.findAll();
        return list;
    }
    @PostMapping("/setBoneMass")    //设置boneMass 标准
    public BoneMassEntity setBoneMass(@RequestBody BoneMassQuery boneMassQuery){
        //Integer id = FatPercentageQuery.getFatPercentageId();
        BoneMassEntity boneMassEntity = new BoneMassEntity();
        boneMassEntity.setBoneMassId(boneMassQuery.getBoneMassId());
        boneMassEntity.setJudgeLevel(boneMassQuery.getJudgeLevel());
        boneMassEntity.setMaxValue(boneMassQuery.getMaxValue());
        boneMassEntity.setMinValue(boneMassQuery.getMinValue());
        boneMassEntity.setTargetingStrategy(boneMassQuery.getTargetingStrategy());
        dataService.setBoneMass(boneMassEntity);
        return boneMassEntity;
    }
    @GetMapping("/findVisceralFat")//查找HeartRate
    public List<VisceralFatEntity> findVisceralFat(){
        List<VisceralFatEntity> list = visceralFatRepository.findAll();
        return list;
    }
    @PostMapping("/setVisceralFat")//设置visceralFat标准
    public VisceralFatEntity setVisceralFat(@RequestBody VisceralFatQuery visceralFatQuery){
        //Integer id = FatPercentageQuery.getFatPercentageId();
        VisceralFatEntity visceralFatEntity = new VisceralFatEntity();
        visceralFatEntity.setVisceralFatId(visceralFatQuery.getVisceralFatId());
        visceralFatEntity.setJudgeLevel(visceralFatQuery.getJudgeLevel());
        visceralFatEntity.setMaxValue(visceralFatQuery.getMaxValue());
        visceralFatEntity.setMinValue(visceralFatQuery.getMinValue());
        visceralFatEntity.setTargetingStrategy(visceralFatQuery.getTargetingStrategy());
        dataService.setVisceralFat(visceralFatEntity);
        return visceralFatEntity;
    }
    @GetMapping("/findWaterContent")//查找HeartRate
    public List<WaterContentEntity> findWaterContent(){
        List<WaterContentEntity> list = waterContentRepository.findAll();
        return list;
    }
    @PostMapping("/setWaterContent")//设置waterContent 标准
    public WaterContentEntity setWaterContent(@RequestBody WaterContentQuery waterContentQuery){
        //Integer id = FatPercentageQuery.getFatPercentageId();
        WaterContentEntity waterContentEntity = new WaterContentEntity();
        waterContentEntity.setWaterContentId(waterContentQuery.getWaterContentId());
        waterContentEntity.setJudgeLevel(waterContentQuery.getJudgeLevel());
        waterContentEntity.setMaxValue(waterContentQuery.getMaxValue());
        waterContentEntity.setMinValue(waterContentQuery.getMinValue());
        waterContentEntity.setTargetingStrategy(waterContentQuery.getTargetingStrategy());
        dataService.setWaterContent(waterContentEntity);
        return waterContentEntity;
    }
}
