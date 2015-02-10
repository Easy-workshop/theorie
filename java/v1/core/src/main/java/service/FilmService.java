package service;
import repository.FileFilmDao;
import entity.Film;



public void registerFilm(Film film){

FileFilmDao dao = new FileFilmDao();
dao.save(film);



}
}
