package com.example.demo.controller;


import com.example.demo.pojo.Order;
import com.example.demo.service.OrderService;
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
@RequestMapping("/order")
public class Order2Controller {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/save")
    public String save(){
        for(int i=0;i<10;i++){
            Order order=new Order();
            order.setUserId(i+10);

            orderService.save(order);
        }

        return "success";
    }
}

