package com.example.birds;

public class BirdModel {
    private String name;
    private int Image;

    public BirdModel(String name, int image) {
        this.name = name;
        Image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return Image;
    }
}
