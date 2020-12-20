package datastructure;

import java.util.LinkedList;
import java.util.List;

public class linklist_test {

    public static void main(String[] args){
        List<Integer> mylinkedlist=  new LinkedList<Integer>();
        mylinkedlist.add(9);
        mylinkedlist.indexOf(9);
        System.out.println(mylinkedlist);
        mylinkedlist.remove(0);
        System.out.println(mylinkedlist);
        //mylinkedlist.remove(10);
    }
}
