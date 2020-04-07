package com.second.olderjpa.entity.data;

import javax.persistence.*;


@Entity
@Table(name = "t_bone")
public class BoneMassEntity {
    @Id
    @Column(nullable = false,length = 40)
    private Integer boneMassId;

    //骨量
    @Column(nullable = false,length = 40)
    private float    boneMass;

    //评级：
    @Column(nullable = false,length = 40)
    private String judgeLevel;

    //针对策略：
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private String targetingStrategy;


    public Integer getBoneMassId() {
        return boneMassId;
    }

    public void setBoneMassId(Integer boneMassId) {
        this.boneMassId = boneMassId;
    }

    public float getBoneMass() {
        return boneMass;
    }

    public void setBoneMass(float boneMass) {
        this.boneMass = boneMass;
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
