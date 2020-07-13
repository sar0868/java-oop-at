package ru.geekbrains.java.oop.at;

abstract public class Let {

    protected int value;
    protected boolean next;

    public void setNext(boolean next) {
        this.next = next;
    }

    public boolean isNext() {
        return next;
    }

    public Let(int value) {
        this.value = value;
        this.next = true;

    }

    public int getValue() {
        return value;
    }

    public abstract void result(int attempt);
}
