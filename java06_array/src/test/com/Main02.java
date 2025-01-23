package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");


        //kim,lee,han

        String[] names = {"kim","lee","han"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

        for (String x : names){
            System.out.println(x);
        }


        System.out.println("====================");

        double[] numbers = {1.1,2.2,3.3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (double x : numbers){
            System.out.println(x);
        }

        System.out.println("====================");

        //'a','b','c'
        char[] ap = {'a','b','c'};
        for (int i = 0; i < ap.length; i++) {
            System.out.println(ap[i]);
        }

        for (char x : ap){
            System.out.println(x);
        }

        System.out.println("====================");

        //true, false, true
        boolean[] bool = {true,false,true};
        for (int i = 0; i < bool.length; i++) {
            System.out.println(bool[i]);
        }

        for (boolean x : bool){
            System.out.println(x);
        }


    }//end main



}//end class
