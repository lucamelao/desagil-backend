package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;  

	// Se o dicionário e a lista são inicializados no construtor, não é necessário 
	// passá-los como argumentos.
	public Playlist(int id) {
		super();
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}

	public void putRating(String usuario, int rating) {
		ratings.put(usuario, rating);						
	}
	
	public double averageRatings() {
		int somaAvaliacoes = 0;
		int numeroAvaliacoes = ratings.size();
		for (int rating: ratings.values()) {
			somaAvaliacoes += rating;
		}
		// CASTING
		double divisao = (double) somaAvaliacoes/numeroAvaliacoes;
		
		int parteInteira = (int) divisao;
		double parteDecimal = divisao - parteInteira;
	
		if (parteDecimal < 0.26){
			parteDecimal = 0.0;
		}else if (0.26 <= parteDecimal && parteDecimal < 0.74){
			parteDecimal = 0.5;
		}else if (parteDecimal >= 0.74){
			parteDecimal = 1.0;
		}
		double media = parteInteira + parteDecimal;
		return media;
	}
	
	public void addTrack(Track faixa) {
		tracks.add(faixa);
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
