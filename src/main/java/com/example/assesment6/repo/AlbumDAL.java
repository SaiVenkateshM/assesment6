package com.example.assesment6.repo;


import java.util.List;

import com.example.assesment6.modal.*;
public interface AlbumDAL {
List<Album> findAll();
	
	List<Album> findByArtist(String artist);
	List<Album> findArtistIn(List<String> artist);
	Album save(Album c);
}
