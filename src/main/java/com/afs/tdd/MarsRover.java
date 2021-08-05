package com.afs.tdd;

public class MarsRover {
    RoverStatus roverStatus;
    private static final String[] direction = {"N","E","S","W"};
    private static final String MOVE = "M";
    private static final String LEFT = "L";


    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

    public void executeCommand(String command) {
        if (MOVE.equals(command)) {
            move();
        }
        else if(LEFT.equals(command)){
            turnLeft();
        }
        else
            turnRight();
    }

    private void turnRight() {
        if(direction[0].equals(roverStatus.getDirection())){
            roverStatus.setDirection(direction[1]);
        }
        else if(direction[1].equals(roverStatus.getDirection())){
            roverStatus.setDirection(direction[2]);
        }
        else if(direction[2].equals(roverStatus.getDirection())){
        roverStatus.setDirection(direction[3]);
        }
        else
            roverStatus.setDirection(direction[0]);
    }

    private void turnLeft() {
        if(direction[0].equals(roverStatus.getDirection())){
        roverStatus.setDirection(direction[3]);
        }
        else if(direction[1].equals(roverStatus.getDirection())){
            roverStatus.setDirection(direction[0]);
        }
        else if(direction[2].equals(roverStatus.getDirection())){
            roverStatus.setDirection(direction[1]);
        }
        else
            roverStatus.setDirection(direction[2]);
    }

    public void move() {
        if (direction[2].equals(roverStatus.getDirection())) {
            roverStatus.decrementY();
        } else if (direction[0].equals(roverStatus.getDirection())) {
            roverStatus.incrementY();
        } else if (direction[1].equals(roverStatus.getDirection())){
            roverStatus.incrementX();
        } else
            roverStatus.decrementX();
    }

    public void executeMultipleCommands(String commands) {
        for(int i = 0; i < commands.length(); i++){
            executeCommand(String.valueOf(commands.charAt(i)));
        }
    }
}





