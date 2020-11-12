package com.example.NYTMovieReview;

public class Multimedia {
    private String type;
    private String src;
    private int width;
    private int height;

    // values:
    // "mediumThreeByTwo210", "https://static01.nyt.com/images/2019/06/05/arts/blackgodfather1/blackgodfather1-mediumThreeByTwo210.jpg", 210, 140

    public Multimedia(String type, String src, int width, int height) {
        this.type = type;
        this.src = src;
        this.width = width;
        this.height = height;
    }

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
