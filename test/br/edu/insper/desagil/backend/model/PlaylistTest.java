package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private Playlist P;
	private Track track;
	private Artist B;	
	private static double DELTA = 0.000001;
	private Map<String, Integer> dict;  


	@BeforeEach
	void setUp() {
		P = new Playlist(30, tracks, ratings) {
	}

	@Test
	void testRoundDownToZero() {
		B = new Artist("Anitta");
		track = Track(B, "bla", 40); 
		dict = new HashMap<>();
		this.dict.put(track.getName(), 1);
		this.dict.put(track, 2);
		this.dict.put(track, 3);
		this.dict.put(track, 3);
		assertEquals(2.0, P.averageRatings());
	}

	@Test
	void testRoundUpToHalf() {
		assertEquals(true,  P.averageRatings());
	}

	@Test
	void testRoundDownToHalf() {
		assertEquals(true,  P.averageRatings());
	}

	@Test
	void testRoundUpToOne() {
		assertEquals(true,  P.averageRatings());
	}
}
