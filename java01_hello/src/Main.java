//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello!"); // String_type = 0글자이상
        System.out.println('a'); //char_type = 반드시 1글자
        System.out.println(111); // 정수_type = byte , short , char , int , long
        System.out.println(3.14); //실수_type = float,double
        System.out.println(true); // boolean type = true , false
        System.out.println("hello" + "kim");

        System.out.print("hello");
        System.out.print("hello");
        System.out.print("hello\n");

        System.out.printf("hello\n");

        int a = 11; //4byte
        double b = 11.11; // 8byte
        String str = "LEE";

        System.out.println("a:10,b:11.11,str:LEE");
        System.out.println("a:"+a+",b:"+b+",str:"+str);
        System.out.printf("a:%d,b:%.2f,str:%s\n",a,b,str); // .2f(소숫점 둘째자리까지만 표시)
        // %d 정수 , %f 실수 , %s 문자열

        boolean bool = true; // %b 소문자 , %B 대문자
        System.out.printf("boolean:%b\n",bool);
        System.out.printf("boolean:%B\n",bool);

        System.out.printf("name:%s,age:%d\n","kim",33);
        System.out.printf("name:%5s,age:%d\n","kim",33); // 5칸공간에 맨뒤에 작성
        System.out.printf("name:%-5s,age:%d\n","kim",33); // 5칸공간에 맨앞에 작성

        System.out.printf("10진수:%d,%d,%d,%d,%d\n",10,11,12,13,14); // %d 10진수
        System.out.printf("16진수:%x,%x,%x,%x,%x\n",10,11,12,13,14); // %x 16진수
        System.out.printf("8진수:%o,%o,%o,%o,%o\n",10,11,12,13,14); // %o 8진수

        //java에서 printf로 이진수처리불가
        //이진수변환 함수를 사용해야함 Integer.toBinaryString
        // Binary : 2진수 , Hex 16진수 , Octal 8진수

        System.out.println(Integer.toBinaryString(10)); //  2진수 : 1010
        System.out.println(Integer.toHexString(10)); // 16진수 : a
        System.out.println(Integer.toOctalString(10)); // 8진수 : 12

    }//end main
}//end class