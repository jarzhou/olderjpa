package com.second.olderjpa.entity.data;

import javax.persistence.*;

@Entity
@Table(name = "t_sleep")
public class SleepTimeEntity{
    @Id
    @Column(nullable = false,length = 40)
    private Integer sleepTimeId;

    //睡眠时长
    @Column(nullable = false,length = 40)
    private float sleepTime;

    //评级：
    @Column(nullable = false,length = 40)
    private String judgeLevel;

    //针对策略：
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private String targetingStrategy;

    public Integer getSleepTimeId() {
        return sleepTimeId;
    }

    public void setSleepTimeId(Integer sleepTimeId) {
        this.sleepTimeId = sleepTimeId;
    }

    public float getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(float sleepTime) {
        this.sleepTime = sleepTime;
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
