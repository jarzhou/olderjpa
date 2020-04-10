package com.second.olderjpa.entity.data;


import javax.persistence.*;

@Entity
@Table(name = "t_fat")
public class FatPercentageEntity {
    @Id
    @Column(nullable = false,length = 40)
    private Integer fatPercentageId;

    //体脂率
    //数值区间：30+—20；
    @Column(nullable = false,length = 40)
    private Float minValue;
    @Column(nullable = false,length = 40)
    private Float maxValue;

    //评级：
    @Column(nullable = false,length = 40)
    private String judgeLevel;

    //针对策略：
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private String targetingStrategy;


    public Integer getFatPercentageId() {
        return fatPercentageId;
    }

    public void setFatPercentageId(Integer fatPercentageId) {
        this.fatPercentageId = fatPercentageId;
    }


    public Float getMinValue() {
        return minValue;
    }

    public void setMinValue(Float minValue) {
        this.minValue = minValue;
    }

    public Float getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Float maxValue) {
        this.maxValue = maxValue;
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
