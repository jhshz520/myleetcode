package _5630;

public class Solution {//前缀和，map
    public static int maxinumUniqueSubarry(int[] nums){
        int max = 0;
        int[] arr = new int[nums.length+1];
        //arr[0] = nums[0];
        int maxlength = 0;
        for (int i = 0;i<nums.length;i++){
            arr[i+1]+=arr[i]+nums[i];//arr[i] is the sum of 0~i-1
            maxlength = Math.max(maxlength, nums[i]);
          //  System.out.println("maxlength="+maxlength);
        }


        boolean[] sign = new boolean[maxlength+1];
        /*for(int i = 0;i<nums.length+1;i++){
            //sign[i] = false;
            System.out.println(sign[i]);
        }*/
        // bool数组的最大长度为什么是数组的最大值加一? 因为要直接根据下标来判断这个值是否存在
        int left = 0;
        int right = 0;
        while (right<nums.length){
            for(;right<nums.length;right++){
                if(sign[nums[right]]){
                    break;
                }
                sign[nums[right]] = true;
            }

            int sum = arr[right] -arr[left];
            if( max <sum){
                max = sum;
            }

            if(right<nums.length){
                while(left<right&&nums[right]!=nums[left]){
                    sign[nums[left]] = false;//find the publicate of the right position
                    left++;
                }
                sign[nums[left]]= false;
            }
            sign[nums[left]] = false;
            left++;
        }
        return max;
    }
    public static void main(String[] args){
        int[] test =new int[] {4,2,4,5,6};
        System.out.println(Solution.maxinumUniqueSubarry(test));
    }
}
