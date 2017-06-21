package com.example.hanoi_towers_service.model;

/**
 * Created by esuarezv on 21/06/2017.
 */
public class Disk {

    private int radius;
    private int height;

    public Disk(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
