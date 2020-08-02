package com.darkgo.aoplog.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName SysLog
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/31
 * @Version V1.0
 **/
@Data
public class SysLog implements Serializable {
    private Integer id;
    private String username;
    private String operation;
    private Integer time;
    private String method;
    private String params;
    private String ip;
    private Date createTime;
}
