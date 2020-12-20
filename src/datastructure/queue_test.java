package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class queue_test {
    public static void main(String[] args){
        Queue<Integer> myqueue = new LinkedList<>() ;
        //myqueue.add(5);
       // int a = myqueue.poll();
        myqueue.offer(6);
        myqueue.offer(26);
        while(!myqueue.isEmpty()){
            System.out.println("poll"+myqueue.poll());
        }
       // int po1 = myqueue.poll();
       // System.out.println(po1);
        //System.out.println(a);

    }
}
