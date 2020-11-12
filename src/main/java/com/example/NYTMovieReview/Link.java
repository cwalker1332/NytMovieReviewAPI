package com.example.NYTMovieReview;

public class Link {
    private String type;
    private String url;
    private String suggested_link_text;

    // values:
    // "article", "http://www.nytimes.com/2019/06/06/movies/the-black-godfather-review.html", "Read the New York Times Review of The Black Godfather"

    public Link(String type, String url, String suggested_link_text) {
        this.type = type;
        this.url = url;
        this.suggested_link_text = suggested_link_text;
    }

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