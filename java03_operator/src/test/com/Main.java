package test.com;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");


        //1. 산술연산자 +, -, *, /, %
        System.out.println(10 + 3);
        System.out.println(10 - 3);
        System.out.println(10 * 3);
        System.out.println(10 / 3); // 정수간 나눗셈은 정수(몫)만 반환
        System.out.println(10 / 3.0); // 실수포함 나눗셈은 실수 반환
        System.out.println(10 % 3);
        System.out.println("=============================");
        //2. 증강연산자 ++ , --
        //증강전위연산이 우선순위가 높다.
        int a = 10;
        int b = a++; // 후위연산은 할당연산보다 우선순위가 낮다.
        System.out.println(a);
        System.out.println(b);
        System.out.println("=============================");

        //3. 할당,대입,복합할당  = , += , -=, *= , /= , %= ,  &= , |=, ^=
        // 복합할당은 재할당하여 값이 계속 바뀐다.
        int x= 10;
        System.out.println(x += 10); // 10 + 10 = 20
        System.out.println(x -= 10); // 20 - 10 = 10
        System.out.println(x /= 10); // 10 / 10 = 1
        System.out.println(x %= 10); // 1 % 10 =1

        System.out.println("=============================");
        //4. 비트연산자 & , | , ^
        System.out.println(10&3);
        System.out.println(10|3);
        System.out.println(10^3);

        System.out.println("=============================");
        //5. 비교연산자 > , >= , < , <= , ==  , !=  : true,false
        System.out.println(5 == 5);
        System.out.println(5 != 5);
        System.out.println(5 >= 5); // 이상
        System.out.println(5 <= 5); // 이하
        System.out.println(5 > 5);
        System.out.println(5 < 5);

        //문자비교 == 대신 equals 함수 사용
        System.out.println("kim".equals("KIM")); // 대소문자 구분 return = boolean
        System.out.println("kim".equalsIgnoreCase("KIM")); //대소문자무시
        System.out.println("aaa".compareTo("aab")); // return = int , 0 반환시 같은문자, 해시코드값의 차이
        System.out.println("aaa".compareTo("aab") == 0); // 0과 비교해서 boolean 획득

        System.out.println(!"kim".equals("kim")); // '!' 부정

        System.out.println("=============================");
        //6. 논리연산자 & , && , | , || : true false
        System.out.println(true & true);
        System.out.println(true && true);
        System.out.println(true | true);
        System.out.println(true || true);


        System.out.println("=============================");
        //7. 쉬프트연산자(비트이동연산자) << , >> , >>>(양수로만든다)
        System.out.println(8 >> 1); // 1/2
        System.out.println(8 >> 2); // 1/2 > 1/2 = 1/4
        System.out.println(8 >> 3); // 1/2 > 1/2 > 1/2 = 1/8
        System.out.println(2 << 1); // 2배
        System.out.println(2 << 2); // *2 *2 = 4배
        System.out.println(2 << 3); // *2 *2 *2 = 8배
        System.out.println( -1 >>> 1);
        System.out.println( -1 >>> 2);
        System.out.println( -8 >>> 1);
        System.out.println(Integer.toBinaryString(-8)); // 11111111111111111111111111111000
        System.out.println(Integer.toBinaryString(2147483644)); // 01111111111111111111111111111100
        System.out.println("=============================");

        //8. 조건연산자(삼항연산자) ? , :
        double avg = 70.0;
        System.out.println(avg<=100 && avg >= 90 ? "A": "B");
        System.out.println(avg<=100 && avg >= 90 ? "A": avg >= 80 ? "B" : "C");


        //9. 기타연산자 . , ... , new , ()

    }//end main
}//end class
