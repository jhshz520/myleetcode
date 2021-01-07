package UnionFind;

public class UnionFind_QU_S extends UnionFind_QU {
    private int[] size;
    public UnionFind_QU_S(int capacity){
        super(capacity);

        size = new int[capacity];

        for(int i = 0;i < size.length; i++){
            size[i] = 1;
        }
    }

    public void union(int v1,int v2){
        int p1 = find(v1);
        int p2 = find(v2);

        if(p1==p2) return;

        if(size[p1]<size[p2]){
            parents[p1] = p2;
            size[p2]+=size[p1];
        }else{
            parents[p2] = p1;
            size[p1]+=size[p2];
        }
    }
}
