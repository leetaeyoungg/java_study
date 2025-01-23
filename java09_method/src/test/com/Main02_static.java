package test.com;

public class Main02_static {
    public static void main(String[] args) {
        System.out.println("hello...");

        //static 속성 접근시 클래스 이름으로 접근가능
        System.out.println(TestStatic.num);
        System.out.println(TestStatic.name);


        //함수에 static 부여 : 객체생성없이 클래스 이름으로 접근가능
        TestStatic.start();

        //내부클래스(중첩클래스)에 static 부여가능
        System.out.println(TestStatic.Car.id);
        TestStatic.Car.stop();

        //Main02_static.test(); // 클래스이름 생략
        test();
        // non-instance method

        new Main02_static().test2(); // static - none static
        //객체생성이 필요한 method : instance method)
    }//end main

    private static void test() {
        System.out.println("test()");
    }

    private void test2() {
        System.out.println("test2()");
    }


}//end class
