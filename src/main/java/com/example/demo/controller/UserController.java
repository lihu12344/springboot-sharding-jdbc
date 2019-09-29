package com.example.demo.controller;


import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lihu
 * @since 2019-09-28
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public String save(){
        for(int i=0;i<10;i++){
            User user=new User();
            user.setName("瓜田李下"+i);
            user.setAge(i+10);

            userService.save(user);
        }

        return "success";
    }
}

