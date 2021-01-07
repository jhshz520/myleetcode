package datastructure;

import java.util.LinkedHashSet;
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

        Set<Integer> listset = new LinkedHashSet<>();
        listset.add(3);
        listset.add(4);
        listset.add(6);
        listset.add(90);
        listset.add(18);
        System.out.println(listset);
    }

}
