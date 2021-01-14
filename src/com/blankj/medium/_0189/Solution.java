package _0189;

/**
 * @author jhshz
 * @des leetcode
 * @blog : www.jhshz.top
 * @time 2021/01/14 下午 3:30
 */

import java.util.Arrays;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class Solution {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums ={1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(nums));
        solution.rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
    public void rotate(int[] nums,int k){
        int n = nums.length;
        int[] newarr = new int[n];
        for(int i =0;i <n;i++){
            newarr[(i+k)%n] = nums[i];
        }
        System.arraycopy(newarr,0,nums,0,n);
    }
}
