package test.com;

import java.util.Stack;

public class Main02_Stack {
    public static void main(String[] args) {
        System.out.println("hello");

        //Coin : 속성 : -value:int


        Stack<Coin> st = new Stack<>();
        st.push(new Coin());
        st.push(new Coin());
        st.push(new Coin(100));
        st.push(new Coin(1000));
        st.push(new Coin(10000));
        st.push(new Coin(100000));
        System.out.println(st);
        for (Coin x : st) {
            System.out.println(x);
        }
        System.out.println("=================");
        System.out.println(st.pop());//가장 마지막에 있는 데이터 추출
        System.out.println(st);
        System.out.println(st.pop());//가장 마지막에 있는 데이터 추출
        System.out.println(st);
        System.out.println(st.peek());//가장 마지막에 있는 데이터 검색
        System.out.println(st);
        //객체에대한 contains를 사용자 >> 데이터클래스 적용해줘야한다.
        System.out.println(st.contains(new Coin(1000))); //해당데이터 존재유무 : boolean
        System.out.println("st.size() : " + st.size());
        System.out.println(st.empty()); //해당스택이 비었니?
        st.clear();//모두 비우기
        System.out.println(st);
        System.out.println(st.empty());
        System.out.println("===================");


    }//end main

}//end class
