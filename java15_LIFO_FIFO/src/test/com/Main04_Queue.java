package test.com;

import java.util.LinkedList;
import java.util.Queue;

public class Main04_Queue {
    public static void main(String[] args) {

        //2. Queue - FIFO
        Queue<Message> q = new LinkedList<>();
        q.offer(new Message("Send Email","taeyoung"));
        q.offer(new Message("Send SMS","hong"));
        q.offer(new Message("Send KAKAOTALK","bin"));
        q.offer(new Message("Send Money","me"));
        System.out.println(q);
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q.contains(new Message("Send KAKAOTALK","bin")));
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);
        for (Message x :q){
            System.out.println(x);
        }

        System.out.println("===========");
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
        System.out.println(q);

    }//end main

}//end class
