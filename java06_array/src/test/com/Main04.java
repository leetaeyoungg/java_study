package test.com;

import java.util.Arrays;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");


        //Multi array = 다차원배열

        int[][] suss = {{11,22,33},{44,55,66,77}};
        int[] sus1 = new int[]{11,22,33};
        int[] sus2 = new int[]{44,55,66,77};
        suss = new int[][]{sus1,sus2};


        for (int x = 0; x < suss.length; x++) {
            for (int i = 0; i < suss[x].length; i++) {
                System.out.print(suss[x][i] + " ");
            }
            System.out.println();
        }
        //System.out.println(suss[0][3]); // 배열의 범위를 벗어나는 참조시 에러발생
        System.out.println("=========================");

        //forEach 로 출력하기
        for (int[] sus  : suss){
            for (int x : sus){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        System.out.println("=========================");

        int[][] suss2 = new int[2][]; // 정적할당 {{null}{null}}
        sus1 =null;
        sus2 =null;
        suss2 = new int[][]{sus1,sus2};
        System.out.println(suss2[0]); // null pointer exception == null 뒤에는 . 이 올 수 없다.
        System.out.println(suss2[1]);




        System.out.println("=========================");
        int[][] suss3 = new int[2][3]; // 정적할당 {{0,0,0}{0,0,0}}
        sus1= new int[3];
        sus2= new int[3];
        suss3 = new int[][]{sus1,sus2};

        for (int x = 0; x < suss3.length; x++) {
            for (int i = 0; i < suss3[x].length; i++) {
                System.out.print(suss3[x][i] + " ");
            }
            System.out.println();
        }



    }//end main
}//end class
