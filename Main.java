import java.util.*;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Hello world!");
////    }
////}
//
//
////class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int[] prices = new int[n];
////
////        for (int i = 0; i < prices.length; i++) {
////            prices[i] = sc.nextInt();
////        }
////
////        int buyPrice = prices[0]; // Initialize buyPrice after reading prices[0]
////        int profit = 0;
////
////        for (int i = 0; i < prices.length; i++) {
////            if (prices[i] <= buyPrice) {
////                buyPrice = prices[i];
////            } else {
////                int profit2 = prices[i] - buyPrice;
////                profit = Math.max(profit2, profit);
////            }
////        }
////
////        System.out.println(profit);
////    }
////}
//
////class Main{
////    public static void main(String[] args) {
////int[] nums = {2,2,1,1,1,2,2};
////        System.out.println(majorityElement(nums));
////    }
////    public static int majorityElement(int[] nums) {
////        int first = nums[0];
////        int count = 1;
////        for(int i=0;i<nums.length;i++) {
////            if (nums[i] == first) {
////                count++;
////            } else {
////                count--;
////            }
////        }
////            count = 0;
////            for (int i = 0;i<nums.length;i++) {
////                if (nums[i] == first) {
////                    count++;
////                }
////            }
////            if(count>nums.length/2){
////                return first;
////            }
////        return -1;
////        }
////    }
//
////class Main{
////    public static void main(String[] args) {
////        String ascii= "abc";
////        char var =  ascii.charAt(1);
////        int answer = (int) var;
////        System.out.println(answer);
////    }
////}
//
////class Main {
////    public static void main(String[] args) {
////        int ascii = 64;
////        //char character = ascii.charAt(1);
////        System.out.println(ascii+'a');
////    }
////}
//
//
////import java.util.*;
////public class Main {
////    public static void main(String[] args) {
////        Scanner scn=new Scanner(System.in);
////        String str=scn.next();
////        sol(str);
////    }
////    public static void sol(String str) {
////        int cnt=0;
////        for(int i=0;i<str.length();i++)
////        {
////            for(int j=i+1;j<=str.length();j++)
////            {
////                String sub=str.substring(i,j);
////                boolean ans=isPalindrome(sub);
////                if(ans==true)
////                {
////                    cnt+=1;
////                }
////            }
////        }
////        System.out.print(cnt);
////    }
////    public static boolean isPalindrome(String str)
////    {
////
////        int i=0;
////        int j=str.length()-1;
////        while(i<j)
////        {
////            if(str.charAt(i)!=str.charAt(j))
////            {
////                return false;
////            }
////            i++;
////            j--;
////        }
////        return true;
////    }
////}
////public class Main {
////    public static void main(String[] args) {
////        int n = 10; // Change this value to the desired upper limit
////
////        System.out.println("Prime numbers from 1 to " + n + ":");
////
////        for (int num = 2; num <= n; num++) {
////            if (isPrime(num)) {
////                System.out.print(num + " ");
////            }
////        }
////    }
////
////    // Function to check if a number is prime
////    public static boolean isPrime(int num) {
////        if (num <= 1) {
////            return false;
////        }
////
////        // Check from 2 to the square root of the number
////        for (int i = 2; i <= Math.sqrt(num); i++) {
////            if (num % i == 0) {
////                return false; // Found a divisor, not prime
////            }
////        }
////
////        return true; // No divisors found, prime number
////    }
////}
//
//
//// TODO: 29-08-2023 Hacker_blocks question (Arrange string of numbers in descending order) 548 56 60
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int t = sc.nextInt();
////        for(int i = 0;i<t;i++) {
////            int n = sc.nextInt();
////            String[] array = new String[n];
////            for (int x = 0; x < n; x++) {
////                array[x] = sc.nextInt()+"";
////            }
////
//////            Arrays.toString(array);
////            for (int x = 0; x < n; x++) {
////                Arrays.sort(array);
////                System.out.print(array[x]);
////            }
////        }
////    }
////}
//
////public class Main {
////    public static void main(String[] args) {
////        ArrayList<Integer> list = new ArrayList<>();
////        list.add(10);
////        list.add(20);
////        list.add(30);
////        list.add(40);
////        list.add(50);
////        System.out.println(list);
////        int i = 0;
////        int j = list.size() - 1;
////        while (i < j) {
////            int temp = list.get(i);
////            int temp2 = list.get(j);
////            list.set(i, temp2);
////            list.set(j, temp);
////            i++;
////            j--;
////        }
////        System.out.println(list);
////    }
////}
//
////PRINT ALL POSSIBLE PERMUTATIONS
////public class Main {
////    public static void main(String[] args) {
////        sol("abc","");
////    }
////    public static void sol(String str,String ans){
////        if (str.length()==0){
////            System.out.println(ans);
////            return;
////        }
////        for(int i=0;i<str.length();i++){
////            char ch = str.charAt(i);
////            String rem = str.substring(0,i)+str.substring(i+1);
////            sol(rem,ans+ch);
////        }
////    }
////}
//
//
////public class Main {
////    public static void main(String[] args) {
////        sol("23","");
////    }
////    public static void sol(String digits, String ans){
////        if(digits.length()==0)
////        {
////            System.out.println(ans);
////            return;
////        }
////        char ch=digits.charAt(0);
////        String temp=getString(ch);
////        for(int i=0;i<temp.length();i++)
////        {
////            char ch1=temp.charAt(i);
////            sol(digits.substring(1),ans+ch1);
////        }
////    }
////    public static String getString(char ch){
////        if(ch=='2')
////        {
////            return "abc";
////        }
////        if(ch=='3')
////        {
////            return "def";
////        }
////        if(ch=='4')
////        {
////            return "ghi";
////        }
////        if(ch=='5')
////        {
////            return "jkl";
////        }
////        if(ch=='6')
////        {
////            return "mno";
////        }
////        if(ch=='7')
////        {
////            return "pqrs";
////        }
////        if(ch=='8')
////        {
////            return "tuv";
////        }
////        if(ch=='9')
////        {
////            return "wxyz";
////        }
////        return "";
////    }
////}
//
////import java.util.*;
////public class Main {
////    public static void main(String[] args) {
////        // Your Code Here
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        System.out.println(triangle(n));
////    }
////    public static int triangle(int n){
////        if(n==1){
////            return 1;
////        }
////
////        return n +triangle(n-1);
////
////    }
////}
//
//
////public class Main {
////         class Box {
////            int b1; // b1=arr[idx]
////            int b2; // b2=count
////        }
////
////        public static void main(String[] args) {
////            int[] arr = {1, 2, 32, 4, 6, 7, 9};
////            Main st = new Main();
////            st.sol(arr);
////        }
////
////        public void sol(int[] arr) {
////
////            Stack<Box> s = new Stack<>();
////            for(int i = 0; i < arr.length; i++) {
////                int cnt = 1;
////                while (!s.isEmpty() && s.peek().b1 < arr[i]) {
////                    cnt += s.peek().b2;
////                    s.pop();
////                }
////
////                Box nb = new Box();
////                nb.b1 = arr[i];
////                nb.b2 = cnt;
////                s.push(nb);
////                System.out.println(nb.b2);
////            }
////        }
////    }
//
//
////public class Main {
////    public static class Node{
////        int data;
////        Node next;
////
////        public Node(int data){
////            this.data = data;
////            this.next = null;
////        }
////    }
////    public static Node head;
////    public static Node tail;
////    public static void print(){
////        if (head==null){
////            System.out.println("null");
////            return;
////        }
////        Node temp = head;
////        while (temp!=null){
////            System.out.print(temp.data+" ");
////            temp=temp.next;
////        }
////        System.out.println();
////    }
////    public static void main(String[] args) {
////        Main ll = new Main();
////
////    }
////}
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        // Create an ArrayList of strings
//        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//
//        // Find all permutations of the list
//        ArrayList<String> permutations = new ArrayList<>();
//        permutations(list, 0, list.size() - 1, permutations);
//
//        // Print the permutations
//        for (String str : permutations) {
//            System.out.println(str);
//        }
//    }
//
//    // Finds all permutations of the specified list
//    private static void permutations(ArrayList<String> list, int start, int end, ArrayList<String> permutations) {
//
//        // If we have reached the end of the list, add the current permutation to the list of permutations
//        if (start == end) {
//            permutations.add(String.join("", list));
//            return;
//        }
//
//        // For each element in the list, swap it with the element at the start of the list, then recursively find all permutations of the remaining elements
//        for (int i = start; i <= end; i++) {
//            Collections.swap(list, start, i);
//            permutations(list, start + 1, end, permutations);
//            Collections.swap(list, start, i);
//        }
//    }
//}
//
//
////public class Main {
////
////    public static void main(String[] args) {
////
//         Create an ArrayList of integers
////        ArrayList<Integer> list = new ArrayList<>();
////        list.add(1);
////        list.add(2);
////        list.add(3);
//
//        // Find all permutations of the list
//        ArrayList<ArrayList<Integer>> permutations = new ArrayList<>();
//        permutations(list, 0, list.size() - 1, permutations);
//
//        // Print the permutations
//        for (ArrayList<Integer> permutation : permutations) {
//            for (int num : permutation) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    // Finds all permutations of the specified list
//    private static void permutations(ArrayList<Integer> list, int start, int end, ArrayList<ArrayList<Integer>> permutations) {
//
//        // If we have reached the end of the list, add the current permutation to the list of permutations
//        if (start == end) {
//            permutations.add(new ArrayList<>(list));
//            return;
//        }
//
//        // For each element in the list, swap it with the element at the start of the list, then recursively find all permutations of the remaining elements
//        for (int i = start; i <= end; i++) {
//            Collections.swap(list, start, i);
//            permutations(list, start + 1, end, permutations);
//            Collections.swap(list, start, i);
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        while (scanner.hasNextInt()) {
//            int num = scanner.nextInt();
//            arrayList.add(num);
//        }
//        int flag = 0;
//        for (int start = 0; start < arrayList.size(); start++) {
//            int sum = 0;
//            for (int end = start; end < arrayList.size(); end++) {
//                sum += arrayList.get(end);
//
//                if (sum == 0) {
//                    flag = 1;
//                    for (int i = start; i <= end; i++) {
//                        System.out.print(arrayList.get(i) + " ");
//                    }
//                    System.out.println();
//                }
//            }
//        }
//        if (flag == 0) {
//            System.out.println("program running");
//        }
//    }
//}




































