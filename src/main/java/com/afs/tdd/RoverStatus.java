package com.afs.tdd;

public class RoverStatus {
    private int locationX;
    private int locationY;
    private String direction;


    public RoverStatus(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;

    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void incrementY(){
        locationY++;
    }

    public void decrement(){
        locationY--;
    }

    public void incrementX(){
        locationX++;
    }

    public void decrementX(){
        locationX--;
    }


}
