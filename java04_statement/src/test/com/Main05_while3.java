package test.com;

public class Main05_while3 {
    public static void main(String[] args) {
        System.out.println("hello");

        //while(boolean type){}
        //주의** 무한반복문일 경우 하단코딩은 컴파일 오류가난다.
        //if(분기문)break; 처리가 존재해야 while문 하단에서 컴파일 오류가 나지 않는다.
        String x = "y";
        while (true){
            System.out.println("x:"+x);
            x = "x";
            System.out.println("x:"+x);
            if(x.equals("x"))break;
        }
        System.out.println("end main...");

    }// end main
}//end class
