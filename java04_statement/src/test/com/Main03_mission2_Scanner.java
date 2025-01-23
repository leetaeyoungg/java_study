package test.com;


import java.util.Scanner;

public class Main03_mission2_Scanner {
    public static void main(String[] args) {
        System.out.println("hello");

        //java.util - 입력 : Scanner
        Scanner s = new Scanner(System.in);

        System.out.println("이름:");
        String name = s.nextLine();
        System.out.println("국어:");
        int kor = s.nextInt();
        System.out.println("영어:");
        int eng = s.nextInt();
        System.out.println("수학:");
        int math = s.nextInt();

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

        System.out.println("이름:"+name);
        System.out.println("국어:"+kor);
        System.out.println("영어:"+eng);
        System.out.println("수학:"+math);
        System.out.println("총점:"+total);
        System.out.println("평균:"+avg);
        System.out.println("등급:"+grade);



    }//end main
}//end class
