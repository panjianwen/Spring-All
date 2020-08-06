package com.darkgo.swagger.controller;

import com.darkgo.swagger.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "用户Controller",tags = "用户接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping(name = "/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "id", notes = "根据ID查询用户信息")
    public User getUserById(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setName("kang");
        user.setAge(25);
        user.setGender("男");
        return user;
    }

    @ApiOperation(value = "新增用户", notes = "根据用户实体创建用户")
    @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
    @PostMapping("/add")
    public @ResponseBody Map<String, Object> addUser(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }

    @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
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
