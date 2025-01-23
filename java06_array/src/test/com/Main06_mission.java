package test.com;

import java.util.Scanner;

public class Main06_mission {
    public static void main(String[] args) {
        System.out.println("hello");

        //앞서 구현했던 소스들중 성적처리프로그램을 활용할것.
        //3명의 학생들 성적처리시 각 학생의 정보는 배열에 할당해서 처리할것.

        Scanner s = new Scanner(System.in);
        
        String[][] scores = new String[3][];

            for (int i = 0; i < scores.length; i++) {


                System.out.print("이름:");
                String name = s.nextLine();
                System.out.print("국어:");
                String kor = (s.nextLine());
                System.out.print("영어:");
                String eng = (s.nextLine());
                System.out.print("수학:");
                String math = (s.nextLine());


                String total = "" + (Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math));
                String avg = "" + (Integer.parseInt(total) / 3.0);

                double d_avg = Double.parseDouble(avg);

                String grade = "A";
                if (d_avg <= 100 && d_avg >= 90) {
                    grade = "A";
                } else if (d_avg >= 80) {
                    grade = "B";
                } else if (d_avg >= 70) {
                    grade = "C";
                } else {
                    grade = "D";
                }

                String[] score = new String[]{name, kor, eng, math, total, avg, grade};

                scores[i] = score;
            }

            for (String[] score : scores) {
                for (String a : score) {
                System.out.println(a);
                }

        }
    }//end main
}//end class
