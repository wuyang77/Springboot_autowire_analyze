package com.wuyang.uitl;

import org.springframework.stereotype.Component;

@Component
public class CodeUtils {
  private String [] patch = {"000000", "00000", "0000", "000", "00", "0", ""};
  /**
   * 根据手机号生成固定长度的验证码
   * @param number
   * @return
   */
  public String encrypt(String number) {
    int hash = number.hashCode();
    int encryption = 20231007;
    long result = hash ^ encryption;
    long nowTime = System.currentTimeMillis();
    result = result ^ nowTime;
    long code = result % 1000000;
    code = code < 0 ? -code : code;
    String codeString = code + "";
    int len = codeString.length();
    return patch[len] + codeString;
  }
}
