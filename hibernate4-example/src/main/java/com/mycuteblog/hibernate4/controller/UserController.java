package com.mycuteblog.hibernate4.controller;

import com.mycuteblog.hibernate4.model.User;

/**
 * Created by sadupa on 8/18/14.
 */
public interface UserController {
	
    boolean addUser(User user);

    User getUser(long userId);

    boolean updateUser(User user);

    boolean deleteUser(User user);
}
