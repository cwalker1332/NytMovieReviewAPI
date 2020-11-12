package com.example.NYTMovieReview;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MovieReviewController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/movieReview")
    public MovieReview movieReview(){

        // return new MovieReview object
        return new MovieReview();
    }
}
