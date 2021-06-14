package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	private Track T;
	private Artist A;
	private Artist B;
	private CollaborationTrack C;
	private CollaborationTrack D;
	
	@BeforeEach
	void setUp() {
		A = new Artist("David Guetta");
	}

	@Test
	void testZeroSeconds() {
		T = new Track(A, "where the girls at", 0);
		assertEquals("0:00", T.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		T = new Track(A, "where the girls at", 5);
		assertEquals("0:05", T.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		T = new Track(A, "where the girls at", 25);
		assertEquals("0:25", T.getDurationString());	
		}

	@Test
	void testOneMinuteZeroSeconds() {
		T = new Track(A, "where the girls at", 60);
		assertEquals("1:00", T.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		T = new Track(A, "where the girls at", 65);
		assertEquals("1:05", T.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		T = new Track(A, "where the girls at", 85);
		assertEquals("1:25", T.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		T = new Track(A, "where the girls at", 120);
		assertEquals("2:00", T.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		T = new Track(A, "where the girls at", 125);
		assertEquals("2:05", T.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		T = new Track(A, "where the girls at", 145);
		assertEquals("2:25", T.getDurationString());
	}

	@Test
	void testOneCollaborator() {
		B = new Artist("Anitta");
		T = new Track(B, "where the girls at", 145);
		C = new CollaborationTrack(B, "Collab", 150);
		assertEquals("Anitta (feat. Becky G)", C.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		B = new Artist("Anitta");
		T = new Track(B, "where the girls at", 145);
		D = new CollaborationTrack(B, "Collab", 150);
		assertEquals("Anitta (feat. Ludmilla, Snoop Dog)", D.getFullArtistName());
	}
}
