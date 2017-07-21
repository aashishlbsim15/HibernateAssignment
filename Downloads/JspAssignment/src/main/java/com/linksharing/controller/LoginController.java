package com.linksharing.controller;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;
import com.services.Login;
import com.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    @RequestMapping(value = "/Login",method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute Login login, HttpServletRequest request, HttpServletResponse response)
    {
        UserService userService=new UserService();
    boolean result=userService.isValidUser(login);
    if(result==false) {
        ModelAndView modelAndView = new ModelAndView("index","error","invalid user");

        return modelAndView;
    }


        else {
            ModelAndView modelAndView = new ModelAndView("Welcome");
            HttpSession session=request.getSession();
            session.setAttribute("user",login.getUsername());
            return modelAndView;
        }
    }
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(HttpServletRequest request,HttpServletResponse response)
    {
        HttpSession session=request.getSession();
        session.invalidate();
        return "index";
    }



    }

