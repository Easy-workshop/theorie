/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elephorm.formation.core.entity;


public class Film {
  
  private Integer id;   
  private String titre;
  private String genre;
  private Integer nbExemplaires;  
  

    public Acteur getActeurPrincipal() {
        return acteurPrincipal;
    }

    public void setActeurPrincipal(Acteur acteurPrincipal) {
        this.acteurPrincipal = acteurPrincipal;
    }
  
   public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
  
  
  
    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the nbExemplaires
     */
    public Integer getNbExemplaires() {
        return nbExemplaires;
    }

    /**
     * @param nbExemplaires the nbExemplaires to set
     */
    public void setNbExemplaires(Integer nbExemplaires) {
        this.nbExemplaires = nbExemplaires;
    }
}
