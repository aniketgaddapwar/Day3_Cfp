package com.example.Greeting_Apps.service;

import com.example.Greeting_Apps.model.User;
import com.example.Greeting_Apps.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

   @Autowired
    UserRepository userRepository;
    public String message() {
        return "Hello World";
    }

    public User insert(User user) {
     //   User demo=new User(user);
        userRepository.save(user);
        return user;
    }

    public User getById(long id) {
        User hint =userRepository.findById(id).get();
        return hint;
    }

    public List<User> allDetails() {
        List<User> abcde = (List<User>) userRepository.findAll();
        return abcde;
    }

    public String delete(long id) {
        userRepository.deleteById(id);
        return " id is deleted";
    }

    public User updateGreetingById(long id, User user) {

            User result = userRepository.findById(id).get(); // by using findById() we are storing id variable & .get() is to get that id. Storing in result obj.
            result.setFirstName(user.getFirstName()); //  setter method is used to set that fisrt name.
            result.setLastName(user.getLastName());
            result.setId(user.getId());
            userRepository.save(result); // save is inbuilt repo method that is storing result
            return result;
        }
    }

