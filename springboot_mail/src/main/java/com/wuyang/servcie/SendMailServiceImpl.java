package com.wuyang.servcie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

//@Service
public class SendMailServiceImpl implements SendMailService{
  @Autowired
  private JavaMailSender javaMailSender;
  // 标题
  private String subject = "测试邮件";
  // 正文
  private String context = "测试邮件的正文内容:吴洋哇塞6666";
  @Override
  public void sendMail() {
    SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
    simpleMailMessage.setFrom(from+"(小甜甜)");
    simpleMailMessage.setTo(to);
    simpleMailMessage.setSubject(subject);
    simpleMailMessage.setText(context);
    javaMailSender.send(simpleMailMessage);
  }
  // 发送人
  private String from = "2388958622@qq.com";
  // 接收人
  private String to = "1364075113@qq.com";

}
