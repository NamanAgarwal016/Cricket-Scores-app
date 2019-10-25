package com.example.android.crickettalks;

public class Product {

    private String image;
    private String title, shortdesc, opponent, india;


    public Product(){

    }

    public Product(String image, String title, String shortdesc, String india, String opponent) {
        this.image = image;
        this.title = title;
        this.shortdesc = shortdesc;
        this.india = india;
        this.opponent = opponent;
    }



    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getIndia() {
        return india;
    }

    public String getOpponent() {
        return opponent;
    }
}
