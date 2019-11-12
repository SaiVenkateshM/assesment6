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
public class ArtistController {
	@Autowired
	private ArtistDAL artistRepo;
	
}
