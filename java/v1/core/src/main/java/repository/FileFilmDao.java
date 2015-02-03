package repository;

import java.io.FileWriter;
import java.io.IOException;

import entity.Film;

public class FileFilmDao implements FiledaoInterface{

	public void save(Film film){
		FileWriter writer;
		try{
			writer = new FileWriter("D:\\temp1\\films.txt",true);
			writer.write(film.getTitre()+";"+film.getGenre()+";"+film.getNbrexemplaires()+"\n");
			writer.close();	
		}
		catch(IOException e){
		e.printStackTrace();
		}
		
	}

	public Film getByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
