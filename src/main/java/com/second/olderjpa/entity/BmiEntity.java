package com.second.olderjpa.entity;
import javax.persistence.*;
import javax.xml.soap.Text;

@Entity
@Table
public class BmiEntity {
    //id 用int 时间用date  其它char
    @Id
    @Column(nullable = false,length = 40)
    private Integer bmiId;

    //数值区间：30+—20；
    @Column(nullable = false,length = 40)
    private String minValue;
    @Column(nullable = false,length = 40)
    private String maxValue;

    //评级：
    @Column(nullable = false,length = 40)
    private String judgeLevel;

    //char(ABCDE)
    //针对策略：text
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private Text targetingStrategy;

    public Integer getBmiId() {
        return bmiId;
    }

    public void setBmiId(Integer bmiId) {
        this.bmiId = bmiId;
    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public String getJudgeLevel() {
        return judgeLevel;
    }

    public void setJudgeLevel(String judgeLevel) {
        this.judgeLevel = judgeLevel;
    }

    public Text getTargetingStrategy() {
        return targetingStrategy;
    }

    public void setTargetingStrategy(Text targetingStrategy) {
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
