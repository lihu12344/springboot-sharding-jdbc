package com.example.demo.controller;


import com.example.demo.pojo.OrderItem;
import com.example.demo.service.OrderItemService;
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
@RequestMapping("/orderItem")
public class OrderItem2Controller {

    @Autowired
    private OrderItemService orderItemService;

    @RequestMapping("/save")
    public String save(){
        for(int i=0;i<10;i++){
            OrderItem orderItem=new OrderItem();
            orderItem.setUserId(i+10);

            orderItemService.save(orderItem);
        }

        return "success";
    }
}

