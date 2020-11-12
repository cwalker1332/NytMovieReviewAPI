package com.example.NYTMovieReview;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieReview {
    private String status = "OK";
    private String copyright = "Copyright (c) 2020 The New York Times Company. All Rights Reserved.";
    private boolean has_more = false;
    private int num_results = 10;

    // create results to be added to resultList arrayList
    private Link link1 = new Link("article", "http://www.nytimes.com/2019/06/06/movies/the-black-godfather-review.html", "Read the New York Times Review of The Black Godfather");
    private Multimedia multimedia1 = new Multimedia("mediumThreeByTwo210", "https://static01.nyt.com/images/2019/06/05/arts/blackgodfather1/blackgodfather1-mediumThreeByTwo210.jpg", 210, 140);
    private Results result1 = new Results("The Black Godfather", "", 0, "BEN KENIGSBERG", "'The Black Godfather'", "Reginald Hudlin’s documentary about Clarence Avant includes many golden anecdotes.", "2019-06-06", "2019-06-07", "2019-06-14 16:44:01", link1, multimedia1);
    private Link link2 = new Link("article", "http://www.nytimes.com/2011/04/15/movies/square-grouper-movie-review.html","Read the New York Times Review of Square Grouper: The Godfathers of Ganja");
    private Multimedia multimedia2 = null;
    private Results result2 = new Results("Square Grouper: The Godfathers of Ganja", "R",0,"RACHEL SALTZ","Adventures in the Drug Trades","“Square Grouper” is a documentary about pot smuggling in South Florida in the 1970s and ’80s.","2011-04-14","2011-04-15","2017-11-02 04:18:13", link2, multimedia2);

    private ArrayList<Results> resultList = new ArrayList<>(Arrays.asList(result1, result2));

    /*
    display_title: "Square Grouper: The Godfathers of Ganja",
mpaa_rating: "R",
critics_pick: 0,
byline: "RACHEL SALTZ",
headline: "Adventures in the Drug Trades",
summary_short: "“Square Grouper” is a documentary about pot smuggling in South Florida in the 1970s and ’80s.",
publication_date: "2011-04-14",
opening_date: "2011-04-15",
date_updated: "2017-11-02 04:18:13",
link: {
type: "article",
url: "http://www.nytimes.com/2011/04/15/movies/square-grouper-movie-review.html",
suggested_link_text: "Read the New York Times Review of Square Grouper: The Godfathers of Ganja"
},
multimedia: null
     */

    // values for results:
    // "OK", "Copyright (c) 2020 The New York Times Company. All Rights Reserved.", false, 10, resultList

    public MovieReview() {
        this.status = status;
        this.copyright = copyright;
        this.has_more = has_more;
        this.num_results = num_results;
        this.resultList = resultList;
    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public int getNum_results() {
        return num_results;
    }

    public ArrayList<Results> getResultList() {
        return resultList;
    }

}
