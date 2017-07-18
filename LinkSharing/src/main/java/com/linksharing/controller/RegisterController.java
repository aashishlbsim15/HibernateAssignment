package com.linksharing.controller;

import com.model.User;
import com.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
  @RequestMapping(value = "/registration", method = RequestMethod.POST)
  public ModelAndView register(@ModelAttribute User user) {
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


