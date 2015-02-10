package com.elephorm.formation.core.repository;

import com.elephorm.formation.core.entity.Film;
import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBCFilmDao {
    
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
}
