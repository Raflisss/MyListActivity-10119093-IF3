package com.example.if3_10119093_mylistactivity;

public class MyModel {

    String titlw, description;
    int image;

    public MyModel(String titlw, String description, int image) {
        this.titlw = titlw;
        this.description = description;
        this.image = image;
    }

    public String getTitlw() {
        return titlw;
    }

    public void setTitlw(String titlw) {
        this.titlw = titlw;
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
