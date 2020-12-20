package datastructure;



public class BinaryTree {
    // 对二叉排序树进行中序遍历，是升序排列

    //int size;
    //Node <E> node;

    public static void main(String[] args){
        int[] arr ={7,4,6,8,1,5,9};
        bst mybst= new bst();
        for(int i = 0;i<arr.length;i++){
            mybst.add(new Node(arr[i]));
        }

        mybst.infixOrder();
    }


}
class bst{
    private Node root;
    public void add (Node node){
        if(root==null){
            root = node;
        }else{
            root.add(node);
        }
    }

    public void infixOrder(){
        if(root!=null){
            root.infixOrder();
        }else{
            System.out.println("this bst is empty");
        }
    }

}
class Node{
    int value ;
    Node left;
    Node right;
    public Node(int value){
         this.value = value;
    }

    public void add(Node node){
        if(node==null){
            return;
        }

        if(node.value<this.value){
            if(this.left==null){
                this.left = node;
            }else{
                this.left.add(node);
            }
        }else{
            if(this.right==null){
                this.right = node;
            }else{
                this.right.add(node);
            }
        }
    }

    public void infixOrder(){
        if(this.left!=null){
            this.left.infixOrder();
        }
        System.out.print(this);
        if(this.right!=null){
            this.right.infixOrder();
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
