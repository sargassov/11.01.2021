package lesson1package.Obstacles;

import lesson1package.Interfaces.Obstructive;

public class RunningBoot implements Obstructive {

    private int longBoot;
    private String name;

    public RunningBoot(int longBoot, String name){
        this.name = name;
        this.longBoot = longBoot;
    }

    public boolean isPassed(int longRun){
        return longRun <= longBoot;
    }
}
