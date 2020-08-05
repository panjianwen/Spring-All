package com.darkgo.test.controller;

import com.darkgo.test.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author pan
 * @Date 2020/8/4
 * @Version V1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping(name = "/hello")
    public String hello(String name) {
        System.out.println(name);
        return name;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setName("kang");
        user.setAge(25);
        user.setGender("男");
        return user;
    }

    @PostMapping("/add")
    public @ResponseBody Map<String, Object> addUser(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }

    @GetMapping("/list")
    public @ResponseBody List<User> getUserList() {
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setId(1L);
        user1.setName("kang");
        user1.setAge(25);
        list.add(user1);
        User user2 = new User();
        user2.setId(2L);
        user2.setName("pan");
        user2.setAge(29);
        list.add(user2);
        return list;
    }

}
