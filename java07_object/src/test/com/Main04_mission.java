package test.com;

import java.util.Scanner;

public class Main04_mission {
    public static void main(String[] args) {
        System.out.println("hello");

        //Score class 를 이용해서 성적처리하는 프로그램을 작성하세요.
        //3명의 성적을 처리하고 출력하는 프로그램
        Score[] scores = new Score[3];
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int kor = s.nextInt();
        int eng = s.nextInt();
        int math = s.nextInt();

        int total = kor+eng+math;
        double avg = total/3.0;
        String grade = "A";

        if (avg<=100&&avg>=90) {
            grade = "A";
        } else if(avg>=80){
            grade = "B";
        }else if(avg>=70){
            grade = "C";
        }else{
            grade = "D";} //end if

        for (int i = 0; i < scores.length; i++) {

            Score score = new Score(name,kor,eng,math,total,avg,grade);
            scores[i] = score;
        }

    for(Score x : scores) {
        System.out.println(x);
    }

    }//end main
}//end class
