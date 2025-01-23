package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06_do_while {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //while(boolean type){}
        //주의** 무한반복문일 경우 하단코딩은 컴파일 오류가난다.
        //if(분기문)break; 처리가 존재해야 while문 하단에서 컴파일 오류가 나지 않는다.
        //do-while문은 false 여도 무조건 1번은 실행한다.


        String x = "";


        do{
            System.out.println("종료하려면 x 입력:"+x);
            x = br.readLine();
            System.out.println(x+"를 입력하셨습니다.");
        }while (!x.equals("x"));


//        boolean bool = true;
//        do{
//            System.out.println("종료하려면 x 입력:"+x);
//            x = br.readLine();
//            System.out.println(x+"를 입력하셨습니다.");
//            if(x.equals("x"))break;
//        }while(bool);
        System.out.println("end main...");

    }// end main
}//end class
