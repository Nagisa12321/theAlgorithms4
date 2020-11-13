package Class1;

public class test1_1_17 {
    /**原来：在判断之前就开始递归，导致无穷递归
     * public static String exR2(int n){
     *        String s = exR2(n - 3) + n + exR2(n - 2) + n;
     *        if(n <= 0)return "";
     *        return s;
     *     }
     * @param n
     * @return
     */
    public static String exR2(int n) {
        if (n <= 0) return "";
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(exR2(10));
    }
}
