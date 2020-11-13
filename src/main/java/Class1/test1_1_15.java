package Class1;

public class test1_1_15 {
    public static int[] histogram(int[] a,int M){
        int[] b = new int[M];
        for(int i = 0;i < M - 1;++i){
            int num = 0;
            for(int j = 0;j < a.length - 1;++j){
                if(i == a[j]) ++num;
            }
            b[i] = num;
        }
        return b;
    }
}
