package UnionFind;
import UnionFind.Times;

public class Main {
    static final int count = 10000;
    public static void main(String[] args){
        testTime(new UnionFind_QU_S(count));
        testTime(new UnionFind_QU_R(count));
        testTime(new UnionFind_QU_R_PC(count));
        testTime(new UnionFind_QU_R_PH(count));
        testTime(new UnionFind_QU_R_PS(count));
    }
    static void testTime(UnionFind uf){

        Times.test(uf.getClass().getSimpleName(),()->{
            for(int i = 0; i<count;i++){
                uf.union((int)(Math.random()*count),(int)(Math.random()*count));
            }

            for(int i = 0; i< count; i++){
                uf.isSame((int)(Math.random()*count),(int)(Math.random()*count));
            }
        });
    }
}
