package com.java.beginner;

public class StaticDemo {

    // static methods can be called without creating object of the class
    // static belongs to the class and will be shared by all the objects

    public static void show(){
        System.out.println("Show Static Method called without Creating object");
    }

    // To call nn static methods we should first create object
    public void display(){
        System.out.println("Display should be called with creating object");
    }

    public static void main(String[] args) {
        show();
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.display();
    }
}
