package com.suresnes.opendata.util;


import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
private static final SessionFactory sessionFactory = buildSessionFactory();

protected HibernateUtil() {

}

private static SessionFactory buildSessionFactory() {
    try {
        // Create the SessionFactory from hibernate.cfg.xml
        Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
        return sf;
    } catch (Exception ex) {
       
        throw new ExceptionInInitializerError(ex);
    }
}

public static SessionFactory getSessionFactory() {
    return sessionFactory;
}
	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}

}