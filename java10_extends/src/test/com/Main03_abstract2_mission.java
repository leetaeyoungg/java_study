package test.com;

public class Main03_abstract2_mission {
    public static void main(String[] args) {
        System.out.println("hello...");

        //추상클래스(TestAbs) <--- TestAbsEx
        //test():void 오버라이딩이 강제되도록 구현하세요
        //1.상속받는클래스 활용
        //2.익명내부클래스 활용
        TestAbs absex = new TestAbsEx(){};
        absex.test();
        TestAbs abs = new TestAbs(){
            @Override
            public void test() {
                System.out.println("inner test()");
            }
        };
        abs.test();






    }//end main

}//end class
