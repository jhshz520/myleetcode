package _5650;

import java.util.*;

/**
 * @author jhshz
 * @des leetcode
 * @blog : www.jhshz.top
 * @time 2021/01/11 上午 9:25
 */

/**
 *给你两个整数数组 source 和 target ，长度都是 n 。还有一个数组 allowedSwaps ，其中每个 allowedSwaps[i] = [ai, bi] 表示你可以交换数组 source 中下标为 ai 和 bi（下标从 0 开始）的两个元素。注意，你可以按 任意 顺序 多次 交换一对特定下标指向的元素。
 相同长度的两个数组 source 和 target 间的 汉明距离 是元素不同的下标数量。形式上，其值等于满足 source[i] != target[i] （下标从 0 开始）的下标 i（0 <= i <= n-1）的数量。
 在对数组 source 执行 任意 数量的交换操作后，返回 source 和 target 间的 最小汉明距离 。
 */
public class Solution {
    public int mininumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
       int ans = 0;
       int n = source.length;
       Map<Integer,List<Integer>> map = new HashMap<>();
       UF uf = new UF(n);
       for(int[] swap:allowedSwaps){
           uf.union(swap[0],swap[1]);
       }

       for(int i = 0; i < n; i++){
           /**
            * put与putIfAbsent区别:
            put在放入数据时，如果放入数据的key已经存在与Map中，最后放入的数据会覆盖之前存在的数据，
            而putIfAbsent在放入数据时，如果存在重复的key，那么putIfAbsent不会放入值
            */
            map.putIfAbsent(target[i],new LinkedList<>());
            map.get(target[i]).add(i);
       }

       for(int i = 0; i < n; i++){
           if(!map.containsKey(source[i])){
               ans++;
               continue;
           }

           List<Integer> list = map.get(source[i]);
           Iterator<Integer> iterator = list.iterator();
           boolean flag = false;
           while(iterator.hasNext()){
               Integer index = iterator.next();
               if(uf.isSame(i,index)){
                   System.out.println(iterator);
                   iterator.remove();
                   flag = true;
                   break;
               }
           }
           if(!flag){
               ans++;
           }
       }

        return ans;
    }

    public static class UF {
        private int[] parent;
        private int[] rank;
        private int size;
        public UF(int n){
            size = n;
            parent = new int[n];
            rank = new int[n];
            for(int i = 0; i < n; i++){
                parent[i] = i;
                rank[i] = 1;
            }
        }
        public int size(){
            return size;
        }

        public int find(int a){
            int pa =parent[a];
            if(pa == a){
                return a;
            }else{
                a = find(pa);
            }
            return parent[a];
        }

        public void union(int a,int b){
            int pa = find(a);
            int pb = find(b);
            if(pa == pb){
                return;
            }else{
                if(rank[pa] == rank[pb]){
                    parent[pa] = pb;
                    rank[pb]++;
                }else if(rank[a] < rank[b]){
                    parent[pa] = pb;
                }else{
                    parent[pb] = pa;
                }
            }

        }
        public boolean isSame(int a,int b){
            return find(a) == find(b);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> list = new ArrayList<>();
        int[] source = {1,2,3,4};
        int[] target = {1,3,2,4};
        int[][] allowSwap ={};
        System.out.println(allowSwap.length);

        list.add(Arrays.asList(1, 2, 2, 1));
        list.add(Arrays.asList(3, 1, 2));
        list.add(Arrays.asList(1, 3, 2));
        list.add(Arrays.asList(2, 4));
        list.add(Arrays.asList(3, 1, 2));
        list.add(Arrays.asList(1, 3, 1, 1));
        System.out.println(solution.mininumHammingDistance(source,target,allowSwap));
    }
}