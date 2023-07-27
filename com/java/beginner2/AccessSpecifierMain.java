package com.java.beginner2;

import com.java.beginner.AccessSpecifier;

public class AccessSpecifierMain extends AccessSpecifier{
    public static void main(String[] args) {
        AccessSpecifier as = new AccessSpecifier();
        as.method1();

        AccessSpecifierMain asm = new AccessSpecifierMain();
        asm.method4();
        asm.method1();

    }
}
