package test.com;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main05_Deque {
    public static void main(String[] args) {

        //Deque(덱,데크) - Stack + Queue
        //혼합형 : 스택의 장점, 큐의 장점을 둘다 사용가능
        //데이터의 추출을 앞뒤로 할 수 있다.
        //기본은 FIFO

        Deque<String> dq = new ArrayDeque<>();
        dq.offer("hello1");
        dq.offer("hello2");
        dq.offer("hello3");
        dq.offer("hello4");
        System.out.println(dq);
        System.out.println(dq.size());
        System.out.println(dq.peek());//기본은 FIFO
        System.out.println(dq.contains("hello2"));
        System.out.println(dq.isEmpty());

        dq.offerFirst("데크111");//맨앞에 넣어라.
        dq.offerFirst("데크222");//맨앞에 넣어라.
        System.out.println(dq);
        dq.offerLast("데크333");
        dq.offerLast("데크444");
        System.out.println(dq);

        System.out.println(dq.poll());
        System.out.println(dq.poll());
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);


        Deque<Integer> i = new ArrayDeque<>();
        i.offer(1);
        i.offer(2);
        i.offer(3);
        i.offer(4);
        System.out.println(i);
        System.out.println(i.size());
        System.out.println(i.peek());//기본은 FIFO
        System.out.println(i.contains(3));
        System.out.println(i.isEmpty());

        i.offerFirst(5);//맨앞에 넣어라.
        i.offerFirst(6);//맨앞에 넣어라.
        System.out.println(i);
        i.offerLast(7);
        i.offerLast(8);
        System.out.println(i);

        System.out.println(i.poll());
        System.out.println(i.poll());
        System.out.println(i);
        System.out.println(i.pollFirst());
        System.out.println(i);
        System.out.println(i.pollLast());
        System.out.println(i);


        System.out.println("==============");
        Deque<int[]> is = new ArrayDeque<>();
        is.offer(new int[]{11,22,33});
        is.offerFirst(new int[]{1111,2222,3333});
        for (int[] x : is) {
            System.out.print(Arrays.toString(x)+" ");
        }
        System.out.println();
        System.out.println(is.size());

        System.out.println("==============");

        //데크에서 모든 요소를 뒤로부터 추출하면서 각 배열의 합을 출력하세요.
        while(!is.isEmpty()){
            int[] arr = is.pollLast();
            System.out.println(Arrays.toString(arr));
            int sum = 0;
            for (int x : arr){
                sum += x;
            }
            System.out.println("sum:"+sum);
        }
        System.out.println(is);

    }//end main


}//end class
