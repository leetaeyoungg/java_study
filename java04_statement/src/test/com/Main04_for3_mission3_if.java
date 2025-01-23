package test.com;

import java.util.Scanner;

public class Main04_for3_mission3_if {
    public static void main(String[] args) {
        System.out.println("hello");


        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {


            System.out.println("메뉴를 입력하세요.");
            System.out.println("1.입력 2.수정 3.삭제 4.검색 5.종료");
            int select = s.nextInt();
            System.out.println("Select menu : " + select);

            if (select==1) {
                System.out.println("1.입력페이지 입니다");

            } else if (select==2) {
                System.out.println("2.수정페이지 입니다");

            } else if (select==3) {
                System.out.println("3.삭제페이지 입니다");

            } else if (select==4) {
                System.out.println("4.검색페이지 입니다");

            } else if (select==5) {
                System.out.println("프로그램을 종료하겠습니다.");
                i=5; // = return
                break;
            } else {
                System.out.println("잘못입력하셨습니다.");
            }


        }

    }//end main
}//end class
