package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //직렬처리 - 순차적프로그래밍
        //자바의 병렬처리 >>> Thread(class),Runnable(interface) : 상속으로 구현
        //스레드 내부 순서 : start >> 실행대기(runnable) >> run() 동작
        //              >> sleep >> 일시정지 >> 인터럽트(interrupt)
        //              >>실행대기(runnable) >> run >> 반복
        //stop : 스레드의 즉시종료 - 불안전 종료
        //인터럽트 종료 : 일시정지 상태의 스레드에서 interruptedException을 발생시켜
        //          catch블럭문에서 실행대기상태로 가거나 스레드종료상태로 갈 수 있도록 해준다.

        //스레드 구현방법 - Thread 상속받는방법(ThreadExClass, 익명내부클래스, RunnableImpl)
        //1.ThreadEx 클래스를 만드시고 run()를 오버라이딩 하세요.


        ThreadEx tex = new ThreadEx();
        tex.start();
        System.out.println("tex.start()...............");

        //2.익명내부클래스
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("inner run()...");
                for (int i = 0; i < 10; i++) {
                    System.out.println("inner..."+i);
                    try {
                        Thread.sleep(500);// 1/1000초
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t.start();
        System.out.println("t.start()...............");


        //3.Runnable(인터페이스를 상속받는 클래스, 익명내부클래스)
        //3-1.RunnableImple 클래스 만들고 run() 오버라이딩 , 객체생성
        RunnableImpl r = new RunnableImpl();
        new Thread(r).start();

        //3-2 Runable 이용한 익명내부클래스로 구현하기
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runnable inner..."+i);
                    try {
                        Thread.sleep(500);// 1/1000초
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        r2.run();



        System.out.println("end main...");



    }//end main

}//end class
