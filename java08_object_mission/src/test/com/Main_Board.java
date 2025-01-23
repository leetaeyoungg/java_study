package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Board {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Board[] bds = new Board[3];


        for (int i = 0; i < bds.length; i++) {

            System.out.println("제목 : ");
            String title = br.readLine();
            System.out.println("내용 : ");
            String content = br.readLine();
            System.out.println("작성자 : ");
            String writer = br.readLine();
            System.out.println("작성일자 : ");
            String wdate = br.readLine();

            Board bd = new Board(i+1,title,content,writer,wdate);

            bds[i]=bd;
        }

        for (Board x : bds){
            System.out.println(x);
        }

        //**로컬변수 사용규칙(전역변수는 초기화안하면 기본값이 할당되지만)
        int x =10;
        //로컬변수는 선언시 초기화하거나
        int y;
        y = 20;
        //출력전 초기화하여야한다.

        //로컬변수의 상수화 : final 읽기전용(readonly),
        //단 한번만 초기화가능 (선언시 or 사용전 1회)
        final int z = 100;
        // z = 200; *error

    }//end main

}//end class
