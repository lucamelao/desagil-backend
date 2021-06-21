package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name; 
	private Integer duration;
	
	public Track(Artist artist, String name, int duration) {
		super();
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}
		
	public String getDurationString() {
		// arredonda para inteiro (pega só a parte dos minutos)
		int minutos = duration/60;
		// subtrai o número de segundos equivalente aos minutos inteiros do total
		int segundos = duration - (minutos)*60;
		
		// Escreve horário
		if (segundos < 10) {
			return Integer.toString(minutos) + ":0" + Integer.toString(segundos);
		}
		return Integer.toString(minutos) + ":" + Integer.toString(segundos);
	} 
	
	public String getFullArtistName() {
		return this.artist.getName();
	}
		
	public Artist getArtist() {
		return artist;
	}
	public String getName() {
		return name;
	}
	public Integer getDuration() {
		return duration;
	}
}
