package com.java.beginner;

public class AccessSpecifier {

    // can be accessed from anywhere. Highest visibilty
    public void method1(){
        System.out.println("Public Method");
    }

    // Can be accessed from class only. Lowest visibility
    private void method2(){
        System.out.println("Private Method");
    }

    // can be accessed from the same package
    void method3(){
        System.out.println("Default Method");
    }

    // Can be accessed from the same package and subclassed outside the package
    protected void method4(){
        System.out.println("Protected Method");
    }

    public static void main(String[] args) {
        AccessSpecifier as = new AccessSpecifier();
        as.method2();
    }

}
