package com.areeb.zindagi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class results {

    @SerializedName("poster_path")
    @Expose

    private String poster_path;

    public results(String poster_path, int vote_average) {
        this.poster_path = poster_path;
        this.vote_average = vote_average;
    }

    @SerializedName("vote_average")
    @Expose

    private  float  vote_average;

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public  float getVote_average() {
        return vote_average;
    }

    public void setVote_average(int vote_average) {
        this.vote_average = vote_average;
    }
}
