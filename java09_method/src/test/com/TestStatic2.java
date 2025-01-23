package test.com;

public class TestStatic2 {

    static int num;
    static String name = "lee";


    public static void start() {
        System.out.println("start()...");
    }

    static class Car{
        static String id = "admin";
        static void stop(){
            System.out.println("stop()...");
        }
    }

}
