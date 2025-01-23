package test.com;

public class PrintSpool {

    //1.전역변수 (스태틱,접근최소)
    private static PrintSpool sigleton = new PrintSpool();

    //2.생성자도 은닉
    private PrintSpool() {
    }

    //3.getter정의 - 싱글톤 객체(PrintSpool)를 리턴해주는 메소드(static)
    public static PrintSpool getInstance() {
        return sigleton;
    }

    //4.기능구현
    public void print(String str){
        System.out.println("PrintSpool print()....");
        System.out.println(str);
    }
}
