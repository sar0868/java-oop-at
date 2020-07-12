package ru.geekbrains.java.oop.at;

public class Start {
    public static void main(String[] args) {
        int typeLets = 0;
        Cat vasya = new Cat("Vasya", 3, 20);
        Man ivan = new Man("Иван", 10, 100);
        Robot robot = new Robot("Robot", 50, 199);
        Let treadmill1 = new Treadmill(2);
        Let treadmill2 = new Treadmill(10);
        Let treadmill3 = new Treadmill(22);
        Let wall1 = new Wall(10);
        Let wall2 = new Wall(100);
        Let wall3 = new Wall(200);

        Let[] lets = {treadmill1, wall1, treadmill2, wall2, treadmill3, wall3};

        for (int i = 0; i < lets.length ; i++) {
            System.out.print(vasya.getName() + " ");
            if (lets[i].isLetType()){
                typeLets = vasya.getLength();
                System.out.println(lets[i].isLetType());
            } else {
                typeLets = vasya.getHeight();
            }
            System.out.println(typeLets);
            lets[i].result(typeLets);
            if (!lets[i].isNext()){
                break;
            }
        }
//        for (int i = 0; i < lets.length ; i++) {
//            System.out.print(ivan.getName() + " ");
//            if (lets[i].isLetType()){
//                typeLets = ivan.getLength();
//            } else typeLets = ivan.getHeight();
//            lets[i].result(typeLets);
//            if (!lets[i].isNext()){
//                break;
//            }
//        }
//        for (int i = 0; i < lets.length; i++) {
//            System.out.print(robot.getName() + " ");
//            if (lets[i].isLetType()){
//                typeLets = robot.getLength();
//            } else typeLets = robot.getHeight();
//            lets[i].result(typeLets);
//            if (!lets[i].isNext()){
//                break;
//            }
//        }
    }
}
