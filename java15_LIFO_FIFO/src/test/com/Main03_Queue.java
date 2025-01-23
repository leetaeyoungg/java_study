package test.com;

import java.util.LinkedList;
import java.util.Queue;

public class Main03_Queue {
    public static void main(String[] args) {

        //2. Queue - FIFO

        Queue<Integer> q = new LinkedList<>();
        q.offer(5001);
        q.offer(5002);
        q.offer(5003);
        q.offer(5004);
        System.out.println(q);
        System.out.println(q.isEmpty());//비어있니?
        System.out.println(q.peek());//FirstOut대상이 뭐니?
        System.out.println(q.contains(5003));//검색 : boolean
        System.out.println(q.poll());//FO추출
        System.out.println(q.poll());//FO추출
        System.out.println(q);

        for (Integer x : q){
            System.out.println(x);
        }

        //모든데이터들을 큐가 비어질때까지 poll 처리 = clear
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
        System.out.println(q);

        //미션
        //문자열을 q에 넣어서 위와 같이 출력해보세요
        Queue<String> qs = new LinkedList<>();
        qs.offer("lee");
        qs.offer("lee2");
        qs.offer("lee3");
        qs.offer("lee4");
        System.out.println(qs);
        System.out.println(q.isEmpty());
        System.out.println(qs.peek());
        System.out.println(qs.contains("lee3"));
        System.out.println(qs.poll());
        System.out.println(qs.poll());
        System.out.println(qs);

        for(String x : qs){
            System.out.println(x);
        }

        while(!qs.isEmpty()){
            System.out.println(qs.poll());
        }
        System.out.println(qs);


    }//end main

}//end class
