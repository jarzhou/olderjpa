package com.second.olderjpa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_older")
public class OlderEntity {
    //id 用int 时间用date  其它char
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer olderId;

    @Column(nullable = true,length = 40)
    private String olderName;
    // 姓名

    @Column(nullable = true)
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date birthday;
    //出生日期：

    @Column(nullable = true,length = 40)
    private String olderPhone;
    //联系方式

    @Column(nullable = true,length = 40)
    private String olderPassword;
    //密码

    @Column(nullable = true,length = 40)
    private String family;
    //亲属

    @Column(nullable = true,length = 40)
    private String familyPhone;
    //char，亲属手机

    @Column(nullable = true,length = 40)
    private String olderAddress;
    // char，家庭住址

    @Column(nullable = true,length = 40)
    private Integer groupId;
    //int,分组：

    @Column(nullable = true)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date checkinDate;
    //date,入住时间：

    @Column(nullable = true)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date leaveDate;
    //date,离开时间：


    @Override
    public String toString() {
        return "OlderEntity{" +
                "olderId=" + olderId +
                ", olderName='" + olderName + '\'' +
                ", birthday=" + birthday +
                ", olderPhone='" + olderPhone + '\'' +
                ", olderPassword='" + olderPassword + '\'' +
                ", family='" + family + '\'' +
                ", familyPhone='" + familyPhone + '\'' +
                ", olderAddress='" + olderAddress + '\'' +
                ", groupId=" + groupId +
                ", checkinDate=" + checkinDate +
                ", leaveDate=" + leaveDate +
                '}';
    }

    public Integer getOlderId() {
        return olderId;
    }

    public String getOlderName() {
        return olderName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getOlderPhone() {
        return olderPhone;
    }

    public String getOlderPassword() {
        return olderPassword;
    }

    public String getFamily() {
        return family;
    }

    public String getFamilyPhone() {
        return familyPhone;
    }

    public String getOlderAddress() {
        return olderAddress;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setOlderId(Integer olderId) {
        this.olderId = olderId;
    }

    public void setOlderName(String olderName) {
        this.olderName = olderName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setOlderPhone(String olderPhone) {
        this.olderPhone = olderPhone;
    }

    public void setOlderPassword(String olderPassword) {
        this.olderPassword = olderPassword;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setFamilyPhone(String familyPhone) {
        this.familyPhone = familyPhone;
    }

    public void setOlderAddress(String olderAddress) {
        this.olderAddress = olderAddress;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }
}
