package com.example.assesment6.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.assesment6.modal.Album;

@Repository
public class AlbumDALimpl implements AlbumDAL {

	@Autowired
	private MongoTemplate mongo;

	@Override
	public List<Album> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Album> findByArtist(String artist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Album> findArtistIn(List<String> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Album save(Album c) {
		// TODO Auto-generated method stub
		return null;
	}

}
