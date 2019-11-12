package com.example.assesment6.modal;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "albums")
public class Album {
private String id;
private String name;
private String artistname;
private String title;
public String getId() {
	return id;
}
public Album(String name, String artistname, String title) {
	super();
	this.name = name;
	this.artistname = artistname;
	this.title = title;
}
public Album() {
	super();
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getArtistname() {
	return artistname;
}
public void setArtistname(String artistname) {
	this.artistname = artistname;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
}
