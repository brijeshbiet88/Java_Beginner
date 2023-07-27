package com.java.beginner;

public class HelloWorld {
    // public , protected , default and private
    // static means we need not to create object of that class
    // void is a return type
    // main is the method name
    //String [] args . Array of String where we can pass some argueemnts
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Arguement length = "+args.length);
       // for (String s : args)
           // System.out.println(s);

        for (int i = 0 ; i < args.length ;) {
            System.out.print(args[i]+" ");
            i++;
        }
    }
}
