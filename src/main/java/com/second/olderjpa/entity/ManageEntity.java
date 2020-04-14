package com.second.olderjpa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "t_manage")
public class ManageEntity {
    //id 用int 时间用date  其它char
    //管理员：
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private Integer id;

    //工号
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private String workerNumber;
    //姓名
    @Column(length = 20, unique = false,nullable = false)
    private String workerName;
    //密码
    @Column(nullable = false)
    private String managePassword;
    //入职时间
    @Column(unique = false)
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date workTime;
    //工作评级：
    @Column(length = 40, unique = false,nullable = false)
    private String workLevel;
    //联系方式:
    @Column(length = 40, unique = false,nullable = false)
    private String workerPhone;
    //家庭住址:
    @Column(length = 40, unique = false,nullable = false)
    private String workerAddress;
    //分组：
    @Column(length = 20, unique = false,nullable = false)
    private Integer groupId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkerNumber() {
        return workerNumber;
    }

    public void setWorkerNumber(String workerNumber) {
        this.workerNumber = workerNumber;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getManagePassword() {
        return managePassword;
    }

    public void setManagePassword(String managePassword) {
        this.managePassword = managePassword;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public String getWorkLevel() {
        return workLevel;
    }

    public void setWorkLevel(String workLevel) {
        this.workLevel = workLevel;
    }

    public String getWorkerPhone() {
        return workerPhone;
    }

    public void setWorkerPhone(String workerPhone) {
        this.workerPhone = workerPhone;
    }

    public String getWorkerAddress() {
        return workerAddress;
    }

    public void setWorkerAddress(String workerAddress) {
        this.workerAddress = workerAddress;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
