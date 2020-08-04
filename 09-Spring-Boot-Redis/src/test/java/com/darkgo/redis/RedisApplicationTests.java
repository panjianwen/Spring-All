package com.darkgo.redis;

import com.darkgo.redis.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        Student student1 = this.studentService.queryStudentBySno(2);
        System.out.println("学号" + student1.getId() + "的学生姓名为：" + student1.getName());
//        stringRedisTemplate.opsForValue().set("2",student1.toString());

        student1.setName("康康");
        studentService.update(student1);

        Student student2 = this.studentService.queryStudentBySno(2);
        System.out.println("学号" + student2.getId() + "的学生姓名为：" + student2.getName());
    }

    @Test
    void test1() {
        Student student1 = this.studentService.queryStudentBySno(2);
        System.out.println("学号" + student1.getId() + "的学生姓名为：" + student1.getName());

        Student student2 = this.studentService.queryStudentBySno(2);
        System.out.println("学号" + student2.getId() + "的学生姓名为：" + student2.getName());
    }

}
