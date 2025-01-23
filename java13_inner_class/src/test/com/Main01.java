package test.com;

public class Main01 {

    public static void main(String[] args) {
        System.out.println("hello");


        //내부클래스
        //목적 : 외부클래스의 자원을 내부클래스에서 객체생성없이 사용하기 위함
        //클래스내부에 클래스를 정의하는 방법
        //1.멤버내부클래스
        MemberOuter outer = new MemberOuter();
        outer.new Inner().test();
        System.out.println(outer.new Inner().age);
        System.out.println("====================");

        //2.스태틱내부클래스
        StaticOuter.StaticInner.test();
        new StaticOuter.StaticInner().test2();

        System.out.println(StaticOuter.StaticInner.age);
        System.out.println("====================");


        //3.익명내부클래스
        Nomal nm = new Nomal(){
            @Override
            public void test() {
                System.out.println("nomal inner test");
            }
        };
        nm.test();

        Abs ab = new Abs() {
            @Override
            public void test() {
                System.out.println("abs inner test");
            }
        };
        ab.test();

        Inter it = new Inter() {
            @Override
            public void test() {
                System.out.println("Inter inner test");            }
        };
        it.test();


        System.out.println("====================");




        //4.로컬내부클래스 - 클래스 선언 이후에만 객체생성가능
        //로컬변수를 바로 참조(*변경불가)할 수 있다.
        String id = "admin";

        class LocalInner{
            String name = "lee";
            public void test(){
                System.out.println("LocalInner test()");
                System.out.println(id); //*Final 변수만 참조가능
                //id="administer"; *변경불가
            }
        };

        LocalInner li = new LocalInner();
        li.test();
        System.out.println(li.name);

        System.out.println("====================");



    }//end main

}//end class
