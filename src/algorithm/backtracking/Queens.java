package backtracking;

public class Queens {
    public static void main(String[] args){
        new Queens().placeQueens(8);
    }

    int[] cols;//cols[row] = col 表示第row行的皇后在第col列
    int ways = 0;


    void placeQueens(int n){
        if(n<1) return;
        cols = new int[n];
        place(0);
        System.out.println(n+" queens problem total ways is"+ways);
    }

    void place(int row) {
        if (row == cols.length) {
            ways++;
            show();
            return;
        }

        for (int col = 0; col < cols.length; col++) {
            if (isValid(row, col)) {
                cols[row] = col;
                place(row + 1);
            }
        }
    }

        boolean isValid(int row,int col){
            for(int i = 0;i<row;i++){
                if(cols[i] == col){
                    return false;
                }

                if(Math.abs(col-cols[i] )== row -i){
                    return false;
                }
            }
            return true;
    }

    void show(){
        for(int row = 0; row < cols.length; row++){
            for(int col = 0; col < cols.length;col++){
                if(cols[row]==col){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }

}
