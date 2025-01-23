package test.com;

public class StaticOuter {

    static String name = "kim";

    public static class StaticInner{
        static int age = 33;
        public StaticInner(){
            System.out.println("StaticInner()");
            System.out.println(name);

        }
        public static void test(){
            System.out.println("static test()");
        }
        public void test2(){
            System.out.println("static test()2");
        }


    }//end inner

}//end outer
