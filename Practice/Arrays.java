package Practice;
import java.util.*;
//public class Arrays {
//    public static void main(String[] args) {
//        String str = "HelloWorld";
//       // int substr = Integer.parseInt(str.substring(0,5));
//        System.out.println(str.substring(0,5));
//    }
//}

//public class Arrays {
//    public static void main(String[] args) {
//        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        printMaximumSubarray(nums);
//    }
//    public static void printMaximumSubarray(int[] nums) {
//        int maxEndingHere = nums[0];
//        int maxSoFar = nums[0];
//
//        int start = 0;
//        int end = 0;
//        int tempStart = 0;
//
//        for (int i = 1; i < nums.length; i++) {
//            if (maxEndingHere < 0) {
//                maxEndingHere = nums[i];
//                tempStart = i;
//            } else {
//                maxEndingHere += nums[i];
//            }
//
//            if (maxEndingHere > maxSoFar) {
//                maxSoFar = maxEndingHere;
//                start = tempStart;
//                end = i;
//            }
//        }
//
//        System.out.println("Maximum subarray sum: " + maxSoFar);
//        System.out.println("Subarray elements:");
//
//        for (int i = start; i <= end; i++) {
//            System.out.print(nums[i] + " ");
//        }
//    }
//}


//ARRAYLIST

//public class Arrays {
//    public static void main(String[] args) {
        //wrapper class
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);

//        ArrayList<Integer> l1 = new ArrayList<>();
//        //add an element
//        l1.add(5);
//        l1.add(6);
//        l1.add(7);
//        l1.add(8);
//        //get an element at index i
//        System.out.println(l1.get(0));
//        //print with for loop
//        for (int i = 0;i<l1.size();i++){
//            System.out.print(l1.get(i)+" ");
//        }
//        System.out.println();
//        //printing the arraylist directly
//        System.out.println(l1);
//        //adding element at some index i
//        l1.add(1,100);
//        System.out.println(l1);
//        //modifying element at index i
//        l1.set(1,10);
//        System.out.println(l1);
//        //removing element at index i
//        l1.remove(1);
//        System.out.println(l1);
//        //removing an element e
//        l1.remove(Integer.valueOf(7));
//        System.out.println(l1);
//        //checking if an element exists
//        boolean answer = l1.contains(Integer.valueOf(6));
//        System.out.println(answer);
//        //if you don't specify class, you can put anything inside l
//        ArrayList l = new ArrayList();
//        l.add(1);
//        l.add("pratham");
//        l.add(true);
//        System.out.println(l);
//
//
//    }
//}

//public class Arrays {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(10);
//        list.add(3);
//        list.add(5);
//        list.add(22);
//        list.add(10);
//        System.out.println("Original list "+list);
//        Collections.reverse(list);
//        System.out.println(list);
//        Collections.sort(list,Collections.reverseOrder());
////        reverseList(list);
//        System.out.println("Reverse list "+list);
//    }
//    static void reverseList(ArrayList<Integer> list){
//        int i= 0;
//        int j= list.size()-1;
//        while(i<j){
//            Integer temp = list.get(i);
//            list.set(i, list.get(j));
//            list.set(j,temp);
//            i++;
//            j--;
//        }
//    }
//}

public class Arrays {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);
        for (int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for (int j=0;j< currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}