import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
    public static int rank(int[] nums,int key){
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
            System.out.println(rank(list,key));
        }
    }
}
