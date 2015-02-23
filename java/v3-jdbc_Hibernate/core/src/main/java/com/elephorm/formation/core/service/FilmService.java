package com.elephorm.formation.core.service;
import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.repository.FileFilmDAO;
import com.elephorm.formation.core.repository.HibernateFilmDAO;
import com.elephorm.formation.core.repository.JDBCFilmDao;
import java.util.List;



public class FilmService {

    
 public void registerFilm(Film film){
/*
     System.out.println("film enregistré");
     */
     
     
 /*
     FileFilmDAO dao=new FileFilmDAO();
    dao.save(film);
*/
     
   /*
     JDBCFilmDao dao=new JDBCFilmDao();
     dao.save(film);
 */
     HibernateFilmDAO  dao=new HibernateFilmDAO();
     dao.save((film));

 }

public Film getFilmADecrire(int id){

HibernateFilmDAO dao=new HibernateFilmDAO();
return dao.getById(id);
}


public List<Film> getListeFilms(){
HibernateFilmDAO dao= new HibernateFilmDAO();
return dao.list();
}

       
}
