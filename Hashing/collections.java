
// // import java.util.HashMap;
// // public class collections {
// //     public static void main(String args[]) {
// //         HashMap<Integer, String> map = new HashMap<>();
// //         map.put(1, "deepak");
// //         map.put(2, "rajesh");
// //         map.put(3, "mohit");
// //         map.put(4, "kalpesh");
// //         map.put(5, "sonu");
// //         // for(Integer key:map.keySet()){          // FOR EACH METHOD TO PRINT ALL VALUE OF HASHMAP
// //         //     System.out.println(key+ map.get(key));
// //         // }
// // // for(Map.Entry<Integer,String>e:map.entrySet()){
// // // System.out.println("name is:"+e.getValue());
// // // }
// // System.out.println(map.remove(4));  // REMOVE DELETE BHI KARTA HAI OR VALUE RETURN BHI KARTA HAI AGAR VALUE NHI HAI TO NULL
// // System.out.println(map);
// //     }
// // }
// import java.util.HashMap;
// import java.util.Map;

// class collections {

//     public static void main(String[] args) {
//         HashMap<Integer, String> map = new HashMap<>();
//         map.put(1, "one");
//         map.put(2, "two");
//         map.put(3, "three");

//         for (Map.Entry<Integer, String> e : map.entrySet()) {
//             System.err.println(e.getKey() + " " + e.getValue());
//         }
//         for (Integer key : map.keySet()) {
//             System.err.println(key + " " + map.get(key));
//         }
//     }
// }



// /*
// ========================================================
//         LOOPING TECHNIQUES IN HASHMAP AND HASHSET
// ========================================================

// Data Structures Covered:
// 1. HashMap
// 2. HashSet

// Each looping style is explained with comments.


// public class MapSetLoopingDemo {

//     public static void main(String[] args) {

//         /*
//         -------------------------------------------------
//                     HASHMAP EXAMPLE
//         -------------------------------------------------
//         HashMap stores data in KEY -> VALUE pairs
//         Example:
//         Java -> 10
//         Python -> 20
//         C++ -> 30
//         */

//         HashMap<String,Integer> map = new HashMap<>();

//         map.put("Java",10);
//         map.put("Python",20);
//         map.put("C++",30);



//         /*
//         -------------------------------------------------
//         1️⃣ LOOP USING entrySet()  (BEST METHOD)
//         -------------------------------------------------
//         entrySet() returns:
//         Set<Map.Entry<K,V>>

//         This gives both key and value together.
//         Most efficient and commonly used in interviews.
//         */

//         for(Map.Entry<String,Integer> entry : map.entrySet()){

//             System.out.println(entry.getKey() + " -> " + entry.getValue());

//         }



//         /*
//         -------------------------------------------------
//         2️⃣ LOOP USING keySet()
//         -------------------------------------------------
//         keySet() returns all keys.

//         If you want value, you must use:
//         map.get(key)

//         Slightly slower because it performs
//         an extra lookup.
//         */

//         for(String key : map.keySet()){

//             System.out.println(key + " -> " + map.get(key));

//         }



//         /*
//         -------------------------------------------------
//         3️⃣ LOOP ONLY VALUES
//         -------------------------------------------------
//         values() returns all values in the map.
//         Used when keys are not needed.
//         */

//         for(Integer value : map.values()){

//             System.out.println(value);

//         }



//         /*
//         -------------------------------------------------
//         4️⃣ LOOP USING ITERATOR
//         -------------------------------------------------
//         Iterator is useful when you want to
//         remove elements during traversal.
//         */

//         Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();

//         while(it.hasNext()){

//             Map.Entry<String,Integer> entry = it.next();

//             System.out.println(entry.getKey()+" -> "+entry.getValue());

//         }



//         /*
//         -------------------------------------------------
//                     HASHSET EXAMPLE
//         -------------------------------------------------
//         HashSet stores unique elements only.

//         Example:
//         apple, mango, banana
//         */

//         HashSet<String> set = new HashSet<>();

//         set.add("Apple");
//         set.add("Mango");
//         set.add("Banana");



//         /*
//         -------------------------------------------------
//         1️⃣ FOR-EACH LOOP (MOST COMMON)
//         -------------------------------------------------
//         */

//         for(String item : set){

//             System.out.println(item);

//         }



//         /*
//         -------------------------------------------------
//         2️⃣ USING ITERATOR
//         -------------------------------------------------
//         */

//         Iterator<String> it2 = set.iterator();

//         while(it2.hasNext()){

//             System.out.println(it2.next());

//         }



//         /*
//         -------------------------------------------------
//         3️⃣ USING forEach() METHOD (Java 8+)
//         -------------------------------------------------
//         Lambda expression approach.
//         */

//         set.forEach(item -> System.out.println(item));



//         /*
//         -------------------------------------------------
//         SUMMARY
//         -------------------------------------------------

//         HashMap Looping:
//         ✔ entrySet()  → Best (key + value)
//         ✔ keySet()    → Keys only
//         ✔ values()    → Values only
//         ✔ Iterator    → Needed for safe removal

//         HashSet Looping:
//         ✔ for-each loop
//         ✔ Iterator
//         ✔ forEach() lambda
       

//     }
// }

//  */