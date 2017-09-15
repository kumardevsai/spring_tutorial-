package com.mycuteblog.hibernate4.controller.impl;

import com.mycuteblog.hibernate4.controller.UserController;
import com.mycuteblog.hibernate4.dao.UserDao;
import com.mycuteblog.hibernate4.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

/**
 * Created by sadupa on 8/18/14.
 */

@Transactional
public class UserControllerImpl implements UserController {

    @Autowired
    private UserDao userDao;

    
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }

   
    public User getUser(long userId) {
        return userDao.getUser(userId);
    }

    
    public boolean updateUser(User user) {
        return userDao.updateUser(user);
    }

   
    public boolean deleteUser(User user) {
        return userDao.deleteUser(user);
    }
}
