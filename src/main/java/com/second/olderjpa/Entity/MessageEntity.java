//package com.second.olderjpa.Entity;
//
//
//import org.springframework.stereotype.Component;
//
//import javax.xml.soap.Text;
//import java.util.Date;
//
//@Component
//public class MessageEntity {
//    //id 用int 时间用date  其它char
//    //消息：
//    private Integer messageId;
//    //创建时间
//    private Date messageCreate;
//    //创建人id
//    private Integer createPerson;
//    //接收人id
//    private Integer receivePerson;
//    //内容
//    private Text content;
//
//    @Override
//    public String toString() {
//        return "MessageEntity{" +
//                "messageId=" + messageId +
//                ", messageCreate=" + messageCreate +
//                ", createPerson=" + createPerson +
//                ", receivePerson=" + receivePerson +
//                ", content=" + content +
//                '}';
//    }
//
//    public Integer getMessageId() {
//        return messageId;
//    }
//
//    public void setMessageId(Integer messageId) {
//        this.messageId = messageId;
//    }
//
//    public Date getMessageCreate() {
//        return messageCreate;
//    }
//
//    public void setMessageCreate(Date messageCreate) {
//        this.messageCreate = messageCreate;
//    }
//
//    public Integer getCreatePerson() {
//        return createPerson;
//    }
//
//    public void setCreatePerson(Integer createPerson) {
//        this.createPerson = createPerson;
//    }
//
//    public Integer getReceivePerson() {
//        return receivePerson;
//    }
//
//    public void setReceivePerson(Integer receivePerson) {
//        this.receivePerson = receivePerson;
//    }
//
//    public Text getContent() {
//        return content;
//    }
//
//    public void setContent(Text content) {
//        this.content = content;
//    }
//}
