package com.example.portfolioapp.books;

public class BookItems {
    private String title, description;
    private int image;

    public BookItems(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public BookItems() {

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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
