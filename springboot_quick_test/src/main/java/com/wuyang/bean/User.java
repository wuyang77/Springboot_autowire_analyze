package com.wuyang.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @TableName user
 */
@Component
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String nickname;
    private String avatar;
    private String email;
    private String tel;
    private Date create_time;
    private Date update_time;
    private Date delete_time;
}