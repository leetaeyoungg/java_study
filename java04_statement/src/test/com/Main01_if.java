package test.com;

public class Main01_if {
    public static void main(String[] args) {
        System.out.println("hello");

        System.out.println(args);
        System.out.println(args==null);

        if(args != null){
            System.out.println("args is not null...");

        }

        //int 와 Integer
        int x = 10;
        //x값을 String으로 변환하기.
        String y = x +"";
        System.out.println(y);
        y = String.valueOf(x); // 자주 씀, x=10을 String 으로 변환하여 y에 저장
        System.out.println(y);
        // y= x.toString(); Error  객체가 아니고 변수이기 때문에

        Integer a = 10; // 참조타입
        y = a+"";
        System.out.println(y);
        y = String.valueOf(a);
        System.out.println(y);
        y = a.toString(); // 참조타입에서만 가능한 .toString , 자주 씀
        System.out.println(y);

        Integer b = 20;
        if(b==20){
            System.out.println("b = 20");
        }

        double avg = 99;
        String grade = "A";
        if(avg<=100 && avg>=90){
            grade = "A";
        }else if(avg >= 80){
            grade = "B";
        }else if(avg >= 70){
            grade = "C";
        }else {
            grade = "D";
        }
        System.out.println(grade);

    }//end main
}// end class
