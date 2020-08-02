package com.darkgo.aoplog.dao;

import com.darkgo.aoplog.domain.SysLog;

/**
 * @ClassName LogDao
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/31
 * @Version V1.0
 **/
public interface SysLogDao {
    void saveSysLog(SysLog syslog);
}
