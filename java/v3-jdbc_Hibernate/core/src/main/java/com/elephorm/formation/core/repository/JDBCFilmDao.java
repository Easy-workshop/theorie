package com.elephorm.formation.core.repository;

import com.elephorm.formation.core.entity.Film;
import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class JDBCFilmDao implements FilmDaoInterface {
    
     public void save(Film film){
          Connection con =null;
      try{
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
      System.out.println("CONNEXION KO");
     
       PreparedStatement pstmt=con.prepareStatement("INSERT INTO MOVIE(TITLE,MOVIE_TYPE,COPIES) VALUES(?,?,?)");
       pstmt.setString(1,film.getTitre());
       pstmt.setString(2,film.getGenre());
       pstmt.setInt(3,film.getNbExemplaires());

      pstmt.executeUpdate();
      
      }catch(Throwable e){
    System.out.println("Connexion kooooo");   
    e.printStackTrace();
} finally{
try{
if (con!=null){
con.close();
   }
}catch (SQLException ex){

}

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
