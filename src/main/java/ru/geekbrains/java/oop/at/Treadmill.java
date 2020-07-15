package ru.geekbrains.java.oop.at;

public class Treadmill extends Let {

    public Treadmill(int value) {
        super(value);
    }

//    public void result(int attempt) {
//        if (attempt >= getValue()) {
//            System.out.println("успешно пробежал " + getValue() + " м.");
//            setNext(true);
//        } else {
//            System.out.println("не смог пробежать " + getValue() + " м.");
//            setNext(false);
//        }
//    }

    public void result(Action action) {
        if (action.isNext()) {
            if (getValue() >= action.getLength()){
                System.out.println(action.getName() + " успешно пробежал " + getValue() + " м.");
            }
            else {
                System.out.println(action.getName() + " не смог пробежать " + getValue() + " м.");
                action.setNext(false);
            }
        }
    }
}
