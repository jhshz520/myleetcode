package com.blankj.medium._0316;



/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2020/06/30
 *     desc  :
 * </pre>
 */
public class Solution {
    public String removeDuplicateLetters(String letters){
        Stack<Character> stk = new Stack<>();

        int[] cnt = new int[256];
        for(int i = 0;i<letters.length();i++){
            cnt[s.charAt(i)]++;
        }

        boolean[] inStack = new boolean[];

        for(char c: s.toArray()){
            count[c]++;
            if(inStack[c]) continue;
            while(!stk.isEmpty()&&stk.peek()>c){
                if(count[stk.peek()]==0){
                    break;
                }
                inStack[stk.pop()] = false;
            }
            stk.push(c);
            inStack[c] = true;
        }
        StringBuilder sb= new StringBuilder();
        while(!stk.empty()){
            sb.append(stk.pop())
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicateLetters("bcabc"));
    }
}