package test.com;

public class Main02_setter_stop {
    public static void main(String[] args) {
        System.out.println("hello");

        //스레드제어 : 스레드 종료(정지)

        //1.전역변수의 활용으로 스레드 제어하기.
        //PrintThreadEx01 클래스를 생성하고 스레드로 동작 구현

        PrintThreadEx01 p01 = new PrintThreadEx01();
        p01.start();

        //스레드 스타트 시키고 1초정도 쉬었다가 정지 시키려한다.
        try {
            Thread.sleep(1000);
            p01.setStop(true);
            //스레드 종료용 세터메소드로 true전달해준다.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end main...");
    }//end main

}//end class
