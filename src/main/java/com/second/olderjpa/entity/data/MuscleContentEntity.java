package com.second.olderjpa.entity.data;

import javax.persistence.*;


@Entity
@Table(name = "t_muscle")
public class MuscleContentEntity {

    @Id
    @Column(nullable = false,length = 40)
    private Integer muscleContentId;

    //心率
    @Column(nullable = false,length = 40)
    private float muscleContent;

    //评级：
    @Column(nullable = false,length = 40)
    private String judgeLevel;

    //针对策略：
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private String targetingStrategy;

    public Integer getMuscleContentId() {
        return muscleContentId;
    }

    public void setMuscleContentId(Integer muscleContentId) {
        this.muscleContentId = muscleContentId;
    }

    public float getMuscleContent() {
        return muscleContent;
    }

    public void setMuscleContent(float muscleContent) {
        this.muscleContent = muscleContent;
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
