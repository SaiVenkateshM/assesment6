package com.example.assesment6.repo;

import java.util.List;

import com.example.assesment6.modal.Artist;

public interface ArtistDAL {

void	create(Artist a);

List<Artist> findAll();
Artist findById(String id);
	
	void deleteArtist(String artistName);
}
