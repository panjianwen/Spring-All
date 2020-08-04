package com.darkgo.ehcache.mapper;

import com.darkgo.ehcache.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Component;

/**
 * @ClassName StudentMapper
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/29
 * @Version V1.0
 **/
@Component
@Mapper
public interface StudentMapper {
    /**
     * 添加学生
     * @param student
     * @return
     */
    @Insert("insert into student(name,gender)values(#{name},#{gender})")
    int add(Student student);

    /**
     * 更新
     * @param student
     * @return
     */
    @Update("update student set name = #{name} ,gender = #{gender} where id = #{id}")
    int update(Student student);

    /**
     * 删除
     * @param id
     * @return
     */
    @Delete("delete from  student where id = #{id}")
    int deleteById(int id);

    /**
     * 查询学生
     * @param id
     * @return
     */
    @Select("select * from student where id = #{id}")
    @Results(id = "student",value = {
            @Result(property = "id",column = "id",javaType = Integer.class),
            @Result(property = "name",column = "name",javaType = String.class),
            @Result(property = "gender",column = "gender",javaType = String.class)
    })
    Student queryStudentById(int id);
}
