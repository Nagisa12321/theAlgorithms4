package Class1;

public class test1_1_13 {
    public static void main(String[] args){

    }

    public static int[][] change(int[][] a){
        int x = a.length,y = a[0].length;
        int[][] b = new int[y][x];
        for(int i = 0;i < y;++i){
            for(int j = 0;j < x;++j)
                b[i][j] = a[j][i];
        }
        return b;
    }
}
