package br.edu.insper.desagil.backend.model;

import java.util.List;
import java.util.Map;


public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;  

	
	public Playlist(int id, List<Track> tracks, Map<String, Integer> ratings) {
		super();
		this.id = id;
		this.tracks = tracks;
		this.ratings = ratings;
	}

	public void putRating(Track track, int rating) {
		this.ratings.put(track.getFullArtistName(), rating);
	}
	
	public double averageRatings() {
		int somaAvaliacoes = 0;
		int numeroAvaliacoes = this.ratings.size();
		for (String track: this.ratings.keySet()) {
			somaAvaliacoes += this.ratings.get(track);
		}
		double divisao = somaAvaliacoes/numeroAvaliacoes;
		int parteInteira = (int) divisao;
		double parteDecimal = divisao - parteInteira;
		if (parteDecimal < 0.26){
			parteDecimal = 0.0;
		}
		if (0.26 <= parteDecimal && parteDecimal < 0.74){
			parteDecimal = 0.5;
		}
		if (parteDecimal >= 0.74){
			parteDecimal = 1.0;
		}
		double media = parteInteira + parteDecimal;
		return media;
	}
		
	public int getId() {
		return id;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public Map<String, Integer> getRatings() {
		return ratings;
	}
}
