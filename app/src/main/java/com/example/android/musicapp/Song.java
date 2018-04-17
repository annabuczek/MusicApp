package com.example.android.musicapp;

/**
 * Created by aania on 16.04.2018.
 */

public class Song {

    private String title;
    private String artist;
    private String album;
    private int albumCover;

    public Song(String title, String artist, String album, int albumCover) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.albumCover = albumCover;
    }

    public Song(String artist, String album) {
        this.artist = artist;
        this.album = album;
    }

    public Song(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getAlbumCover() {
        return albumCover;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setAlbumCover(int albumCover) {
        this.albumCover = albumCover;
    }
}
