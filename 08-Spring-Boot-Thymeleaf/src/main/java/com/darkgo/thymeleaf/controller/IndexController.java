package com.darkgo.thymeleaf.controller;

import com.darkgo.thymeleaf.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName IndexController
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/31
 * @Version V1.0
 **/
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model){
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("jack","杰克","e10adc3949ba59abbe56e","13112345678"));
        accounts.add(new Account("Mary","玛丽","e10adc3949ba59abbe56e","13112345678"));
        accounts.add(new Account("Eric","艾瑞克","e10adc3949ba59abbe56e","13112345678"));
        accounts.add(new Account("Bob","鲍伯","e10adc3949ba59abbe56e","13112345678"));
        model.addAttribute("accountList",accounts);
        return "account";
    }
}
