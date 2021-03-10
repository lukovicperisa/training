package com.kakarot.zaBrisanje.stojanovic;

public class LaItaliana {

    private String artistName;
    private double songLength;
    private int totalLikes;

    public LaItaliana(String artistName, double songLength, int totalLikes) {
        this.artistName = artistName;
        this.songLength = songLength;
        this.totalLikes = totalLikes;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public double getSongLength() {
        return songLength;
    }

    public void setSongLength(double songLength) {
        this.songLength = songLength;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void incrementLikes(){
        totalLikes++;
    }

}
