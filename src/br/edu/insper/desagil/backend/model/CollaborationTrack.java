package br.edu.insper.desagil.backend.model;

//import java.util.ArrayList;
//import java.util.List;

public class CollaborationTrack extends Track {
	private CharSequence[] collaborators;


	public CollaborationTrack(Artist artist, String name, Integer duration) {
		super(artist, name, duration);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getFullArtistName() {
		String artista = this.getArtist().getName();
		String nomeCompleto = artista + "(feat. " + String.join(",", collaborators) + ")";
		return nomeCompleto;
		}
	}
