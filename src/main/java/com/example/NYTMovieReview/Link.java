package com.example.NYTMovieReview;

public class Link {
    // declare Link variables
    private String type;
    private String url;
    private String suggested_link_text;

    // create Link constructor to be used for creating new Link objects
    public Link(String type, String url, String suggested_link_text) {
        this.type = type;
        this.url = url;
        this.suggested_link_text = suggested_link_text;
    }

    // create getters
    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getSuggested_link_text() {
        return suggested_link_text;
    }
}