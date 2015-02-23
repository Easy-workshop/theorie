package com.elephorm.formation.core.controller;

import com.elephorm.formation.core.entity.Acteur;
import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.service.FilmService;
import java.util.Scanner;

public class DefaultFilmController {
   
    public void registerFilmFromConsoleInput(){
    Scanner sc=new Scanner(System.in);
    System.out.println("titre=");
    String titre= sc.nextLine();
    System.out.println("genre=");
    String genre= sc.nextLine();


System.out.println("nbexemplaire=");
int nb= sc.nextInt();



Film film=new Film();
film.setTitre(titre);
film.setGenre(genre);
film.setNbExemplaires(nb);

    
    FilmService service=new FilmService();
    service.registerFilm(film);
    }
 public void decrireFilmWithConsole(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Quel est l'identifiant = ");
    int id= sc.nextInt();
    FilmService service=new FilmService();
    Film film=service.getFilmADecrire(id);
    System.out.println("le film est "+film.getTitre()+" "+film.getGenre());
    System.out.println("son acteur principal est "+film.getActeurPrincipal().getNom()+" "+film.getActeurPrincipal().getPrenom());
    
    System.out.println("Acteurs secondaires : ");
    for(Acteur acteur: film.getActeurSecondaires() )
    System.out.println("le suivant est "+acteur.getNom()+" "+acteur.getPrenom());
    
 
 
 
 
 }
}
    

    

