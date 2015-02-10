package com.elephorm.formation.core.repository;

import com.elephorm.formation.core.entity.Film;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FileFilmDAO {
   
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
      
    }
    

