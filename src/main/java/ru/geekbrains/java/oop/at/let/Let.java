package ru.geekbrains.java.oop.at.let;

import ru.geekbrains.java.oop.at.action.Action;

abstract public class Let {

    protected int value;

    public Let(int value) {
        this.value = value;
//        this.next = true;
    }

    public int getValue() {
        return value;
    }

    public abstract void result(Action action);
}
