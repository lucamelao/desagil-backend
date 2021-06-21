package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private Playlist P;	
	private static double DELTA = 0.000001;
	//private Map<String, Integer> ratings;  
	//private List<Track> tracks;  


	@BeforeEach
	void setUp() {
		//ratings = new HashMap<>();
		//tracks = new ArrayList<>();
		//playlist = new Playlist(30, tracks, ratings);
		P = new Playlist(100);
	}

	@Test
	void testRoundDownToZero() {
		P.putRating("usuario legal", 1);
		P.putRating("usuario chato", 2);
		P.putRating("usuario exigente", 3);
		P.putRating("usuario sensato", 3);
		assertEquals(2.0, P.averageRatings(), DELTA);
	}

	@Test
	void testRoundUpToHalf() {
		P.putRating("usuario legal", 1);
		P.putRating("usuario chato", 2);
		P.putRating("usuario exigente", 1);
		assertEquals(1.5, P.averageRatings(), DELTA);
	}

	@Test
	void testRoundDownToHalf() {
		P.putRating("usuario legal", 1);
		P.putRating("usuario chato", 2);
		P.putRating("usuario exigente", 2);
		assertEquals(1.5, P.averageRatings(), DELTA);
	}	

	@Test
	void testRoundUpToOne() {
		P.putRating("usuario legal", 1);
		P.putRating("usuario chato", 1);
		P.putRating("usuario exigente", 2);
		P.putRating("usuario sensato", 3);
		assertEquals(2.0, P.averageRatings(), DELTA);
	}	
}
