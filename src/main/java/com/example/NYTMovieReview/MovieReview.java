package com.example.NYTMovieReview;

import java.util.ArrayList;

public class MovieReview {
    // declare MovieReview variables
    private String status;
    private String copyright;
    private boolean has_more;
    private int num_results;
    private ArrayList<Results> resultList;

    // create MovieReview constructor to be used to create new MovieReview objects
    public MovieReview(String status, String copyright, boolean has_more, int num_results, ArrayList<Results> resultList) {
        this.status = status;
        this.copyright = copyright;
        this.has_more = has_more;
        this.num_results = num_results;
        this.resultList = resultList;
    }

    // create getters
    public String getStatus() { return status; }

    public String getCopyright() { return copyright; }

    public boolean isHas_more() { return has_more; }

    public int getNum_results() { return num_results; }

    public ArrayList<Results> getResultList() { return resultList; }

}
