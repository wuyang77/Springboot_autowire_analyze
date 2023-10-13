package com.wuyang.servcie;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class SendMailServiceImpl2 implements SendMailService{
  @Autowired
  private JavaMailSender javaMailSender;
  // 标题
  private String subject = "测试邮件";
  // 正文
  private String context1 = "<a href='https://www.huya.com/'>点开有惊喜</a>吴洋哇塞6666";
  private String context2 = "hello,这是测试图片:<img src='https://img95.699pic.com/photo/50109/9609.jpg_wh860.jpg'>";
  @Override
  public void sendMail() {
    try {
      MimeMessage mimeMessage = javaMailSender.createMimeMessage();
      MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
      helper.setFrom(from+"(小甜甜)");
      helper.setTo(to);
      helper.setSubject(subject);
      helper.setText(context1, true);
      helper.setText(context2, true);
      // 添加附件
      File f1 = new File("E:\\code\\Springboot\\springboot_mail\\target\\springboot_mail-0.0.1-SNAPSHOT.jar");
      System.out.println(f1.getAbsoluteFile());
      File f2 = new File("E:\\code\\Springboot\\springboot_mail\\src\\main\\resources\\img.png");
      System.out.println(f2.getAbsolutePath());
      helper.addAttachment(f1.getName(), f1);
      helper.addAttachment("java要死人的.png", f2);
      javaMailSender.send(mimeMessage);
    } catch (MessagingException e) {
      throw new RuntimeException(e);
    }
  }
  // 发送人
  private String from = "2388958622@qq.com";
  // 接收人
  private String to = "929964520@qq.com";

}
