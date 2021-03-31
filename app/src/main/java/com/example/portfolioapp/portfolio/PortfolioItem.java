package com.example.portfolioapp.portfolio;

import java.io.Serializable;

public class PortfolioItem  implements Serializable {

    private int image;
    private String title, Description;

    public PortfolioItem(int educated) {
    }


    public PortfolioItem(int image, String title, String description) {
        this.image = image;
        this.title = title;
        Description = description;
    }

    public PortfolioItem(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
