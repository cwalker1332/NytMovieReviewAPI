package com.example.NYTMovieReview;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class MovieReviewController {

    // create results/movie reviews to be added to resultList arrayList
    // create result/movie review 1
    private Link link1 = new Link("article", "http://www.nytimes.com/2019/06/06/movies/the-black-godfather-review.html", "Read the New York Times Review of The Black Godfather");
    private Multimedia multimedia1 = new Multimedia("mediumThreeByTwo210", "https://static01.nyt.com/images/2019/06/05/arts/blackgodfather1/blackgodfather1-mediumThreeByTwo210.jpg", 210, 140);
    private Results result1 = new Results("The Black Godfather", "", 0, "BEN KENIGSBERG", "'The Black Godfather'", "Reginald Hudlin’s documentary about Clarence Avant includes many golden anecdotes.", "2019-06-06", "2019-06-07", "2019-06-14 16:44:01", link1, multimedia1);

    // create result/movie review 2
    private Link link2 = new Link("article", "http://www.nytimes.com/2011/04/15/movies/square-grouper-movie-review.html","Read the New York Times Review of Square Grouper: The Godfathers of Ganja");
    private Multimedia multimedia2 = null;
    private Results result2 = new Results("Square Grouper: The Godfathers of Ganja", "R",0,"RACHEL SALTZ","Adventures in the Drug Trades","“Square Grouper” is a documentary about pot smuggling in South Florida in the 1970s and ’80s.","2011-04-14","2011-04-15","2017-11-02 04:18:13", link2, multimedia2);

    // create ArrayList that contains all of the results
    ArrayList<Results> resultList = new ArrayList<>(Arrays.asList(result1, result2));


    @GetMapping("/movieReview")
    public MovieReview movieReview(){
        // return new MovieReview object
        return new MovieReview("OK", "Copyright (c) 2020 The New York Times Company. All Rights Reserved.", false, 10, resultList);
    }
}
