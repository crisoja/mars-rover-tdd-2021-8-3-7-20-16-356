package com.afs.tdd;

public class MarsRover {
    RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

    public void executeCommand(String command) {
        if ("M".equals(command)) {
            move();
        }
    }

    public void move(){
        roverStatus.increment();
    }
}





