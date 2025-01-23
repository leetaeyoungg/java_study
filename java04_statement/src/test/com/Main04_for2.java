package test.com;

public class Main04_for2 {
    public static void main(String[] args) {
        System.out.println("hello");

        //2중 for를 이용하여 구구단을 출력하세요.

        for (int x = 2; x <= 9; x++) {

            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d*%d=%2d ",x,i,x*i);
            }
            System.out.println();
        }
        System.out.println("=====================");
        for (int x = 2; x <= 9; x++) {
            if(x==5)continue;
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d*%d=%2d ",x,i,x*i);
                //if(i==5)break;
            }
            System.out.println();
        }
        System.out.println("=====================");
        //반복문에 라벨을 달아서 블럭제어를 할 수 있다.
        first:for (int i = 0; i < 2 ; i++) {
            second:for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(k);
                    //if(k==5)break first;
                    if(k==5)break second;
                }
                System.out.println();
            }
            System.out.println("=================");
        }

    }//end main
}//end class
