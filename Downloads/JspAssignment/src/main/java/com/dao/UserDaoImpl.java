package com.dao;

import com.model.User;
import com.services.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;


public class UserDaoImpl implements UserDao {
   public  SessionFactory sessionFactory;
    public UserDaoImpl()
    {
      sessionFactory =new Configuration().configure().buildSessionFactory();
    }
    public int register(User user)
    {

        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        session.save(user);
        transaction.commit();
        return 1;
    }
    public User getUser(Login login)
    {
     Session session=sessionFactory.openSession();
     String sql="from User where username='"+login.getUsername()+"' and password='"+login.getPassword()+"'";
     Query query=session.createQuery(sql);
//     List<User> userList=query.list();
        User user=(User)query.uniqueResult();


 return  user;


    }
    public List<User> getAllUser()
    {
        Session session=sessionFactory.openSession();
        String sql="from User";
        Query query=session.createQuery(sql);
        List<User> userList=query.list();
        return userList;
    }



}
