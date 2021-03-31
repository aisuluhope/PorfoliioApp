package com.example.portfolioapp.cv;

public class CVitems {
    private String title;
    private String description;

    public CVitems(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public CVitems() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
