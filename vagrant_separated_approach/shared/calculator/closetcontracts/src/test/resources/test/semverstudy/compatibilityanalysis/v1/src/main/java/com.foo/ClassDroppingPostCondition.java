package com.foo;
import javax.validation.constraints.NotNull;
public class ClassDroppingPostCondition {
    @NotNull
    public static Object foo(int i) {
        return "something";
    }
}