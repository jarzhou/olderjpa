package com.second.olderjpa.entity;
import javax.persistence.*;
import javax.xml.soap.Text;

@Entity
@Table(name = "t_bmi")
public class BmiEntity {
    //id 用int 时间用date  其它char
    @Id
    @Column(nullable = false,length = 40)
    private Integer bmiId;

    //数值区间：30+—20；
    @Column(nullable = false,length = 40)
    private Float minValue;
    @Column(nullable = false,length = 40)
    private Float maxValue;

    //评级：
    @Column(nullable = false,length = 40)
    private String judgeLevel;

    //char(ABCDE)
    //针对策略：text
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private String targetingStrategy;

    public Integer getBmiId() {
        return bmiId;
    }

    public void setBmiId(Integer bmiId) {
        this.bmiId = bmiId;
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

    @Override
    public String toString() {
        return "BmiEntity{" +
                "bmiId=" + bmiId +
                ", minValue='" + minValue + '\'' +
                ", maxValue='" + maxValue + '\'' +
                ", judgeLevel='" + judgeLevel + '\'' +
                ", targetingStrategy=" + targetingStrategy +
                '}';
    }
}
