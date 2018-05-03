package com.miracleit.miracle.controller;

import com.miracleit.miracle.model.User;
import com.miracleit.miracle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

//    @RequestMapping("/print")
//    public String print(){
//        return "Hello Spring Boot Application";
//    }
    @RequestMapping("/create")
    public User create(){
        final User user = new User();
        user.setName("Alex");
        user.setAge(22);
        return userService.create(user);

    }
    @RequestMapping("/update")
  public User update(){
        final User user = new User();
        user.setName("Ivan");
        user.setAge(22);
      return userService.update(user);
  }
  @RequestMapping("/delete")
  public void delete(){ //add new param
        userService.delete(1L);
  }

//  @RequestMapping("/del")
//  public void delete(){
//      final User user = new User();
//      user.setName("Alex");
//      user.setAge(22);
//        userService.delete(user);
//  }

    @RequestMapping("/one")
    public User get(){
        return userService.getOne(1L);
    }

    @RequestMapping("/all")
    public List<User> getAll(){
        return userService.getAll();

    }

}
