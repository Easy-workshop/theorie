package repository;



import java.util.List;

import entity.Film;

public interface FiledaoInterface {
public void save(Film film);
public Film getByid(int id);
public List<Film> list();

}
