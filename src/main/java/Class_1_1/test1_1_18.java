package Class_1_1;

public class test1_1_18 {
    //如下为第二个问程序，计算的是a^b
    public static int mystery(int a, int b) {
        if (b == 0)     return 1;
        if (b % 2 == 0) return mystery(a * a, b / 2);
        return mystery(a * a, b / 2) * a;
    }
    public static void main(String[] args){
        System.out.println(mystery(2,24));//50
        System.out.println(mystery(3,11));//33
    }
}
