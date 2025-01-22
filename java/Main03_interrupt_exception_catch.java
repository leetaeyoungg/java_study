package test.com;

public class Main03_interrupt_exception_catch {
    public static void main(String[] args) {
        System.out.println("hello");

        //스레드제어 : 스레드 종료(정지)

        //2.interrupt() + Thread.sleep(0.001)
        //PrintThreadEx02 클래스를 생성하고 스레드로 동작 구현

        PrintThreadEx02 p02 = new PrintThreadEx02();
        p02.start();

        try{
            Thread.sleep(1000);
            //interrupt메소드로 익셉션캐치되도록 처리
            p02.interrupt();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException....");
            //throw new RuntimeException(e);
        }
        System.out.println("end main...");
    }//end main

}//end class
