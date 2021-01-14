//package tree;
//
//import java.util.Comparator;
//
//public class BST <E>{
//
//    private int size;// the number of element
//    private Node<E> root;
//
//    public static abstract  class Visitor<E>{
//        boolean stop;
//        public abstract  boolean visit(E element);
//    }
//    private Comparator<E> comparator;
//
//    public BST(){
//        this(null);
//    }
//    public BST(Comparator<E> comparator){
//        this.comparator = comparator;
//    }
//
//    private int compare(E e1, E e2){
//        if(comparator!=null){
//            return comparator.compare(e1,e2);
//        }
//        return ((Comparable<E>)e1).compareTo(e2);// >0 ==e1>e2   <0==e1<e2
//    }
//
//    /**
//     *
//     * @return brother node
//     */
//    public Node<E> sibling(){
//        if(isLeftChild()){
//            return parent.right;
//        }
//
//        if(isRightChild()){
//            return parent.left;
//        }
//
//        return null;
//    }
//
//    private void elementNotNullCheck(E element){
//        if(element ==null){
//            throw new IllegalArgumentException("element must not be null");
//        }
//    }
//
//
//    public  int size(){
//        return size;
//    }
//    public boolean isEmpty(){
//        return size==0;
//    }
//
//    public void clear(){
//        root = null;
//        size = 0;
//    }
//
//    public void add(E element){
//        elementNotNullCheck(element);
//        if(root==null){
//            root = new Node<>(element,null);
//            size++;
//            return;
//        }
//
//        Node<E> parent = root;
//        Node<E> node = root;
//
//        int cmp = 0;
//        while(node!=null){
//            cmp = compare(element,node.element);
//            parent = node;
//            if(cmp >0){
//                node = node.right;
//            }else if(cmp<0){
//                node = node.left;
//            }else{
//                node.element = element;
//                return;
//            }
//        }
//
//        Node<E> newNode = new Node<>(element,parent);
//        if(cmp >0){
//            parent.right = newNode;
//        }else{
//            parent.left = newNode;
//        }
//        size++;
//    }
//
//    public void remove(E element){
//
//    }
//    public boolean contains(E element){
//        return false;
//    }
//
//    private static class Node<E>{
//        E element;
//        Node<E> left;
//        Node<E> right;
//        Node<E> parent;
//        public Node(E element,Node<E> parent){
//            this.element = element;
//            this.parent = parent;
//        }
//    }
//}
