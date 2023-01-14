package com.driver;

public class A {
    public String meth(){
        String r="Invoking method from class A";
        return r;
    }
}
class B extends A{
    public String meth(){
        String s = "Method is overridden in Extendend class B";
        return s;
    }
}