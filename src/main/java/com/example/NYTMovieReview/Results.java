package com.example.NYTMovieReview;

public class Results {
    // declare Results variables
    private String display_title;
    private String mpaa_rating;
    private int critics_pick;
    private String byline;
    private String headline;
    private String summary_short;
    private String publication_date;
    private String opening_date;
    private String date_updated;
    private Link link;
    private Multimedia multimedia;

    // create Results constructor to be used to make new Results objects
    public Results(String display_title, String mpaa_rating, int critics_pick, String byline, String headline, String summary_short, String publication_date, String opening_date, String date_updated, Link link, Multimedia multimedia) {
        this.display_title = display_title;
        this.mpaa_rating = mpaa_rating;
        this.critics_pick = critics_pick;
        this.byline = byline;
        this.headline = headline;
        this.summary_short = summary_short;
        this.publication_date = publication_date;
        this.opening_date = opening_date;
        this.date_updated = date_updated;
        this.link = link;
        this.multimedia = multimedia;
    }

    // create getters
    public String getDisplay_title() {
        return display_title;
    }

    public String getMpaa_rating() {
        return mpaa_rating;
    }

    public int getCritics_pick() {
        return critics_pick;
    }

    public String getByline() {
        return byline;
    }

    public String getHeadline() {
        return headline;
    }

    public String getSummary_short() {
        return summary_short;
    }

    public String getPublication_date() {
        return publication_date;
    }

    public String getOpening_date() {
        return opening_date;
    }

    public String getDate_updated() {
        return date_updated;
    }

    public Link getLink() {
        return link;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }
}
