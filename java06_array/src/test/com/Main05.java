package test.com;

public class Main05 {
    public static void main(String[] args) {
        System.out.println("hello");


        //문자열 이차원배열을 만들고 출력하세요(데이터는 임의의값)

        String[][] strss = {{"A","B","C"},{"a","b","c","d"}};


        for (int x = 0; x < strss.length; x++) {
            for (int i = 0; i < strss[x].length; i++) {
                System.out.print(strss[x][i] + " ");
            }
            System.out.println();
        }//end for

        String[][] strss2 = new String[2][3];
//        strss2[0] = new String[]{"A1","B1","C1"};
//        strss2[1] = new String[]{"a2","b2","c2","d2","e2"};



        for (String[] strs : strss2){
            for (String x : strs){
                System.out.print(x + " ");
            }
            System.out.println();
        }


        //double 이차원배열을 만들고 출력해보세요.

        double[][] dbss = {{1.1,2.2,3.3},{4.4,5.5,6.6,7.7}};


        for (int x = 0; x < dbss.length; x++) {
            for (int i = 0; i < dbss[x].length; i++) {
                System.out.print(dbss[x][i] + " ");
            }
            System.out.println();
        }//end for

        for (double[] dbs : dbss){
            for (double db : dbs){
                System.out.print(db+" ");
            }
            System.out.println();
        }

    }//end main
}//end class
