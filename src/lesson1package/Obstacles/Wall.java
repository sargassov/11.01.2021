package lesson1package.Obstacles;

import lesson1package.Interfaces.Obstructive;

public class Wall implements Obstructive {

    private int wallHeight;
    private String name;

    public Wall(int wallHeight, String name){
        this.name = name;
        this.wallHeight = wallHeight;
    }

    public boolean isPassed(int heightJump){
        return heightJump <= wallHeight;
    }
}
