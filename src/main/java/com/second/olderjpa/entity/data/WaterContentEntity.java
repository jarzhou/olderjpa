package com.second.olderjpa.entity.data;

import javax.persistence.*;


@Entity
@Table(name = "t_water")
public class WaterContentEntity {
    @Id
    @Column(nullable = false,length = 40)
    private Integer waterContentId;

    //水分
    @Column(nullable = false,length = 40)
    private float waterContent;

    //评级：
    @Column(nullable = false,length = 40)
    private String judgeLevel;

    //针对策略：
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private String targetingStrategy;

    public Integer getWaterContentId() {
        return waterContentId;
    }

    public void setWaterContentId(Integer waterContentId) {
        this.waterContentId = waterContentId;
    }

    public float getWaterContent() {
        return waterContent;
    }

    public void setWaterContent(float waterContent) {
        this.waterContent = waterContent;
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
