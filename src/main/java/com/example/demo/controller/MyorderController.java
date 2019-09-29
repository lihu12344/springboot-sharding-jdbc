package com.example.demo.controller;


import com.example.demo.pojo.Myorder;
import com.example.demo.service.MyorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lihu
 * @since 2019-09-29
 */
@RestController
@RequestMapping("/myorder")
public class MyorderController {

    @Autowired
    private MyorderService myorderService;

    @RequestMapping("/save")
    public String save(){
        for(int i=0;i<10;i++){
            Myorder myorder=new Myorder();
            myorder.setUserId(i+16);

            myorderService.save(myorder);
        }

        return "success";
    }
}

