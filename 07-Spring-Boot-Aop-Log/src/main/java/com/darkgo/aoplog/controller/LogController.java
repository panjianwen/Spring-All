package com.darkgo.aoplog.controller;

import com.darkgo.aoplog.annotation.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LogController
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/31
 * @Version V1.0
 **/
@RestController
public class LogController {

    @Log(value = "testMethodOne")
    @GetMapping(name = "/one")
    public void testMethodOne(){

    }

    @Log(value = "testMethodTwo")
    @GetMapping("/two")
    public void testMethodTwo(String username){

    }

    @Log("执行方法三")
    @GetMapping("/three")
    public void methodThree(String username, String age) { }
}
