package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //1.인터페이스란 ?
        //다중상속을 지원하는 툴
        //- 인터페이스와 인터페이스간의 다중상속
        // :: extends TestInter01,TestInter02
        //- 클래스는 인터페이스를 다중상속
        //모든 전역변수 : public static final (생략가능)
        //메소드의 종류 : default,static,abstract(*오버라이딩)
        //생성자가 없다.

        TestClass tc = new TestClass();
        tc.start();
        tc.sleep();
        tc.study();
        System.out.println("================");

        System.out.println(TestInter03.USER_NAME);
        TestInter03.stop();

        System.out.println("================");

        //인터페이스타입 초기화 방법 1. 다형성
        TestInter03 ti03 = new TestClass();
        ti03.sleep();
        ti03.start();

        System.out.println("================");
        //인터페이스타입 초기화 방법 2. 익명내부클래스
        TestInter03 ti04 = new TestInter03() {
            @Override
            public void sleep() {
                System.out.println("inner sleep()");
            }
        };

        ti04.sleep();
        ti04.start();

    }//end main
}//end class
