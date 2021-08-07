package com.afs.tdd;

public enum DirectionEnum {
    North("N"),
    South("S"),
    East("E"),
    West("W");

    public String direction;

    DirectionEnum(String direction) {
        this.direction = direction;
    }
}