package fr.ibformation.cinema.bo;

public class Film {
	//Déclaration des variables
	private String titleFilm, description, language;
	private int releaseDate;
	
	//Constructeur
	public Film(String title, String description, String language, int releaseDate) {
		this.titleFilm = title;
		this.description = description;
		this.language = language;
	    this.releaseDate = releaseDate;
	}

	//Getters et Setters
	public String getTitleFilm() {
		return titleFilm;
	}

	public void setTitleFilm(String titleFilm) {
		this.titleFilm = titleFilm;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}


}
