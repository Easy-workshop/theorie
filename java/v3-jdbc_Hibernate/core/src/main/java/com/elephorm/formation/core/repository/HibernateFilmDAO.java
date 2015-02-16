package com.elephorm.formation.core.repository;

import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;


public class HibernateFilmDAO {

    public void save(Film film){
    
    Session session =HibernateUtil.getSessionFactory().openSession();
    try{
    session.beginTransaction();
    session.persist(film);
    session.getTransaction().commit();
    }catch(HibernateException he){
        he.printStackTrace();
        if (session.getTransaction()!=null){
        try{
        
        session.getTransaction().rollback();
        }catch (HibernateException he2){
        he2.printStackTrace();
        }
        }
    
    
    }  finally{
        if (session!=null){
        
        try{
        
        session.close();
        }catch (Exception e ){
        e.printStackTrace();
        }
        }
        }
    
    }
    



public void getById(Film film){
    
    Session session =HibernateUtil.getSessionFactory().openSession();
    try{
    session.beginTransaction();
    session.persist(film);
    session.getTransaction().commit();
    }catch(HibernateException he){
        he.printStackTrace();
        if (session.getTransaction()!=null){
        try{
        
        session.getTransaction().rollback();
        }catch (HibernateException he2){
        he2.printStackTrace();
        }
        }
    
    
    }  finally{
        if (session!=null){
        
        try{
        
        session.close();
        }catch (Exception e ){
        e.printStackTrace();
        }
        }
        }
    
    }
    


}
            
    

