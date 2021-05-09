package com.example.recyclerviewdebicatm;

public class Fruit {
    private String name; // название
    private String description;  // описание
    private int image; // фото
    private String status;

    public Fruit(String name, String description, int image, String status){
        this.name=name;
        this.description=description;
        this.image = image;
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String avalability) {this.status = avalability; }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public  String getStatus( ) {return status;}
}
