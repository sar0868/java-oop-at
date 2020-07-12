package ru.geekbrains.java.oop.at;

public class Treadmill extends Let {

    public Treadmill(int value) {
        super(value);
    }

    public void result(int attempt){
        if (attempt >= getValue()){
            System.out.println("успешно пробежал " + getValue() + " м.");
            setNext(true);
            setLetType(false);
        } else {
            System.out.println("не смог пробежать " + getValue() + " м.");
            setNext(false);
        }
    }
}
