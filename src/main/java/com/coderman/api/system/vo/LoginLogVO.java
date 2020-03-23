package com.coderman.api.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author zhangyukang
 * @Date 2020/3/22 21:04
 * @Version 1.0
 **/
@Data
public class LoginLogVO {
    private Long id;

    private String userName;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date loginTime;

    private String location;

    private String ip;

    private String userSystem;

    private String userBrowser;
}
