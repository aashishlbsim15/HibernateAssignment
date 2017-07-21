
package com.services;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class UserService {
    public boolean validateDetails(User user) throws ParseException {
        String username = user.getUsername();
        String password = user.getPassword();
        if (username != null && password != null) {

            UserDaoImpl userDao = new UserDaoImpl();
            userDao.register(user);
            return true;
        } else {
            return false;
        }
    }

    public boolean isValidUser(Login login) {
        String username = login.getUsername();
        String password = login.getPassword();
        if (username != null && password != null) {
            UserDaoImpl userDao = new UserDaoImpl();
            User user = userDao.getUser(login);
            if (user != null)
                return true;
            else
                return false;
        }
        return false;
    }

}

