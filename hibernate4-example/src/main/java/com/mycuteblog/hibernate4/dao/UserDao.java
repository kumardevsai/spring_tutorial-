package com.mycuteblog.hibernate4.dao;

import com.mycuteblog.hibernate4.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by sadupa on 8/18/14.
 */
public interface UserDao {

    boolean addUser(User user);

    User getUser(long userId);

    boolean updateUser(User user);

    boolean deleteUser(User user);


}
