package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");
        //클래스 구성요소
        //1. 속성 - 전역변수 , 멤버필드(member field),property,attribute..
        //2. 기능 - 객체생성기능(생성자), 동작기능(함수)
        Object obj = new Object();
        //객체생성 - new + 생성자

        Person p = new Person();
        System.out.println(p);
        System.out.println(p.age);
        System.out.println(p.name);
        p.name="lee";
        p.age=30;
        System.out.println(p);
        System.out.println("-----------------");

        Student st = new Student();
        System.out.println(st);
        System.out.println(st.name);
        System.out.println(st.kor);
        System.out.println(st.eng);
        System.out.println(st.math);
        st.name="han";
        st.kor=99;
        st.eng=88;
        st.math=77;
        System.out.println(st);


        System.out.println("-----------------");

        Car c = new Car();
        System.out.println(c);
        System.out.println(c.model);
        System.out.println(c.price);
        c.model="BMW";
        c.price=3000;
        System.out.println(c);

        System.out.println("-----------------");




        NoteBook nb = new NoteBook();
        System.out.println(nb);
        System.out.println(nb.price);
        System.out.println(nb.color);
        System.out.println(nb.size);
        nb.price=100;
        nb.color="white";
        nb.size=12.4;
        System.out.println(nb);

        System.out.println("-----------------");


    }//end main
}//end class
