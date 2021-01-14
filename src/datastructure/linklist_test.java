package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linklist_test {

    public static void main(String[] args){
        List<Integer> mylinkedlist=  new LinkedList<Integer>();
        List<Integer> arrlist=  new ArrayList<>();
        arrlist.add(5);
        arrlist.size();
        mylinkedlist.add(9);
        mylinkedlist.indexOf(9);
        System.out.println(mylinkedlist);
        mylinkedlist.remove(0);
        System.out.println(mylinkedlist);
        System.out.println(arrlist);
        //mylinkedlist.remove(10);
    }
}
