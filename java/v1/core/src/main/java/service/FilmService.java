package service;
import repository.FileFilmDao;
import entity.Film;

public class FilmService implements FilmServiceInterface {


public void registerFilm(Film film){

FileFilmDao dao = new FileFilmDao();
dao.save(film);



}
}
