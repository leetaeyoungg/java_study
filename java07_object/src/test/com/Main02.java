package test.com;

import java.util.Arrays;
import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        Phone ph = new Phone();
        System.out.println(ph);

        ph = new Phone("SSS",12.0,130);
        System.out.println(ph);

        ph = new Phone("LG",20.0);
        System.out.println(ph);
        System.out.println("==============");

        PC pc = new PC();
        System.out.println(pc);

        pc = new PC("ARM",90,"red");
        System.out.println(pc);
        System.out.println("==============");

        String[] arr_pc = new String[]{"ARM","90","red"};
        System.out.println(Arrays.toString(arr_pc));


        System.out.println("==============");
        String str = new String();
        System.out.println(str);
        str = new String("KIM");
        System.out.println(str);

        System.out.println("==============");
        Random r = new Random(); // 시드값이 있으면 일정한 랜덤값생성 , 없으면 매번 랜덤

        System.out.println(r.nextInt(3));//0~2
        System.out.println(r.nextInt());//-21억~+21억
        System.out.println(r.nextDouble());//0.0~0.9999999 : 난수
        System.out.println(r.nextBoolean());//true, false

        //public class : 다른패키지에서도 접근
        //class : 같은 패키지에서만 접근
        //private class : 같은 클래스에서만 접근

    }//end main
}//end class
