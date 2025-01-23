package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05_while5 {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //while(boolean type){}
        //주의** 무한반복문일 경우 하단코딩은 컴파일 오류가난다.
        //if(분기문)break; 처리가 존재해야 while문 하단에서 컴파일 오류가 나지 않는다.
        String x = "";
//        while (!x.equals("x")){
//            System.out.println("종료하려면 x 입력:"+x);
//            x = br.readLine();
//            System.out.println(x+"를 입력하셨습니다.");
//
//        }

        while (true){
            System.out.println("종료하려면 x 입력:"+x);
            x = br.readLine();
            System.out.println(x+"를 입력하셨습니다.");
            if(x.equals("x"))break;
        }
        System.out.println("end main...");

    }// end main
}//end class
