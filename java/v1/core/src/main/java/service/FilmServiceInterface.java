package service;





import java.util.List;

import entity.Film;

public interface FilmServiceInterface {
public void registerFilm(Film film);
public Film getFilmADecrire(int id);
public List<Film> getListeFilms();

}
