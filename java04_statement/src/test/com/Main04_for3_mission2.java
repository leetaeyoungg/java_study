package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main04_for3_mission2 {
    public static void main(String[] args) {
        System.out.println("hello");

        //java.io (input-output:입출력) - 콘솔입력처리(System.in)
        Scanner s = new Scanner(System.in);

        String text = "";

        for (int i = 0; i < 3; i++) {

            System.out.print("이름:");
            String name = s.nextLine();

            System.out.print("국어:");
            int kor = Integer.parseInt(s.nextLine());

            System.out.print("영어:");
            int eng = Integer.parseInt(s.nextLine());

            System.out.print("수학:");
            int math = Integer.parseInt(s.nextLine());

            int total=kor+eng+math;

            double avg = total/3.0;

            String grade = "A";
            if (avg<=100 && avg>=90){
                grade = "A";
            } else if (avg>=80) {
                grade = "B";
            } else if (avg>=70) {
                grade = "C";
            } else{
                grade = "D";
            }


            text += String.format("이름:%s 국어:%d 영어:%d 수학:%d 총점:%d 평균:%.1f 등급:%s\n",
                        name,kor,eng,math,total,avg,grade);



        }
        //반복문 종료후 아래와 같이 3줄로 출력되도록

        System.out.println(text);



    }//end main
}//end class
