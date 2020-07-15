package ru.geekbrains.java.oop.at;

public interface Action {

    String name = null;
    boolean next = true;

    void run();
    void jump();
    int getLength();
    void setNext(boolean next);
    boolean isNext();
    int getHeight();
    String getName();


}
