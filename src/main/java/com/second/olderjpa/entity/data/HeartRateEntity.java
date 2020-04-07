package com.second.olderjpa.entity.data;

import javax.persistence.*;


@Entity
@Table(name = "t_heart")
public class HeartRateEntity {
    @Id
    @Column(nullable = false,length = 40)
    private Integer heartRateId;

    //心率
    @Column(nullable = false,length = 40)
    private float heartRate;

    //评级：
    @Column(nullable = false,length = 40)
    private String judgeLevel;

    //针对策略：
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private String targetingStrategy;

    public Integer getHeartRateId() {
        return heartRateId;
    }

    public void setHeartRateId(Integer heartRateId) {
        this.heartRateId = heartRateId;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public String getJudgeLevel() {
        return judgeLevel;
    }

    public void setJudgeLevel(String judgeLevel) {
        this.judgeLevel = judgeLevel;
    }

    public String getTargetingStrategy() {
        return targetingStrategy;
    }

    public void setTargetingStrategy(String targetingStrategy) {
        this.targetingStrategy = targetingStrategy;
    }
}
