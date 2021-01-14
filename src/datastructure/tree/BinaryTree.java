package tree;

public class BinaryTree<E> {
    protected int size;
    protected  Node <E> root;

    public static abstract class Visitor<E>{
        boolean stop;
        public abstract  boolean visit(E element);
    }

    /**
     * 内部类，节点类
     * @param <E>
     */
    public static class Node<E>{

    }
}
