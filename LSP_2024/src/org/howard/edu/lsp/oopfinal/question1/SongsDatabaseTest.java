package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SongsDatabaseTest {

	 @Test
	    void testAddSong() {
	        SongsDatabase songsDatabase = new SongsDatabase();
	        songsDatabase.addSong("Rap", "Savage");
	        Set<String> rapSongs = songsDatabase.getSongs("Rap");
	        Assertions.assertTrue(rapSongs.contains("Savage"));
	    }

	    @Test
	    void testGetGenreOfSong() {
	        SongsDatabase songsDatabase = new SongsDatabase();
	        songsDatabase.addSong("Rap", "Savage");
	        songsDatabase.addSong("Jazz", "Always There");

	        Assertions.assertEquals("Rap", songsDatabase.getGenreOfSong("Savage"));
	        Assertions.assertEquals("Jazz", songsDatabase.getGenreOfSong("Always There"));
	    }

	    @Test
	    void testGetSongs() {
	        SongsDatabase songsDatabase = new SongsDatabase();
	        songsDatabase.addSong("Rap", "Savage");
	        songsDatabase.addSong("Rap", "Gin and Juice");

	        Set<String> rapSongs = songsDatabase.getSongs("Rap");
	        Assertions.assertTrue(rapSongs.contains("Savage"));
	        Assertions.assertTrue(rapSongs.contains("Gin and Juice"));
	    }
	
}
