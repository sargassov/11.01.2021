package lesson1package;

import lesson1package.WorkingDays.*;
import lesson1package.Obstacles.*;
import lesson1package.Essences.*;
import lesson1package.Interfaces.*;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
//        Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны
//        выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
//        (успешно пробежал, не смог пробежать и т.д.).
//        3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//        4. * У препятствий есть длина (для дорожки) или высота (для стены),
//        а участников ограничения на бег и прыжки. Если участник не смог пройти одно
//        из препятствий, то дальше по списку он препятствий не идет.
//        5. Задание с перечислениями. Задание прикреплено в материалах

        Jumpable[] EssenceRepository = {
                new Cat("Кот 1", 2000, 4),
                new Man("Человек 1", 300, 1),
                new Robot("Робот 1", 20000, 3000),
                new Cat("Кот 2", 430, 2),
                new Man("Человек 2", 456, 2),
                new Robot("Робот 2", 100000, 23355)
        };

        Obstructive[] ObstacleRepository = {new RunningBoot(500,"Беговая дорожка 1"),
                new Wall(2,"Стена 1")};

        for(Jumpable j : EssenceRepository){
            boolean continueChallenge = true;

            if(j instanceof Cat) System.out.print(((Cat) j).getName());
            else if(j instanceof Man) System.out.print(((Man) j).getName());
            else System.out.print(((Robot) j).getName());

            System.out.println(" начал проходить испытание.\n");

            for(Obstructive o : ObstacleRepository){
                if(o instanceof RunningBoot){
                    o.jumpTo();
                    if(j instanceof Cat) continueChallenge = ((RunningBoot) o).isPassed(((Cat) j).getMaxRun());
                    else if(j instanceof Man) continueChallenge = ((RunningBoot) o).isPassed(((Man) j).getMaxRun());
                    else ((RunningBoot) o).isPassed(((Robot) j).getMaxRun());
                }
                else {
                    o.runTo();
                    if(j instanceof Cat) continueChallenge = ((Wall) o).isPassed(((Cat) j).getMaxJump());
                    else if(j instanceof Man) continueChallenge = ((Wall) o).isPassed(((Man) j).getMaxJump());
                    else ((Wall) o).isPassed(((Robot) j).getMaxJump());
                }

                System.out.println(continueChallenge ? "испытание пройдено" : "не смог пройти");
                if(!continueChallenge){
                    System.out.println("выбывает из соревнования");
                    break;
                }
            }
        }


//        Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
//        С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заданному текущему дню.
//
//                Возвращает кол-во оставшихся рабочих часов до конца
//        недели по заданному текущему дню. Считается, что
//        текущий день ещё не начался, и рабочие часы за него
//        должны учитываться.
//        Если заданный день выходной то вывести "Сегодня выходной"
//        public class DayOfWeekMain {
//
//            public static void main(String[] args) {
//                System.out.println(getWorkingHours(DayOfWeek.MONDAY));
//            }
        Scanner sc = new Scanner(System.in);
        System.out.print("------------------------\n\nВведите порядковый номер дня недели. От 1 до 7: ");
        int currentDay = sc.nextInt();

        WeekDays weekDays = new WeekDays(--currentDay);
        Object o = weekDays.workingHoursUntilEndOfWeek();
        if(o instanceof String) System.out.println(o);
        else{
            System.out.println("Сегодня " + weekDays.getDays()[currentDay] + ". Осталось работать " + o + " часов");
        }
    }
}
