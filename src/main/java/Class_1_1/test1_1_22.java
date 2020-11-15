package Class_1_1;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;
import java.util.Scanner;

public class test1_1_22 {
    public static int rank(int[] nums,int key,int deep){
        deep++;
        int left = 0,right = nums.length - 1;
        while (left < right){
            int mid = (left + right)/2;
            if(mid > key) right = mid - 1;
            else if (mid < key) left = mid + 1;
            else return mid;
        }
        return  -1;
    }

    public static void main(String[] args){
        int[] list = StdIn.readAllInts();
        Arrays.sort(list);
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int key = in.nextByte();
            System.out.println(rank(list,key,0));
        }
    }
}
