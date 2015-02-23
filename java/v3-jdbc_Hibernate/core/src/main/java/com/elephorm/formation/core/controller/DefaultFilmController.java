package com.elephorm.formation.core.controller;

import com.elephorm.formation.core.entity.Acteur;
import com.elephorm.formation.core.entity.Film;
import com.elephorm.formation.core.service.FilmService;
import java.util.List;
import java.util.Scanner;

public class DefaultFilmController {
   
    public void registerFilmFromConsoleInput(){
    Scanner sc=new Scanner(System.in);
    System.out.println("titre=");
    String titre= sc.nextLine();
    System.out.println("genre=");
    String genre= sc.nextLine();

     System.out.println("Nom acteur principal=");
    String nom= sc.nextLine();

    System.out.println("Prénom acteur principal=");
    String prenom= sc.nextLine();

    
    
System.out.println("nbexemplaire=");
int nb= sc.nextInt();



Film film=new Film();
film.setTitre(titre);
film.setGenre(genre);
film.setNbExemplaires(nb);

Acteur acteur =new Acteur();
acteur.setNom(nom);
acteur.setPrenom(prenom);

film.setActeurPrincipal(acteur);

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

 public void ListFilmToConsole(){
   
    FilmService service=new FilmService();
    List<Film> films=service.getListeFilms();
    if(films != null){
    for(Film film: films )
    System.out.println("le Titre est "+film.getTitre());
    }
    }




}
    

    

