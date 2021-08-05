package com.afs.tdd;

public class MarsRover {
    RoverStatus roverStatus;
    private static final String[] direction = {"N","E","S","W"};
    private static final String M = "M";
    private static final String L = "L";

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

    public void executeCommand(String command) {
        if (M.equals(command)) {
            move();
        }
        else if(L.equals(command)){
            turnLeft();
        }
        else
            turnRight();
    }

    private void turnRight() {
        if(direction[0].equals(roverStatus.getDirection())){
            roverStatus.setDirection(direction[1]);
        }
        else if(direction[2].equals(roverStatus.getDirection())){
            roverStatus.setDirection(direction[3]);
        }
    }

    private void turnLeft() {
        if(direction[0].equals(roverStatus.getDirection())){
        roverStatus.setDirection(direction[3]);
        }
        else if(direction[2].equals(roverStatus.getDirection())){
            roverStatus.setDirection(direction[1]);
        } else if(direction[1].equals(roverStatus.getDirection())){
            roverStatus.setDirection(direction[0]);
        }

    }

    public void move() {
        if (direction[2].equals(roverStatus.getDirection())) {
            roverStatus.decrement();
        } else if (direction[0].equals(roverStatus.getDirection())) {
            roverStatus.incrementY();
        } else if (direction[1].equals(roverStatus.getDirection())){
            roverStatus.incrementX();
        }


    }
}





