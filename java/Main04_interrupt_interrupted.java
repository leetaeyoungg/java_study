package test.com;

public class Main04_interrupt_interrupted {
    public static void main(String[] args) {
        System.out.println("hello");

        //스레드제어 : 스레드 종료(정지)

        //3.interrupt() + Thread.interrupted()+break;
        //

        PrintThreadEx03 p03 = new PrintThreadEx03();
        p03.start();

        try{
            Thread.sleep(1000);
            p03.interrupt();
        } catch (InterruptedException e) {
           throw new RuntimeException(e);
        }
        System.out.println("end main...");
    }//end main

}//end class
