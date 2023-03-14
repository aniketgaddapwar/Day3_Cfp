package com.example.Greeting_Apps.controller;

import com.example.Greeting_Apps.model.User;
import com.example.Greeting_Apps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/greeting")
    public class UserController {
        @Autowired
        UserService userService;
        @GetMapping("/hello")
        public String message(){
            String response =userService.message();
             return response;
            }
         @PostMapping("/insert")
        public User insert(@RequestBody User user){
            return userService.insert(user);
         }
         @GetMapping("/getById/{id}")
        public User show(@PathVariable long id){
        User user =userService.getById(id);
        return user;
         }
         @GetMapping("/getAll")
       public List<User> allDetail(){
         List<User> abcd=userService.allDetails();
         return abcd;
         }
        @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable long id){
            return userService.delete(id);
        }
    @PutMapping("/edit/{id}")
    public User updateGreetingById(@PathVariable long id, @RequestBody User user) //requestbody is used to chnage data in json
    {
        return userService.updateGreetingById(id,user);
    }


}
