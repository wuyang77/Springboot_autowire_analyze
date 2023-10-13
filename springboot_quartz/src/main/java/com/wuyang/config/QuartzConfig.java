package com.wuyang.config;

import com.wuyang.MyQuartz;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.ScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
  @Bean
  public JobDetail jobDetail() {
    // 绑定具体的工作
    return JobBuilder
        .newJob(MyQuartz.class)
        .storeDurably()
        .build();
  }
  @Bean
  public Trigger trigger() {
    // 绑定对应的工作明细
    ScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/15 * * * * ?");
    return TriggerBuilder
        .newTrigger()
        .forJob(jobDetail())
        .withSchedule(scheduleBuilder)
        .build();
  }
}
