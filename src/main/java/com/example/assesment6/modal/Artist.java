package com.example.assesment6.modal;

import org.springframework.data.mongodb.core.mapping.DBRef;
import java.util.List;

public class Artist {
private String artistname;
private String gender;
private String genre;
public String getArtistname() {
	return artistname;
}
public void setArtistname(String artistname) {
	this.artistname = artistname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public List<Album> getAlbums() {
	return albums;
}
public void setAlbums(List<Album> albums) {
	this.albums = albums;
}
@DBRef
List<Album> albums;

}
