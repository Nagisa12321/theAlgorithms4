package Class_1_1;

public class test1_1_20 {
    public static double lnN(double N){
        if(N == 0 || N == 1)return 0.0;  // 0�Ľ׳˺�1�Ľ׳˶�Ϊ1
        else {
            return Math.log(N)+lnN(N-1);
        }
    }

    public static void main(String[] args){
        System.out.println(lnN(10000));
    }
}
