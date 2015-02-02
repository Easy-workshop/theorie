package com.eleph.core.controleur;

import java.util.Scanner;

import service.FilmService;
import entity.Film;

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
film.setNbrexemplaires(nb);


FilmService service=new FilmService();
service.registerFilm(film);

}

}
