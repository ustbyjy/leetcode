package com.yan.leetcode;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(Math.ceil((double) 28 / 18));
        System.out.println((int) Math.ceil((double) 28 / 18));
        String str = null;
        str = "haha";
        String str1 = str;
        System.out.println(str + ": " + str.hashCode());
        str = "nihao";
        System.out.println(str1 + ": " + str1.hashCode());
        System.out.println(str + ": " + str.hashCode());

        A a = new B();
        a.m();
    }
}

class A {
    public void m() {
        if (this instanceof A) {
            System.out.println("It's the instance of A");
        }
        if (this instanceof B) {
            System.out.println("It's the instance of B");
        }
    }
}

class B extends A {
    @Override
    public void m() {
        super.m();
    }
}
