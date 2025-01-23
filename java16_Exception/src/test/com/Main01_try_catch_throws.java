package test.com;

public class Main01_try_catch_throws {
    public static void main(String[] args) /*throws IOException*/ {
        System.out.println("hello");

        //예외처리(Exception) - 프로그램 컴파일 또는 실험단계에서 발생할 수 있는 오류에 대해 대처하는 문법
        //예외처리하는 방법
        // 1. try - catch 블럭문 사용(사용자컨트롤)
        // 2. 메소드에 throws 예약어 처리 사용(콜한 곳으로 전가)


        // 가. 배열의 범위를 벗어나는 접근시 오류

        try {
            System.out.println("try....1");
            test01();
            System.out.println("try....2");
        } catch (Exception e) {
            System.out.println("catch..3...ArrayIndexOutOfBoundsException...");
            System.out.println(e);
        }
        System.out.println("===========================");


        //나. 0으로 나누면 발생하는 오류
        test02();
        System.out.println("===========================");

        //다. null값에 대한 접근 >>> . 연산자 사용시 실행오류
        test03();
        System.out.println("===========================");

        //라. 숫자모양이 문자를 정수로 변환할때 숫자가 아닌문자에 대한 실행오류
        test04();

        System.out.println("===========================");
        System.out.println("end main...");

    }//end main

    private static void test04() {
        String str = "a123";
        try {
            System.out.println("try...1");
            System.out.println(Integer.parseInt(str));
            System.out.println("try...2");
        }catch (Exception e){
            System.out.println("catch...3...NumberFormatException");
            System.out.println(e);
        }
    }


    private static void test03() {
        String str = null;
        try {
            System.out.println("try...1");
            System.out.println(str.length());
            System.out.println("try...2");
        }catch (NullPointerException e){
            System.out.println("catch...3...NullPointerException");
            System.out.println(e);
        }
    }

    private static void test02() {
        int su = 10;
        su = 0;
        try{
            System.out.println("try....1");
            System.out.println(10/su);
            System.out.println("try....2");
        } catch (Exception e) {
            System.out.println("catch...3...ArithmeticException....");
            System.out.println(e);
        }


    }

    private static void test01() throws ArrayIndexOutOfBoundsException {
        int[] sus = new int[5];

//        try {
//            System.out.println("try....1");
//            System.out.println(sus[5]);
//            System.out.println("try....2");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException...");
//            System.out.println(e);
//
//        }
            System.out.println(sus[5]);

        }


    }//end class