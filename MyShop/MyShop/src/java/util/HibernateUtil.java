package util;

import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author OSSTECH
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = null;
    private static Configuration cfg= null;

    static {
        try {
            cfg = new Configuration();
            cfg.configure("/util/hibernate.cfg.xml");
        } catch (HibernateException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
