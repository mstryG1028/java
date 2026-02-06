
import java.util.HashSet;



public class hashset {

    static int longestCons(int arr[]) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr) set.add(num); // add value to set
        int maxLength = -1;
        for (int val : set) {
    // here we are finding the startting value then
    //  increase count by finding consecutive inceasing value
    
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
    
// at first iteration val=100 and 99 not contains condition satisfied
/*then it will check for 101 which is not in set therefore maxlength=1
 for val=1 0 not contains then it will start finding val+1 by increasing count
 therefore maxlength=4

*/


    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(100);
        set.add(4);
        set.add(200);
        set.add(1);
        set.add(3);
        set.add(2);
        int arr[] = {100, 4, 200, 1, 3, 2};
        // System.out.println(longestCons(arr));

    }
}
