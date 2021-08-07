package com.afs.tdd;

public class MarsRover {
    RoverStatus roverStatus;
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
        if(DirectionEnum.North.direction.equals(roverStatus.getDirection())){
            roverStatus.setDirection(DirectionEnum.East.direction);
        }
        else if(DirectionEnum.East.direction.equals(roverStatus.getDirection())){
            roverStatus.setDirection(DirectionEnum.South.direction);
        }
        else if(DirectionEnum.South.direction.equals(roverStatus.getDirection())){
        roverStatus.setDirection(DirectionEnum.West.direction);
        }
        else
            roverStatus.setDirection(DirectionEnum.North.direction);
    }

    private void turnLeft() {
        if(DirectionEnum.North.direction.equals(roverStatus.getDirection())){
        roverStatus.setDirection(DirectionEnum.West.direction);
        }
        else if(DirectionEnum.East.direction.equals(roverStatus.getDirection())){
            roverStatus.setDirection(DirectionEnum.North.direction);
        }
        else if(DirectionEnum.South.direction.equals(roverStatus.getDirection())){
            roverStatus.setDirection(DirectionEnum.East.direction);
        }
        else
            roverStatus.setDirection(DirectionEnum.South.direction);
    }

    public void move() {
        if (DirectionEnum.South.direction.equals(roverStatus.getDirection())) {
            roverStatus.decrementY();
        } else if (DirectionEnum.North.direction.equals(roverStatus.getDirection())) {
            roverStatus.incrementY();
        } else if (DirectionEnum.East.direction.equals(roverStatus.getDirection())){
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





