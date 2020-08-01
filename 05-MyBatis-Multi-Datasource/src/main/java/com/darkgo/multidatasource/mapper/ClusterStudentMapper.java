package com.darkgo.multidatasource.mapper;

import com.darkgo.multidatasource.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ClassName MasterStudentMapper
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/30
 * @Version V1.0
 **/
@Mapper
public interface ClusterStudentMapper {
    List<Map<String, Object>> getAllStudents();
}
