package entity;

public class Film {


private String titre;
private String genre;
private Integer nbrexemplaires;

public Film(){
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public Integer getNbrexemplaires() {
	return nbrexemplaires;
}
public void setNbrexemplaires(Integer nbrexemplaires) {
	this.nbrexemplaires = nbrexemplaires;
}


}
