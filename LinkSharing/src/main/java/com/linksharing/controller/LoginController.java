package com.linksharing.controller;

import com.services.Login;
import com.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @RequestMapping(value = "/Login",method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute Login login)
    {
        UserService userService=new UserService();
    boolean result=userService.isValidUser(login);
    if(result==false) {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    else
    {
        ModelAndView modelAndView = new ModelAndView("Home");
        return modelAndView;

    }

    }

}
