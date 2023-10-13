package com.wuyang;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyQuartz extends QuartzJobBean {

  @Override
  protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
    System.out.println("this is runining ... ");
  }
}
