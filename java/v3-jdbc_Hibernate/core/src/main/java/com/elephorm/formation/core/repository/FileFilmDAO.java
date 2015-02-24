package com.elephorm.formation.core.repository;

import com.elephorm.formation.core.entity.Film;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class FileFilmDAO implements FilmDaoInterface {
   
     public void save(Film film){
   
     FileWriter writer;
    try{
        writer = new FileWriter("C:\\temp\\films.txt",true);
        writer.write(film.getTitre()+";"+film.getGenre()+";"+film.getNbExemplaires()+"\n");
        writer.close();
    }catch(IOException e){
    e.printStackTrace();
    }
   
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

    
    public Film getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public List<Film> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    }
    

