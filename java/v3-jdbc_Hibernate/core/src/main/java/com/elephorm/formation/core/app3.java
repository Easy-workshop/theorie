package com.elephorm.formation.core;

import com.elephorm.formation.core.controller.DefaultFilmController;
import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.service.FilmService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app3 {

    public static void main(String[] arg){
    
        
    /* DefaultFilmController controller=new DefaultFilmController();
        
        */
     
         ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         //DefaultFilmController controller=(DefaultFilmController)context.getBean("filmController");
         DefaultFilmController controller=(DefaultFilmController)context.getBean("defaultFilmController");
         controller.ListFilmToConsole();
        
        
    }

}
    
    
    

