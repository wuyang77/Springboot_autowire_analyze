package com.wuyang;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskApp {
  public static void main(String[] args) {
    Timer timer = new Timer();
    TimerTask timerTask = new TimerTask() {
      @Override
      public void run() {
        System.out.println("this is running ... ");
      }
    };
    timer.schedule(timerTask, 0,  2000);
  }
}
