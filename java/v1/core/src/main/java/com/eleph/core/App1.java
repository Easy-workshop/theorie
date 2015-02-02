package com.eleph.core;


import com.eleph.core.controleur.DefaultFilmController;

import service.FilmService;
import entity.Film;

/**
 * Hello world!
 *
 */
public class App1 
{
    public static void main( String[] args )
    {
   
     	DefaultFilmController controller= new DefaultFilmController();
    	controller.registerFilmFromConsoleInput();
    }

    	
}
