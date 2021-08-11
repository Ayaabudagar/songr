package com.example.songr.models;

import javax.persistence.*;
import java.util.List;

public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int length;
    private int trackNumber;
    @OneToMany()
    private Albums albums ;
    public Song(){

    }
    public Song (String title,int length ,  int trackNumber){
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;


    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
    public Albums getAlbum() {
        return albums;
    }

    public void setAlbum(Albums albums) {
        this.albums = albums;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
