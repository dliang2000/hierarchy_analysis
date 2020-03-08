package com.foo;

public class ClassIntroducingPreCondition {
    public static void foo(int i) {
        if (i<0) throw new IllegalArgumentException("cannot be null");
    }
}