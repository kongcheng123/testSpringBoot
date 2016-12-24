package com.test.controller;

import com.test.dao.UserDao;
import com.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xy on 2016/12/22.
 */
@Controller
public class HelloController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/index")
    public String index(Model model){
        User u=new User("qwe");
        userDao.save(u);
        model.addAttribute("name","Ryan");
        return "index";
    }


    @RequestMapping("/help")
    public String hejp(Model model){

        model.addAttribute("name","Ryan");

        return "test/help";
    }
}
