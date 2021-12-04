package com.sample.http.apis.httpapis.controller;

import com.sample.http.apis.httpapis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/apis")
public class GetHttpAPIs {
  @Autowired
  User user;
    @GetMapping(path = "/getString")
    public String getString (){
        return "Hello";
    }
    @GetMapping(path = "/getModel")
    public User getModel(){
        user.setId(123);
        user.setName("Ashutosh");
      return user;

    }
}
