package test.com;

public interface TestInter03 extends TestInter01,TestInter02 {

    //모든 전역변수 : public static final (생략가능)
    String USER_NAME = "java";


    //메소드의 종류 : default,static,abstract
    public default void start(){
        System.out.println("default start()");
    }

    public static void stop(){
        System.out.println("static stop()");
    }

    public /*abstract*/ void sleep();

}
