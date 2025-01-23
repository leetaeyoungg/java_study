//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        //type
        //1.private type (기본, 8개) : 정수형, 실수형, 참거짓
        // wrapper class : 기본타입을 객체로 사용할수 있도록 만든 클래스
        //byte,short,char,int,long,float,double,boolean

        //byte : 1byte 정수
        System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
        byte bt =127;
        System.out.println(bt);
        bt++;
        System.out.println(bt); // -128
        byte bt2 = 10;
        byte bt3 = 20;
        //int sum = bt2 + bt3; // int보다 작은 type끼리의 연산이 발생하면 int형
        byte sum = (byte)(bt2+bt3);  // byte로 캐스팅


        //short : 2byte 정수
        System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
        short st = 32767;
        System.out.println(st);
        st++;
        System.out.println(st); // -32768

        //char : 2byte 1글자 문자 , 정수는 +만
        System.out.println(Character.MIN_VALUE+"~"+Character.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
        char a = 65; // 문자표기이기에 65번째 문자 'A'
        System.out.println(a);
        a = 97; // 97번째 문자 = 'a'
        System.out.println(a);

        int x = 97;
        System.out.println(x);
        System.out.println((char)x); // a : 캐스팅-형변환

        //int : 4byte 정수 (Java 기본형)
        System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
        int i = 2147483647;
        System.out.println(i);
        i++;
        System.out.println(i); //-2147483648

        //long : 8byte 정수 , L 로 표기
        System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
        long l = 21474836470L; // 큰수를 넣을때는 맨뒤에 L

        //float : 4byte 실수, f 로 표기
        System.out.println(Float.MIN_VALUE+"~"+Float.MAX_VALUE); //1.4E-45~3.4028235E38
        // 실수는 0에서 1 사이의 소숫점을 얼마나 잘 표기할 수 있느냐로 구분 float = .45자리
        float f = 3.14f;
        System.out.println(f);

        //double : 8byte 실수,
        System.out.println(Double.MIN_VALUE+"~"+Double.MAX_VALUE); // double = .324자리
        double d = 3.14;
        System.out.println(d);

        //boolean : 1byte
        System.out.println(Boolean.TRUE+","+Boolean.FALSE);
        boolean bool = false;
        System.out.println(bool);
        System.out.println(!bool); // ! = 부정연산자

        //참 , 거짓 두가지 값 뿐 *기본은 false


        //2.참조 type (무한대) : String(문자열),Array(배열),Object(객체)
        // 메모리주소가 할당되어 무한으로 만들 수 있음.


        String name = "lee";
        String name2 = new String("lee");

        //javascript배열 : let arr = ["kim","lee"];
        String[] names = new String[]{"kim","lee"}; //Array
        int[] sus = new int[]{11,22,33}; //Array

        // 각 type별 defalut값
        // 정수 : 0
        // 실수 : 0.0
        // boolean : false
        // 참조 : null
        System.out.println("99"+"100");
        System.out.println(Integer.parseInt("99")+Integer.parseInt("100"));
        System.out.println("99"+"100.123");
        System.out.println(Double.parseDouble("99")+Double.parseDouble("100.123"));


        System.out.println((int)'0');//48
        System.out.println((int)'A');//65
        System.out.println((int)'a');//97

        for (int z = 48; z < 200 ; z++) {
            System.out.println((char)z+":"+z);

        }


    }//end main
}//end class