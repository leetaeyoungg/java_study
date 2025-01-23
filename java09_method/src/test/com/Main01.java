package test.com;

import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //자바프로그램을 작성하다보면
        //정보위주의 객체,기능위주의 객체


        //method(함수)를 정의하는 방법
        Test t = new Test();

        //1. argument X , return X
        t.start();
        System.out.println("=====================");


        //2. argument O , return X
        t.start(99);
        t.stop(new int []{11,22,33});
        t.sleep(new Person("lee",31));
        t.sleep(new Person[3]);
        t.sleep(new Person[]{new Person(),new Person("lee",32)});
        t.sum(99,88,77);
        t.args(99,88,77,66,55);

        //setter method : 단일 속성 초기화
        System.out.println(t);
        t.setNum(111);
        System.out.println(t);
        System.out.println("=====================");


        //3. argument X , return O
        int result = t.eat();//result=99
        System.out.println(result);

        String result2 = t.eat2();//result2=lee
        System.out.println(result2);

        int[] result3 = t.eat3();
        System.out.println(Arrays.toString(result3));

        Person result4 = t.eat4();
        System.out.println(result4);

        Person[] result5 = t.eat5();
        System.out.println(Arrays.deepToString(result5));

        //getter method : 단일 속성 리턴
        //은닉된 속성의 값을 함수로 반환받을 수 있다.
        int num = t.getNum();
        System.out.println(num);

        System.out.println("=====================");

        //4. argument O , return O
        int result6 = t.study(77);
        System.out.println(result6);

        //정수 여러개를 줄테니 합계내서 반환해줘
        int result7 = t.sum3(1,2,3,4,5,6,7,8);
        System.out.println(result7);

        //문자열을 줄테니 구분자(:)로 잘라서 배열로 반환해줘
        String[] strs = t.split("java:html:css:javascript");
        System.out.println(Arrays.toString(strs));

    }//end main


}//end class
