package DSA;

import java.util.*;
//HASHSET
//import java.util.HashSet;
//import java.util.Iterator;
//
//public class Hashing {
//    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//
//        //insert
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        //set.add(1);
//
//        //print set
//        System.out.println(set);
//
////        //print size
////        System.out.println("Size of set is "+set.size());
////
////        //search
////        if(set.contains(1)){
////            System.out.println("Set contains 1");
////        }
////
////        //delete
////        set.remove(1);
////        if (!set.contains(1)){
////            System.out.println("1 is removed");
////        }
//        Iterator<Integer> it = set.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//    }
//}


//HASHMAP


//public class Hashing {
//    public static void main(String[] args) {
//        HashMap<String,Integer> hMap = new HashMap<>();
//
//        hMap.put("India",140);
//        hMap.put("USA",30);
//        hMap.put("China",150);
//
//        System.out.println(hMap);
//
//        //search
//        if(hMap.containsKey("India")){
//            System.out.println("This string is present");
//        }
//        System.out.println(hMap.get("India"));
//
//        //iteration
//        for(Map.Entry<String,Integer> e: hMap.entrySet()){
//            System.out.print(e.getKey()+" ");
//            System.out.println(e.getValue()+" ");
//        }
//        Set<String> keys = hMap.keySet();
//        for (String k: keys) {
//            System.out.println("keys= "+k+" value= "+hMap.get(k));
//        }
//        //isEmpty
////        hMap.clear();
////        System.out.println(hMap.isEmpty());
//    }
//}

//HASHTABLE
public class Hashing {

    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10, 0.75f);
        table.put(100, "Spongebob");
        table.put(123, "Patrik");
        table.put(321, "Squidward");
        table.put(555, "Sandy");
        table.put(777, "Gary");

        for (Map.Entry<Integer, String> key : table.entrySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
    }
}


//public class Hashing {
//    public static void main(String[] args) {
//        //Syntax
//        Map<String,Integer> mp = new HashMap<>();
//        //Adding Elements
//        mp.put("Akash",21);
//        mp.put("Yash",16);
//        mp.put("Luv",17);
//        mp.put("Rishika",19);
//        mp.put("Harry",18);
//        //Getting value of the key
//        System.out.println(mp.get("Yash")); //Returns value if key exists
//        System.out.println(mp.get("Ram"));  //null if value doesn't exist
//        //Changing or updating value of a key
//        mp.put("Akash",25);
//        //Removing a pair from
//        System.out.println(mp.remove("Akash"));
//        //Checking if a key is in
//        System.out.println(mp.containsKey("Akash"));
//        System.out.println(mp.containsKey("Yash"));
//        //Adding new entries only if the new key doesn't exist already
//        mp.putIfAbsent("Yash", 16);
//        mp.putIfAbsent("Yashika", 16);
//        //Get all keys
//        System.out.println(mp.keySet());
//        //Get all values
//        System.out.println(mp.values());
//        //Get all values
//        System.out.println(mp.entrySet());
//        //Traversing all entries
//        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }
//    }



