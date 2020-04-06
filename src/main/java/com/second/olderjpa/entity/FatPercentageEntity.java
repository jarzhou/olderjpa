package com.second.olderjpa.entity;


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
    private String judge_level;

    //针对策略：
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private String targetingStrategy;

    @Override
    public String toString() {
        return "FatPercentageEntity{" +
                "fatPercentageId=" + fatPercentageId +
                ", fatPercentage=" + fatPercentage +
                ", judge_level='" + judge_level + '\'' +
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

    public String getJudge_level() {
        return judge_level;
    }

    public void setJudge_level(String judge_level) {
        this.judge_level = judge_level;
    }

    public String getTargetingStrategy() {
        return targetingStrategy;
    }

    public void setTargetingStrategy(String targetingStrategy) {
        this.targetingStrategy = targetingStrategy;
    }
}
