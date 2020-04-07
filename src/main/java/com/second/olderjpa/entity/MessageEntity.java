package com.second.olderjpa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.xml.soap.Text;
import java.util.Date;

@Entity
@Table(name = "t_message")
public class MessageEntity {
    //id 用int 时间用date  其它char
    //消息：
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer messageId;
    //创建时间
    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date messageCreate;
    //创建人id
    private Integer createPerson;
    //接收人id
    private Integer receivePerson;
    //内容
    @Lob
    @Column(columnDefinition="TEXT",nullable = true)
    private String content;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Date getMessageCreate() {
        return messageCreate;
    }

    public void setMessageCreate(Date messageCreate) {
        this.messageCreate = messageCreate;
    }

    public Integer getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(Integer createPerson) {
        this.createPerson = createPerson;
    }

    public Integer getReceivePerson() {
        return receivePerson;
    }

    public void setReceivePerson(Integer receivePerson) {
        this.receivePerson = receivePerson;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
