package datastructure;

import java.util.Stack;

public class stack_test {
    public static void main(String[] args){
        Stack<Integer> mystack = new Stack<>();
        mystack.push(1);
        int pe = mystack.peek();
        System.out.println(pe);

        mystack.push(5);
        int pe1 = mystack.peek();
        System.out.println(pe1);

       // mystack.push(5);
        int po = mystack.pop();
        System.out.println(po);

        int pe2 = mystack.peek();
        System.out.println(pe2);

        //mystack.clear();
        System.out.println(mystack.peek());
    }

}
