package aaa.bbb;
//클래스에 final 명시하면 상속받지 못하도록 한다.
public /*final*/ class Person {


    //protected : 패키지가 다르더라도 상속관계의 클래스에서는 접근가능
    protected String pname = "kim";
    protected int age = 33;


    //메소드에 final명시시 오버라이딩 제한 : 재정의 제한
    //call은 가능
    public final void sleep(){
        System.out.println("Person sleep()");
    }

    public void eat(){
        System.out.println("Person eat()");
    }

}
