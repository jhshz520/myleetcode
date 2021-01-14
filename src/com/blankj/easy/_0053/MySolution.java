package _0053;

/**
 * @author jhshz
 * @des leetcode
 * @blog : www.jhshz.top
 * @time 2021/01/14 上午 9:40
 */

public class MySolution {
    public static void main(String[] args){
        int[] nums = {2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums0 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MySolution solution = new MySolution();
        int n = solution.maxSubarry(nums0);
        System.out.println(n);
    }


    public int maxSubarry(int[] nums){
        return helper_1(nums,0,nums.length );
    }

    public int helper_1(int[] nums,int begin,int end){
        if(end -begin<2) return nums[begin];
        int mid = (begin+end)>>1;
        int leftsum = 0;
        int leftMax = nums[mid-1];
        for(int i = mid -1;i >= begin ;i--){
            leftsum += nums[i];
            if(leftMax < leftsum){
                leftMax = leftsum;
            }
        }
        int rightSum = 0;
        int rightMax = nums[mid];
        for(int i = mid; i <end;i++){
            rightSum += nums[i];
            if(rightMax < rightSum){
                rightMax = rightSum;
            }
        }

        int leftMaxArry = helper_1(nums,begin,mid);
        int rightMaxArry = helper_1(nums,mid,end);
        return Math.max(Math.max(leftMaxArry,rightMaxArry),leftMax+rightMax);
    }
}
