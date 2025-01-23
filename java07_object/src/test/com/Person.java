package test.com;

public class Person {


    String name = "kim";//기본 =null
    int age = 33;//기본 = 0

    Person(){}//매개변수가 없을경우 생략가능
    //생성자의 역할은 속성초기화.

    //toString()메소드 재정의 - 객체의 속성정보를 쉽게 확인가능하도록 사용가능

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
