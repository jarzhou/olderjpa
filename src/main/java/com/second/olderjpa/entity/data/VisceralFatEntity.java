package com.second.olderjpa.entity.data;

import javax.persistence.*;


@Entity
@Table(name = "t_visceral")
public class VisceralFatEntity {
    @Id
    @Column(nullable = false,length = 40)
    private Integer visceralFatId;

    //内脏脂肪
    @Column(nullable = false,length = 40)
    private float visceralFat;

    //评级：
    @Column(nullable = false,length = 40)
    private String judgeLevel;

    //针对策略：
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private String targetingStrategy;

    public Integer getVisceralFatId() {
        return visceralFatId;
    }

    public void setVisceralFatId(Integer visceralFatId) {
        this.visceralFatId = visceralFatId;
    }

    public float getVisceralFat() {
        return visceralFat;
    }

    public void setVisceralFat(float visceralFat) {
        this.visceralFat = visceralFat;
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
