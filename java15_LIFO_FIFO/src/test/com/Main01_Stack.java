package test.com;

import java.util.Stack;

public class Main01_Stack {
    public static void main(String[] args) {
        System.out.println("hello");

        //LIFO - Last In First Out >> Stack
        //FIFO - First In First Out >> Queue

        //1.Stack<제네릭>
        Stack<Integer> st = new Stack<>();
        st.push(5001);
        st.push(5002);
        st.push(5003);
        st.push(5004);

        System.out.println(st);
        for (Integer x : st){
            System.out.println(x);
        }
        System.out.println("=================");
        System.out.println(st.pop());//가장 마지막에 있는 데이터 추출
        System.out.println(st);
        System.out.println(st.pop());//가장 마지막에 있는 데이터 추출
        System.out.println(st);
        System.out.println(st.peek());//가장 마지막에 있는 데이터 검색
        System.out.println(st);
        System.out.println(st.contains(5001)); //해당데이터 존재유무 : boolean
        System.out.println("st.size()"+st.size());
        System.out.println(st.empty()); //해당스택이 비었니?
        st.clear();//모두 비우기
        System.out.println(st);
        System.out.println(st.empty());
        System.out.println("===================");

        //미션
        //문자열을 스택에 넣어서 위와 같이 메소드들을 출력해보세요.
        Stack<String > str = new Stack<>();
        str.push("lee1");
        str.push("lee2");
        str.push("lee3");
        str.push("lee4");

        System.out.println(str);
        for (String x : str){
            System.out.println(x);
        }
        System.out.println("=================");
        System.out.println(str.pop());//가장 마지막에 있는 데이터 추출
        System.out.println(str);
        System.out.println(str.pop());//가장 마지막에 있는 데이터 추출
        System.out.println(str);
        System.out.println(str.peek());//가장 마지막에 있는 데이터 검색
        System.out.println(str);
        System.out.println(str.contains("lee1")); //해당데이터 존재유무 : boolean
        System.out.println("str.size() : "+str.size());
        System.out.println(str.empty()); //해당스택이 비었니?
        str.clear();//모두 비우기
        System.out.println(str);
        System.out.println(str.empty());
        System.out.println("===================");


    }//end main

}//end class
