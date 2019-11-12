package com.example.assesment6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.assesment6.modal.Album;
import com.example.assesment6.repo.AlbumDAL;
@RestController
public class AlbumController {
	
@Autowired
private AlbumDAL albumRepo;
@PostMapping("/albums")
public Album create(@RequestBody Album c) {
	return albumRepo.save(c);
}

@GetMapping("/albums")
public List<Album> fidnAll() {
	return albumRepo.findAll();
}

@GetMapping("/albums/{artist}")
public List<Album> findByArtist(@PathVariable String artist) {
	return albumRepo.findByMake(artist);
}

@GetMapping("/albumss")
public List<Album> findmakeIn(
		@RequestParam(name = "artist") List<String> artist, 
		@RequestParam(name = "year") int year,
		@RequestParam("manf") String manufacturer) {
	
	return albumRepo.findArtistIn(artist);
}
}


