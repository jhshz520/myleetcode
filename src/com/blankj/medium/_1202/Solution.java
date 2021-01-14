package _1202;

import java.util.*;

/**
 * @author jhshz
 * @des leetcode
 * @blog : www.jhshz.top
 * @time 2021/01/14 上午 11:51
 */

/**
 * 给你一个字符串 s，以及该字符串中的一些「索引对」数组 pairs，其中 pairs[i] = [a, b] 表示字符串中的两个索引（编号从 0 开始）。
 你可以 任意多次交换 在 pairs 中任意一对索引处的字符。
 返回在经过若干次交换后，s可以变成的按字典序最小的字符串
 */
public class Solution {
    public static void main(String[] args){
        String s= "dcab";
        List<List<Integer>> pairs = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(3);
        pairs.add(list);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        pairs.add(list1);
        Solution solution = new Solution();
        System.out.println(solution.smallestStringWithSwaps(s,pairs));
    }

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs){
        String res ="";
        int n = s.length();
        UF uf = new UF(n);
        for(List<Integer> pair : pairs){
            uf.union(pair.get(0),pair.get(1));
        }
/**
 * Map中采用Entry内部类来表示一个映射项，映射项包含Key和Value
 Map.Entry里面包含getKey()和getValue()方法,可以实现map的遍历
 */
        Map<Integer,List<Character>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
           int parent = uf.find(i);
           if(!map.containsKey(parent)){
               map.put(parent, new ArrayList<Character>());
           }
           map.get(parent).add(s.charAt(i));
        }

        for(Map.Entry<Integer,List<Character>> entry : map.entrySet()){
            Collections.sort(entry.getValue(), new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return o2 -o1;
                }
            });
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n; i++){
            int x = uf.find(i);
            List<Character> list = map.get(x);
            sb.append(list.remove(list.size()-1));
        }
        res = sb.toString();
        return res;
    }


    public static class UF{
        private int[] parent;
        private int[] rank;
        private int size;
        public UF(int n){
            parent = new int[n];
            rank = new int[n];
            size = n;
            for(int i = 0; i <n ;i++){
                parent[i] = i;
                rank[i] = 1;
            }
        }
        public int find(int a){
            int pa = parent[a];
            if(pa==a){
                return a;
            }else{
                parent[a] = find(parent[a]);
            }
            return parent[a];
        }

        public void union(int a, int b){
            int pa = find(a);
            int pb = find(b);
            if(pa == pb){
                return;
            }
            if(rank[pa]<rank[pb]){
                parent[pa] = pb;
            }else if(rank[pa]>rank[pb]){
                parent[pb] = pa;
            }else{
                parent[pa] = pb;
                rank[pb]++;
            }

            size--;
        }

        public int size(){
            return size;
        }
        public boolean isSame(int a, int b){
            return find(a) == find(b);
        }

    }

}
