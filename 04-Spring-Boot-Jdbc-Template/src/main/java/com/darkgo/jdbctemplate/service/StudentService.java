package com.darkgo.jdbctemplate.service;

import com.darkgo.jdbctemplate.Student;

/**
 * @ClassName StudentService
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/30
 * @Version V1.0
 **/
public interface StudentService {

    /**
     * 添加学生
     * @param student
     * @return
     */
    int add(Student student);

    /**
     * 更新
     * @param student
     * @return
     */
    int update(Student student);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     * 查询学生
     * @param id
     * @return
     */
    Student queryStudentById(int id);


}
