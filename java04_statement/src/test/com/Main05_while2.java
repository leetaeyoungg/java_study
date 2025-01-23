package test.com;

public class Main05_while2 {
    public static void main(String[] args) {
        System.out.println("hello");

        //while(boolean type){}

        int i = 0;
        while(true){
            System.out.println(i);
            i++;
            if(i==5)break; // break 문이 없으면 무한반복
        }
        System.out.println("end main...");



    }// end main
}//end class
