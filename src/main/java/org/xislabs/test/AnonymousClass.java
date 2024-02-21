package org.xislabs.test;

interface DemoAno {
    void meth1();

    void meth2();
}

//class AnonyDemo implements DemoAno {
//    void display() {
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am method 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am method 2");
//
//    }
//}

public class AnonymousClass {
    public static void main(String[] args) {
        DemoAno obj = new DemoAno() {
            @Override
            public void meth1() {
                        System.out.println("I am method 1");
            }

            @Override
            public void meth2() {
                System.out.println("I am method 2");

            }
        };
        obj.meth1();
        obj.meth2();
    }
}
