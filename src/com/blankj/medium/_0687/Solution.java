package _0687;

/**
 * @author jhshz
 * @des leetcode
 * @blog : www.jhshz.top
 * @time 2021/01/14 下午 3:42
 */


import com.blankj.structure.TreeNode;

/**
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 注意：两个节点之间的路径长度由它们之间的边数表示

 写递归程序，重要的是四点，输入参数、输出结果、函数的功能、终止条件
 */
public class Solution {
    int ans;
    public static void main(String[] args){
       Solution solution = new Solution();
        //TreeNode root = TreeNode.createTestData("[5,4,5,1,1,5]");
        TreeNode root1 = TreeNode.createTestData("[1,4,5,4,4,5]");
 /*       TreeNode.print(root);
        solution.longestUnivaluePath(root);
        System.out.println(solution.ans);*/
        TreeNode.print(root1);
        solution.longestUnivaluePath(root1);
        System.out.println(solution.ans);


    }

    public int longestUnivaluePath(TreeNode root){
        ans = 0;
        longestPath(root);
        return ans;
    }

    public int longestPath(TreeNode node){
        if(node==null) return 0;
        int maxLores = 0;
        int left = longestPath(node.left);
        int right = longestPath(node.right);

        if(node.left != null&&node.left.val==node.val&&node.right!=null && node.right.val==node.val){
            ans = Math.max(ans,left+right+2);
        }
        if(node.left!=null&&node.left.val==node.val){
            maxLores = left +1;
        }

        if(node.right!=null&&node.right.val==node.val){
            maxLores = Math.max(right+1,maxLores);
        }

        ans = Math.max(ans,maxLores);
        return maxLores;
    }
}
