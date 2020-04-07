package com.second.olderjpa.entity.data;

import javax.persistence.*;


@Entity
@Table(name = "t_basal")
public class BasalMetabolismEntity {
    @Id
    @Column(nullable = false,length = 40)
    private Integer basalMetabolismId;

    //基础代谢
    @Column(nullable = false,length = 40)
    private float basalMetabolism;

    //评级：
    @Column(nullable = false,length = 40)
    private String judgeLevel;

    //针对策略：
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private String targetingStrategy;

    public Integer getBasalMetabolismId() {
        return basalMetabolismId;
    }

    public void setBasalMetabolismId(Integer basalMetabolismId) {
        this.basalMetabolismId = basalMetabolismId;
    }

    public float getBasalMetabolism() {
        return basalMetabolism;
    }

    public void setBasalMetabolism(float basalMetabolism) {
        this.basalMetabolism = basalMetabolism;
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
