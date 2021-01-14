package lesson1package.Interfaces;

public interface Obstructive {

    default void runTo(){
        System.out.println("Через препятствие перебежать нельзя");
    }

    default void jumpTo(){
        System.out.println("Через препятствие перепрыгнуть нельзя");
    }

}
