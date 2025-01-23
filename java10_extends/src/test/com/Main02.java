package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello...");

        //Person - name,age : sleep():void
        Person ps = new Person();
        System.out.println(ps.age);
        System.out.println(ps.name);
        ps.sleep();
        System.out.println("==============");
        //Man - money, eye : eat():void
        Man m = new Man();
        System.out.println(m.eye);
        System.out.println(m.money);
        m.eat();
        System.out.println("==============");

        //1.Person <---- Man : extends
        System.out.println(m.age);
        System.out.println(m.name);
        m.sleep();
        System.out.println("==============");

        //2.Person 으로 익명내부클래스 생성하기

        Person p2 = new Man();
        System.out.println(p2.name);
        System.out.println(p2.age);
        p2.sleep();
        System.out.println("==============");


        Person person = new Person(){
            @Override
            public void sleep() {
                System.out.println("inner sleep()");
            }
        };
        System.out.println(person.name);
        System.out.println(person.age);
        person.sleep();
        System.out.println("==============");


        //Person <----- Student
        Person p4 = new Student(){};
        System.out.println(p4.name);
        System.out.println(p4.age);
        p4.sleep();
        System.out.println("==============");


        //Person <----- Man <----- My
        My my = new My();
        my.test();


    }//end main



}//end class
