package test.com;

public class Main05_while4 {
    public static void main(String[] args) {
        System.out.println("hello");

        //while(boolean type){}

        String x = "y";
        while (!x.equals("x")){
            System.out.println("x:"+x);
            x = "x";
            System.out.println("x:"+x);
        }
        System.out.println("end main...");

    }// end main
}//end class
