package com.afs.tdd;

public class MarsRover {
    RoverStatus roverStatus;
    private String[] direction = {"N","E","S","W"};
    private static final String M = "M";
    private static final String L ="L";
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
        if("N".equals(roverStatus.getDirection())){
            roverStatus.setDirection(direction[1]);
        }
    }

    private void turnLeft() {
        if("N".equals(roverStatus.getDirection())){
        roverStatus.setDirection(direction[3]);
        }
    }


    public void move(){
        roverStatus.increment();
    }
}





