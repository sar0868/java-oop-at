package ru.geekbrains.java.oop.at;

public class Cat  implements Action{

    private int length;
    private int height;
    private String name;
    private boolean next;

    public Cat(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
        this.next = true;
    }
    public void setNext(boolean next) {
        this.next = next;
    }

    public boolean isNext() {
        return next;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
    public String getName() {
        return name;
    }

    public void run() {
        System.out.println(name + " пробежал: " + getLength() + " м");
    }

    public void jump() {
        System.out.println(name + " прыгнул на: " + getHeight() + " см");;
    }
}
