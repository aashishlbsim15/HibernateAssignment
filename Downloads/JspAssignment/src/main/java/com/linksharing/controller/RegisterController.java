package com.linksharing.controller;

import com.dao.UserDaoImpl;
import com.model.User;
import com.services.UserService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

@Controller
public class RegisterController {
  @RequestMapping(value = "/registration", method = RequestMethod.POST)
  public ModelAndView register(@ModelAttribute User user) throws ParseException {
    UserService userService = new UserService();
    boolean valid = userService.validateDetails(user);
    if (valid) {
      ModelAndView modelAndView = new ModelAndView("index");
      return modelAndView;
    } else {
      ModelAndView modelAndView = new ModelAndView("index");
      return modelAndView;
    }

  }

}


