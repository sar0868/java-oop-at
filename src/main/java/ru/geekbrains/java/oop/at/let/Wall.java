package ru.geekbrains.java.oop.at.let;

import ru.geekbrains.java.oop.at.action.Action;

public class Wall extends Let{

    public Wall(int value) {
        super(value);
    }

    public void result(Action action) {
        if (action.isNext()) {
            if (getValue() <= action.getHeight()){
                System.out.println(action.getName() + " успешно перепрыгнул " + getValue() + " cм.");
            }
            else {
                System.out.println(action.getName() + " успешно перепрыгнул " + getValue() + " cм.");
                action.setNext(false);
            }
        }
    }
}
