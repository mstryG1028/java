
// import java.util.HashMap;
// public class collections {
//     public static void main(String args[]) {
//         HashMap<Integer, String> map = new HashMap<>();
//         map.put(1, "deepak");
//         map.put(2, "rajesh");
//         map.put(3, "mohit");
//         map.put(4, "kalpesh");
//         map.put(5, "sonu");
//         // for(Integer key:map.keySet()){          // FOR EACH METHOD TO PRINT ALL VALUE OF HASHMAP
//         //     System.out.println(key+ map.get(key));
//         // }
// // for(Map.Entry<Integer,String>e:map.entrySet()){
// // System.out.println("name is:"+e.getValue());
// // }
// System.out.println(map.remove(4));  // REMOVE DELETE BHI KARTA HAI OR VALUE RETURN BHI KARTA HAI AGAR VALUE NHI HAI TO NULL
// System.out.println(map);
//     }
// }
import java.util.HashMap;
import java.util.Map;

class collections {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.err.println(e.getKey() + " " + e.getValue());
        }
        for (Integer key : map.keySet()) {
            System.err.println(key + " " + map.get(key));
        }
    }
}
