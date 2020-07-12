package ru.geekbrains.java.oop.at;

abstract public class Let {

    protected int value;
    protected boolean next;
    protected boolean letType;

    public boolean isLetType() {
        return letType;
    }

    public void setLetType(boolean letType) {
        this.letType = letType;
    }


    public void setNext(boolean next) {
        this.next = next;
    }

    public boolean isNext() {
        return next;
    }

    public Let(int value) {
        this.value = value;
        this.next = true;
        this.letType = true;

    }

    public int getValue() {
        return value;
    }

    public abstract void result(int attempt);

}
