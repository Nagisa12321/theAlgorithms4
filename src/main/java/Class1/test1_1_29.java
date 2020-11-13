package Class1;

public class test1_1_29 {
    public static boolean RelativelyPrime(int[][] i) {
        int a = i.length, b = i[0].length;
        if(a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int c;
        while((c = a % b) != 0) {
            a = b;
            b = c;
        }
        return b == 1;
    }

    public static void main(String[] args) {
        int[][] test = new int[55][60];
        System.out.println(RelativelyPrime(test));
    }
}
