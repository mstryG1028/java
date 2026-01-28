
import java.util.*;

public class hashset {

    static int longestCons(int arr[]) {
        
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr) set.add(num); // add value to set
        int maxLength = -1;
        for (int val : set) {
            if (!set.contains(val - 1)) {
                int count = 1;
                int currVal = val;
                while (set.contains(currVal + 1)) {
                    count++;
                    currVal++;
                }
                maxLength = Math.max(maxLength, count);

            }
        }

        return maxLength;  // [1 2 3 4]
    }

    public static void main(String args[]) {
        // HashSet<Integer> set = new HashSet<>();
        // set.add(100);
        // set.add(4);
        // set.add(200);
        // set.add(1);
        // set.add(3);
        // set.add(2);
        int arr[]={100,4,200,1,3,2};
System.out.println(longestCons(arr));

    }
}
