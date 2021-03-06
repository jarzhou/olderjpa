package com.second.olderjpa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_body")
public class BodyDataEntity{
    //id 用int 时间用date 其它char
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "body_id" ,nullable = false)
    private Integer bodyId;

    @Column(nullable = true)
    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dataDate;

    //老人id
    @ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.MERGE})
    @JoinColumn(name = "older_id", nullable = false)
    private OlderEntity OlderEntity;


    @Column(name="older_id", updatable=false, insertable=false)
    private String olderId;//用户id

    //身高
    @Column(nullable = true,length = 40)
    private String tall;

    //体重
    @Column(nullable = true,length = 40)
    private String weight;
    //
    @Column(nullable = true,length = 40)
    private String bmi;

    //体脂率
    @Column(nullable = true,length = 40)
    private String fatPercentage;

    //肌肉含量
    @Column(nullable = true,length = 40)
    private String muscleContent;

    //内脏脂肪：
    @Column(nullable = true,length = 40)
    private String visceralFat;

    //基础代谢:
    @Column(nullable = true,length = 40)
    private  String basalMetabolism;

    //骨量：
    @Column(nullable = true,length = 40)
    private String boneMass;

    //水分；
    @Column(nullable = true,length = 40)
    private String waterContent;

    //心率：
    @Column(nullable = true,length = 40)
    private String heartRate;

    //睡眠时长
    @Column(nullable = true,length = 40)
    private String sleepTimer;

    //身体评估：
    @Column(nullable = true,length = 40)
    private String physicalAssessment;

    //char(表5：康养策略：)
    @Column(nullable = true,length = 40)
    private String systemStrategy;

    //管理员评估与建议：
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private String manageAssessment;

    public Integer getBodyId() {
        return bodyId;
    }

    public void setBodyId(Integer bodyId) {
        this.bodyId = bodyId;
    }

    public Date getDataDate() {
        return dataDate;
    }

    public void setDataDate(Date dataDate) {
        this.dataDate = dataDate;
    }

//    public com.second.olderjpa.entity.OlderEntity getOlderEntity() {
//        return OlderEntity;
//    }
//
//    public void setOlderEntity(com.second.olderjpa.entity.OlderEntity olderEntity) {
//        OlderEntity = olderEntity;
//    }

    public String getOlderId() {
        return olderId;
    }

    public void setOlderId(String olderId) {
        this.olderId = olderId;
    }

    public String getTall() {
        return tall;
    }

    public void setTall(String tall) {
        this.tall = tall;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(String fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public String getMuscleContent() {
        return muscleContent;
    }

    public void setMuscleContent(String muscleContent) {
        this.muscleContent = muscleContent;
    }

    public String getVisceralFat() {
        return visceralFat;
    }

    public void setVisceralFat(String visceralFat) {
        this.visceralFat = visceralFat;
    }

    public String getBasalMetabolism() {
        return basalMetabolism;
    }

    public void setBasalMetabolism(String basalMetabolism) {
        this.basalMetabolism = basalMetabolism;
    }

    public String getBoneMass() {
        return boneMass;
    }

    public void setBoneMass(String boneMass) {
        this.boneMass = boneMass;
    }

    public String getWaterContent() {
        return waterContent;
    }

    public void setWaterContent(String waterContent) {
        this.waterContent = waterContent;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getSleepTimer() {
        return sleepTimer;
    }

    public void setSleepTimer(String sleepTimer) {
        this.sleepTimer = sleepTimer;
    }

    public String getPhysicalAssessment() {
        return physicalAssessment;
    }

    public void setPhysicalAssessment(String physicalAssessment) {
        this.physicalAssessment = physicalAssessment;
    }

    public String getSystemStrategy() {
        return systemStrategy;
    }

    public void setSystemStrategy(String systemStrategy) {
        this.systemStrategy = systemStrategy;
    }

    public String getManageAssessment() {
        return manageAssessment;
    }

    public void setManageAssessment(String manageAssessment) {
        this.manageAssessment = manageAssessment;
    }
}
