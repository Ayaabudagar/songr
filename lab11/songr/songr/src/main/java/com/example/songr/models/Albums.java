package com.example.songr.models;

public class Albums {
    private  String title;
    private String artist;
    private int length;
    private String imgUrl;
    private int songCount;
    public Albums (String title, String artist, int length, String imgUrl,int songCount){
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.imgUrl = imgUrl;
        this.songCount = songCount;
    }
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }
        public int getSongCount() {
            return songCount;
        }

        public void setSongCount(int songCount) {
            this.songCount = songCount;
        }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
    

