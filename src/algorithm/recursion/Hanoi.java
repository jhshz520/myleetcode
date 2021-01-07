package recursion;

public class Hanoi {
    public static void main(String[] args){
        new Hanoi().hanoi(3,"A","B","C");
    }

    /**生成注释的方法是打出斜线和两个井号就能自动生成注释
     * 汉诺塔问题
     * @param n 数量
     * @param p1 左边的柱子
     * @param p2 中间的柱子
     * @param p3 右边的柱子
     */
    void hanoi(int n,String p1,String p2,String p3){
        if(n==1){
            move(n,p1,p3);
            return;
        }
            hanoi(n-1,p1,p3,p2);
            move(n,p1,p3);
            hanoi(n-1,p2,p1,p3);
    }

    void move(int no,String from,String to){
        System.out.println("将"+no+"号盘子从"+from+"挪动到"+to);
    }

}
