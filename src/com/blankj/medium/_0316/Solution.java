package _0316;

import java.util.Stack;

public class Solution {

    public String  removeduplicat(String s){

        Stack<Character> stk = new Stack<>();
        boolean[] inStack = new boolean[256];
        int[] cnt = new int[256];
        for(int i = 0;i<s.length();i++ ){
            cnt[s.charAt(i)]++;
            System.out.println(s.charAt(i));
        }

        for(char c : s.toCharArray()){
            cnt[c]--;
            if(inStack[c]) continue;
            while(!stk.isEmpty()&&stk.peek()>c){
                if(cnt[stk.peek()]==0){
                    break;
                }
                inStack[stk.pop()] =false;
            }
            stk.push(c);
            inStack[c] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeduplicat("bcabc"));
    }
}
