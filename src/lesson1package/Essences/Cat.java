package lesson1package.Essences;

import lesson1package.Interfaces.Jumpable;
import lesson1package.Interfaces.Runnable;

public class Cat implements Runnable, Jumpable {

    private String name;

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public boolean isPassedTest() {
        return passedTest;
    }

    private int maxRun;
    private int maxJump;
    private boolean passedTest = true;

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }

    public Cat(String name, int maxRun, int maxJump){
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

}