package com.example.NYTMovieReview;

public class Multimedia {
    // declare Multimedia variables
    private String type;
    private String src;
    private int width;
    private int height;

    // create Multimedia constructor to be used to create new Multimedia objects
    public Multimedia(String type, String src, int width, int height) {
        this.type = type;
        this.src = src;
        this.width = width;
        this.height = height;
    }

    // create getters
    public String getType() {
        return type;
    }

    public String getSrc() {
        return src;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
