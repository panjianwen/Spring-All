package com.darkgo.jdbcmultidatasource.service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName StudentService
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/31
 * @Version V1.0
 **/
public interface StudentService {
    List<Map<String, Object>> getAllStudentsFromMaster();
    List<Map<String, Object>> getAllStudentsFromCluster();
}
