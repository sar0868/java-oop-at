package ru.geekbrains.java.oop.at;

public class Start {
    private static Object Treadmill;

    public static void main(String[] args) {
        int typeLets = 0;
        Action vasya = new Cat("Vasya", 3, 20);
        Action ivan = new Man("Иван", 10, 100);
        Action robot = new Robot("Robot", 50, 200);
        Let treadmill1 = new Treadmill(2);
        Let treadmill2 = new Treadmill(10);
        Let treadmill3 = new Treadmill(22);
        Let wall1 = new Wall(10);
        Let wall2 = new Wall(100);
        Let wall3 = new Wall(200);

        Let[] lets = {treadmill1, wall1, treadmill2, wall2, treadmill3, wall3};
        Action[] actions = {vasya, ivan, robot};

        for (int j = 0; j < lets.length; j++) {
            for (int i = 0; i < actions.length; i++) {
                lets[j].result(actions[i]);
            }
        }
    }
}
