package com.second.olderjpa.entity.data;


import javax.persistence.*;

@Entity
@Table(name = "t_fat")
public class FatPercentageEntity {
    @Id
    @Column(nullable = false,length = 40)
    private Integer fatPercentageId;

    //体脂率
    @Column(nullable = false,length = 40)
    private float fatPercentage;

    //评级：
    @Column(nullable = false,length = 40)
    private String judgeLevel;

    //针对策略：
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private String targetingStrategy;

    @Override
    public String toString() {
        return "FatPercentageEntity{" +
                "fatPercentageId=" + fatPercentageId +
                ", fatPercentage=" + fatPercentage +
                ", judgeLevel='" + judgeLevel + '\'' +
                ", targetingStrategy='" + targetingStrategy + '\'' +
                '}';
    }

    public Integer getFatPercentageId() {
        return fatPercentageId;
    }

    public void setFatPercentageId(Integer fatPercentageId) {
        this.fatPercentageId = fatPercentageId;
    }

    public float getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(float fatPercentage) {
        this.fatPercentage = fatPercentage;
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
