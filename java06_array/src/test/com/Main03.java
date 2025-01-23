package test.com;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");


        int[] arr = new int[5];//0,0,0,0,0
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1)*10;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

        //String
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = "kim"+i;

        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");

        }

        //double
        double[] db = new double[5];
        for (int i = 0; i < db.length; i++) {
            db[i] = i+0.1;

        }
        for (int i = 0; i < db.length; i++) {
            System.out.print(db[i]+" ");

        }

        //char
        char[] ch = new char[5];
        for (char i = 0; i < ch.length; i++) {
            ch[i] = (char)(48+i);

        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+" ");

        }

        //boolean
        boolean[] bool = new boolean[5];
        for (int i =  0; i < bool.length; i++) {
            if(i%2==0)bool[i] = true;

        }
        for (int i =  0; i < bool.length; i++) {
            System.out.print(bool[i]+" ");

        }






    }//end main
}//end class
