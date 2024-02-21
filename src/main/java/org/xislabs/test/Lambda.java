package org.xislabs.test;

@FunctionalInterface
interface AnoDemo {
    void meth1();
}

//class example implements AnoDemo {
//
//    @Override
//    public void meth1() {
//        System.out.println("This is method 1");
//    }
//}

public class Lambda {
    public static void main(String[] args) {

// AnoDemo obj = new example();
//    obj.meth1();

        AnoDemo obj = () -> {
            System.out.println("I am method 1 from this lambda");
        };
        obj.meth1();

    }
}
