package com.areeb.zindagi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrendingResponse {
@SerializedName("page")
    @Expose
    private int page;

@SerializedName("results")
    @Expose
    private List<results> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<com.areeb.zindagi.model.results> getResults() {
        return results;
    }

    public void setResults(List<com.areeb.zindagi.model.results> results) {
        this.results = results;
    }

    public TrendingResponse(int page, List<com.areeb.zindagi.model.results> results) {
        this.page = page;
        this.results = results;
    }
}
