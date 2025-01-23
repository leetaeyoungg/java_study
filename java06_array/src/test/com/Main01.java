package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");
        //하나의 변수에 여러데이터를 담고싶다.
        //순서대로 넣고싶다 = 배열
        //key값을 지정하고싶다 = 객체

        int[] arr = new int[]{11,22,33};
        arr = new int[]{11,22,33,44,55};
        int[] arr2 = new int[5]; // {0,0,0,0,0}


        System.out.println("============");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("============");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        int[] arr3 = {11,22,33};
        arr3 = new int[]{11,22,33};
        // arr3 = {11,22,33}; = error *주의

        test(new int[]{11,22,33});

        int[][] suss = new int[][]{{},{}};
       // int[][] suss = new int[][]{new int[]{},new int[]{}};  생략가능
        suss[0] = new int []{11,22,33};

        //forEach
        for(int x : arr3){
            System.out.println(x);
        };




    }//end main
    private static void test(int [] arr){

    }


}//end class
