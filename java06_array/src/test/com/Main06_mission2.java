package test.com;

import java.util.Scanner;

public class Main06_mission2 {
    public static void main(String[] args) {
        System.out.println("hello");

        //앞서 구현했던 소스들중 성적처리프로그램을 활용할것.
        //3명의 학생들 성적처리시 각 학생의 정보는 배열에 할당해서 처리할것.

        Scanner s = new Scanner(System.in);
        //회원가입 프로그램을 작성할것
        //3명회원정보는 배열에 할당해서 처리할것.
        //변수 id pw name tel
        //예 new String[]{"admin","hi111","kim","010"}


        String[][] logs = new String[3][];


            for (int i = 0; i < logs.length; i++) {


                System.out.print("ID:");
                String id = s.nextLine();
                System.out.print("PASSWORD:");
                String pw = (s.nextLine());
                System.out.print("이름:");
                String name = (s.nextLine());
                System.out.print("tel:");
                String tel = (s.nextLine());


                String[] log = new String[]{id, pw, name, tel};
                logs[i]=log;

            }
            for (String[] log : logs) {
                for (String a : log) {
                 System.out.print(a+" ");
             }
            System.out.println();
            }

    }//end main
}//end class
