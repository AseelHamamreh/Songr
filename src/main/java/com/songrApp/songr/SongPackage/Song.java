package com.songrApp.songr.SongPackage;

import com.songrApp.songr.AlbumPackage.Album;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    String title;
    int length;
    int trackNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private Album album;

    public Song() {
    }

    public Song(Long id, String title, int length, int trackNumber) {
        this.id = id;
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public Song(String title, int length, int trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public Song(String title, int length, int trackNumber, Album album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
