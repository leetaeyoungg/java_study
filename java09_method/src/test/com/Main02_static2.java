package test.com;

public class Main02_static2 {
    public static void main(String[] args) {
        System.out.println("hello...");

        System.out.println(TestStatic2.num);
        System.out.println(TestStatic2.name);

        TestStatic2.start();

        System.out.println(TestStatic2.Car.id);
        TestStatic2.Car.stop();

        test();

        new Main02_static2().test2();


    }//end main

    private static void test() {
        System.out.println("test()");
    }

    private void test2(){
        System.out.println("test2()");
    }


}//end class
