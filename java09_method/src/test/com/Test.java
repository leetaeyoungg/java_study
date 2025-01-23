package test.com;

import java.util.Arrays;

public class Test {

    private int num;


    //1.인자(argument)X 리턴(return)X
    public void start(){
        System.out.println("start()..");
        //return; 생략가능
    }

    //2.인자(argument)O 리턴(return)X
    public void start(int x){ //method overloading
        System.out.println("start(int x).."+x);
        //return; 생략가능
    }

    public void stop(int[] arr){
        System.out.println("stop(int[] arr)"+arr.length);
        System.out.println(Arrays.toString(arr));
        //return; 생략가능
    }
    public void sleep(Person p){
        System.out.println("sleep (Person p)...");
        System.out.println(p);

    }
    public void sleep(Person[] ps){
        System.out.println("sleep (Person[] ps)...");
        System.out.println(ps.length);
        System.out.println(Arrays.deepToString(ps));

    }

    public void sum(int x, int y, int z) {
        System.out.println("sum(int x, int y, int z)...");
        System.out.println(x+","+y+","+z);
        System.out.println(x+y+z);
    }
    // ... 연산자를 사용하여 매개변수의 계수를 동적으로 배열해 할당받을수 있다.
    // 동일타입의 열거만 가능하다
    public void args(int ...args) {
        System.out.println("args(int ...args)..."+args.length);
        System.out.println(Arrays.toString(args));
    }

    //setter method : 단일 속성 초기화
    public void setNum(int num){
        this.num = num;
    }
    //3.인자(argument)X 리턴(return)O
    public int eat(){
        System.out.println("eat()...");
        return 99; //return 생략불가
    }

    public String eat2(){
        System.out.println("eat2()...");
        return "lee";
    }

    public int[] eat3(){
        System.out.println("eat3()...");
        //return new int[3]; = 0,0,0
        return new int[]{11,22,33};
    }

    public Person eat4(){
        System.out.println("eat4()...");
        //return new int[3]; = 0,0,0
        //return new Person(); = null,0
        return new Person("lee",31);
    }

    public Person[] eat5(){
        System.out.println("eat5()...");
        //return new Person[]{}; // []
        //return new Person[]{new Person(),new Person("lee",31)}; //null,null,null
        Person[] ps = new Person[3];
        for (int i = 0; i < ps.length; i++) {
            ps[i]=new Person("Kim"+(i+1),(i+1));
        }
        return ps;
    }

    //getter method : 단일 속성 리턴
    public int getNum(){
        return this.num;
    }


    //4.인자(argument)O 리턴(return)O

    public int study(int x){
        System.out.println("study(int x)...");
        System.out.println(x);
        return 88;
    }


    @Override
    public String toString() {
        return "Test{" +
                "num=" + num +
                '}';
    }

    public int sum3(int ...args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

    public String[] split(String str) {
        return str.split(":");
    }
}
