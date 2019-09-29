package com.example.demo.controller;


import com.example.demo.pojo.Person;
import com.example.demo.service.PersonService;
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
@RequestMapping("/person")
public class Person2Controller {

    @Autowired
    private PersonService personService;

    @RequestMapping("/save")
    public String save(){
        for(int i=0;i<10;i++){
            Person person=new Person();
            person.setName("瓜田李下");
            person.setAge(i+10);

            personService.save(person);
        }

        return "success";
    }
}

