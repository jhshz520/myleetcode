package datastructure;

import java.util.Set;
import java.util.TreeSet;

public class set_test {
    //private RBTree<E> tree;
    public static void main(String[] args){
        Set<Integer> myset = new TreeSet<>();
        myset.add(1);
        myset.add(2);
        myset.add(3);
        myset.add(4);
        myset.add(5);

        System.out.println(myset);
    }

}
