package ru.geekbrains.java.oop.at;

public class Wall extends Let{

    public Wall(int value) {
        super(value);
    }

    public void result(int attempt) {
        if (attempt >= getValue()){
            System.out.println("успешно перепрыгнул " + getValue() + " см.");
            setNext(true);
        } else {
            System.out.println("не смог перепрыгнуть " + getValue() + " см.");
            setNext(false);
        }
    }
}
