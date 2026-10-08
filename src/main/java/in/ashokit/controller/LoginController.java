package in.ashokit.controller;

import in.ashokit.entity.User;
import in.ashokit.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    LoginService service;

    @ModelAttribute("user")
    public User createUser(){
        return new User();
    }
    @GetMapping(value = "/")
    public String returnIndexPage(){
        return "index";
    }

    @GetMapping(value = "/register")
    public String returnRegisterPage(Model model){
//        User userObject = new User();
//        model.addAttribute("user",userObject);
        return "register";
    }
    @PostMapping(value = "/save")
    public String save(@ModelAttribute("user") User user,Model model){
        boolean flag= service.saveUser(user);
        if (flag==false){
            model.addAttribute("message","Username/Email already exist ,Please write again");
            return "register";
        }else {
            model.addAttribute("message","User registration Successful");
            return "success";
        }
    }

    @GetMapping(value = "/login")
    public String returnLoginPage(Model model){
//        User userObj = new User();
//        model.addAttribute("user",userObj);
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(@ModelAttribute("user") User user, Model model){
        User userFromService = service.loginUser(user);
        if(userFromService== null){
            model.addAttribute("message","Email-id or Password is incorrect");
            return  "login";
        }else {
            model.addAttribute("username",userFromService.getUsername());
            return "welcome";
        }

    }
}
