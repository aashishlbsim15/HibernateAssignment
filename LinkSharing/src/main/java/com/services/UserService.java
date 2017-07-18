
package com.services;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;

import java.util.List;

public class UserService {
   public boolean validateDetails(User user) {
        String username = user.getUsername();

        String password = user.getPassword();


        if (username != null && password != null) {
            UserDaoImpl userDao = new UserDaoImpl();
            userDao.register(user);
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isValidUser(Login login)
    {
        String username=login.getUsername();
        String password=login.getPassword();
        if(username!=null && password!=null)
        {
           UserDaoImpl userDao=new UserDaoImpl();
            List<User> userList=userDao.getUser(login);
            int flag=0;
            for(User u:userList)
            {
                if(u.getUsername().equals(login.getUsername()) && u.getPassword().equals(login.getPassword()))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                return true;
            else
                return false;
        }
        return false;
    }
}

