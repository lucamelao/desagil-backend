package br.edu.insper.desagil.backend.model;

import java.util.List;

public class CollaborationTrack extends Track {
	private List<Artist> collaborators;

	public CollaborationTrack(Artist artist, List<Artist> collaborators, String name, int duration) {
		// construtor da superclasse
		super(artist, name, duration);
		this.collaborators = collaborators;
	}
	
	@Override
	// reescreve esse método da super classe
	public String getFullArtistName() {
		String artista = this.getArtist().getName();
		artista += "(feat. ";
		for (Artist colaborador : this.collaborators) {
			artista += colaborador.getName();
			if (collaborators.indexOf(colaborador) == collaborators.size()-1){
				break;
			}
			artista += ", ";
		}
		artista += ")";
		return artista;
	}
}	
// Outra forma de fazer:
//	public String getFullArtistName() {
//		List<String> names = new ArrayList<>();
//		for (Artist collaborator : collaborators) {
//			names.add(collaborator.getName());
//		}
//		String features = String.join(", ", names);
//		return this.getArtist().getName()+" (feat. "+features+")";
//	}
