package test.com;

import aaa.bbb.Person;

public class Man extends Person {

    public Man() {
        work();
    }

    public  void work(){
        System.out.println("work()");
        System.out.println(pname);
        System.out.println(age);
        sleep();
        sleep(100);
    }

    //동일명의 method를 사용하고자 한다면 오버로딩하면 된다.
    public int sleep(int x){
        System.out.println("Man sleep().."+x);
        return 0;
    }

    @Override
    public void eat() {
        System.out.println("Man eat()");
    }
}
