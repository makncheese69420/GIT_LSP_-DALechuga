package org.howard.edu.lsp.oopfinal.question1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
public class SongsDatabase {
    private Map<String, Set<String>> map = new HashMap<>();
    
    /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        if (!map.containsKey(genre)) {
            map.put(genre, new HashSet<>());
        }
        map.get(genre).add(songTitle);
    }

    /* Return genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
        for (String genre : map.keySet()) {
            Set<String> songs = map.get(genre);
            if (songs.contains(songTitle)) {
                return genre;
            }
        }
        return null; // If songTitle is not found in any genre
    }

    /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
        return map.getOrDefault(genre, new HashSet<>());
    }

}
