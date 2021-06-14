package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name; 
	private Integer duration;
	
	public Track(Artist artist, String name, Integer duration) {
		super();
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}
		
	public String getDurationString() {
		if (duration % 60 == 0) {
			Integer D = duration/60;
			return Integer.toString(D)+":00";
		}else {
			double divisao = duration/60;
			int parteInteira = (int) divisao;
			double parteDecimal = divisao - parteInteira;			
			String minutos = Integer.toString(parteInteira);
			double seg = parteDecimal*60;
			int segs = (int) Math.round(seg);
			String segundos = Integer.toString(segs);
			return minutos + ":" + segundos;
		}
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
