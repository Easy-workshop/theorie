package com.elephorm.formation.core.repository.hibernate;

import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.repository.FilmDaoInterface;
import com.elephorm.formation.core.util.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateFilmDAO implements FilmDaoInterface {

   
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
 public Film getById(int id){
    
    Session session =HibernateUtil.getSessionFactory().openSession();
    Film film=null;
    try{
    session.beginTransaction();
    film =(Film)session.get(Film.class,id);
    Hibernate.initialize(film.getActeurPrincipal());
    Hibernate.initialize(film.getActeurSecondaires());
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
    return film;


}
public List<Film> list(){
    
    Session session =HibernateUtil.getSessionFactory().openSession();
    List<Film> films =null;
    try{
    session.beginTransaction();
    
    Query query=session.createQuery("from Film");
    films = query.list();
    
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
    return films;


}

    
    public void registerFilm(Film film) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Film getFilmADecrire(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<Film> getListeFilms() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}