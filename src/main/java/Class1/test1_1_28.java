package Class1;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class test1_1_28 {
    public static void main(String[] args) {
        int[] whitelist = {7, 1, 5, 1, 9, 5, 7, 7, 5, 1};
        Arrays.sort(whitelist);
        Set<Integer> theSet = new HashSet<>();
        for (int i = 0; i != whitelist.length; ++i)
            theSet.add(whitelist[i]);
        var theList = theSet.toArray();
        int[] tmp = new int[theList.length];
        for(int i = 0;i < theList.length;++i){
            tmp[i] = (int) theList[i];
        }
        whitelist = tmp;
        System.out.println(Arrays.toString(whitelist));
        System.out.println(BinarySearch.indexOf(whitelist, StdIn.readByte()));
    }
}
