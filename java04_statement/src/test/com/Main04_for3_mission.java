package test.com;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04_for3_mission {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        //java.io (input-output:입출력) - 콘솔입력처리(System.in)
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        String text = "";

        for (int i = 0; i < 3; i++) {
            System.out.printf("이름:");
            String name = br.readLine();
            System.out.printf("국어:");
            String kor = br.readLine();
            System.out.printf("영어:");
            String eng = br.readLine();
            System.out.printf("수학:");
            String math = br.readLine();

            int total=Integer.parseInt(kor)+
                    Integer.parseInt(eng)+
                    Integer.parseInt(math);

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
                        name,Integer.parseInt(kor),
                        Integer.parseInt(eng),
                        Integer.parseInt(math),
                        total,avg,grade);

        }
        //반복문 종료후 아래와 같이 3줄로 출력되도록

        System.out.println(text);



    }//end main
}//end class
