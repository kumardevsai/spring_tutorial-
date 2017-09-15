package com.mycuteblog.hibernate4.dao.impl;

import com.mycuteblog.hibernate4.dao.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by sadupa on 8/6/14.
 */
public class HibernateSessionFactoryImpl implements HibernateSessionFactory {

    private SessionFactory sessionFactory;

    
    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
