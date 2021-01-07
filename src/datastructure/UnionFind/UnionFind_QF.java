package UnionFind;

public class UnionFind_QF extends UnionFind {
    public UnionFind_QF(int capacity){
        super(capacity);
    }
    public int find(int v){
        rangeCheck(v);
        return parents[v];
    }

    public void union(int v1,int v2){
        int p1 = parents[v1];
        int p2 = parents[v2];

        for(int i = 0; i < parents.length;i++){
            if(parents[i]==p1){
                parents[i] = p2;
            }
        }
    }
}
