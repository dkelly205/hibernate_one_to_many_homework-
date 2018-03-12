package db;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import java.util.List;

public class DBHelper {

    private static Transaction transaction;
    private static Session session;

    public static void saveOrUpdate(Object object){
        session = HibernateUtil.getSessionFactory().openSession();
        try{
            transaction = session.beginTransaction();
            session.saveOrUpdate(object);
            transaction.commit();
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static <T> List<T> getAll(String className) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<T> results = null;
        try {
            transaction = session.beginTransaction();
            String hql = "from " + className;
            results = session.createQuery(hql).list();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static List<Order> getOrders(int id){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Order> orders = null;

        try {
            transaction = session.beginTransaction();
            String hql = "from Order WHERE customer_id = :id";  //:id is a placeholder, prevent sql injection
            Query query = session.createQuery(hql);
            query.setInteger("id", id);//the "id" is linked to the placeholder :id above, the other id is the value that you want to set, it is an argument in the method getEmployees above
            orders = query.list();
            transaction.commit();

        }catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return orders;
    }

    public static void delete(Object object){
        session = HibernateUtil.getSessionFactory().openSession();
        try{
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
        }catch(HibernateException ex){
            transaction.rollback();
            ex.printStackTrace();
        }finally{
            session.close();
        }
    }




}
