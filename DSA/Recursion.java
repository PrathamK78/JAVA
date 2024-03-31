package DSA;

//public class Recursion {
//    public static void main(String[] args) {
//        int a =10;
//        int b= 20;
////        int sum=a+b;
//        add(a,b);
//
//    }
//    public static void add(int a,int b){
//        int sum=a+b;
//        System.out.println(sum);
//        add(sum,b);
//
//}


//class Recursion{
//    public static void main(String[] args) {
//        int n=1;
//        Decreasing(n);
//    }
//    public static void Decreasing(int n){
//        if (n==10){
//            System.out.print(n);
//            return;
//        }
//        Decreasing(n+1);
//        System.out.print(n+" ");
//
//    }
//}

//FACTORIAL OF N NUMBERS
//class Recursion{
//    public static void main(String[] args) {
//        int n= 5;
//        System.out.println(fact(n));
//    }
//    public static int fact(int n){
//        if (n==0){
//            return 1;
//        }
//        return n*fact(n-1);
//    }
//}

//SUM OF N NATURAL NUMBERS
//class Recursion{
//    public static void main(String[] args) {
//        int n= 5;
//        System.out.println(fact(n));
//    }
//    public static int fact(int n){
//        if (n==1){
//            return 1;
//        }
//        return n+fact(n-1);
//    }
//}

//FIBONACCI NUMBER
//class Recursion{
//    public static void main(String[] args) {
//        int a=0,b=1;
//        System.out.print("0 1 ");
//        for (int i=0;i<10;i++){
//           // int sum=0;
//           int temp=a+b;
//           a=b;
//           b=temp;
//            System.out.print(temp+" ");
//        }
////        for (int i=0;i<n.length;i++){
////            System.out.print(n[i]+" ");
////        }
//    }
//}

//FIBONACCI NUMBER USING RECURSION
//class Recursion{
//    public static void main(String[] args) {
//        int n=10;
//        System.out.println(fib(n));
//    }
//    public static int fib(int n){
//        if (n==0){
//            return 0;
//        }
//        if (n==1){
//            return 1;
//        }
//        return fib(n-1)+fib(n-2);
//    }
//}

//CHECK IF THE ARRAY IS SORTED OR NOT
//class Recursion{
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        System.out.println(sort(arr,0));
//    }
//    public static boolean sort(int[] arr,int i){
//        if (i== arr.length-1){
//            return true;
//        }
//        if (arr[i]>arr[i+1]){
//            return false;
//        }
//        return sort(arr,i+1);
//    }
//}

//FIND THE FIRST OCCURRENCE OF THE ELEMENT
//class Recursion{
//    public static void main(String[] args) {
//        int[] arr = {8,3,6,9,5,10,2,5,3};
//        int key = 5;
//        System.out.println(firstOccur(arr,5,0));
//    }
//    public static int firstOccur(int[] arr,int key,int i){
//        if (i== arr.length){
//            return -1;
//        }
//        if (arr[i]==key){
//            return i;
//        }
//        return firstOccur(arr,key,i+1);
//    }
//}

//FIND THE LAST OCCURRENCE OF THE ELEMENT
//class Recursion {
//    public static void main(String[] args) {
//        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//        //int key = 5;
//        System.out.println(lastOccur(arr, 5, 0));
//    }
//    public static int lastOccur(int[] arr,int key,int i){
//
//        if (i== arr.length){
//            return -1;
//        }
//        int isFound = lastOccur(arr,key,i+1);
//        if(isFound!=-1){
//            return isFound;
//        }
//        if (arr[i]==key){
//            return i;
//        }
//        return isFound;
//    }
//}

//PRINT (X^N)
//class Recursion{
//    public static void main(String[] args) {
//
//        System.out.println(powerOf(2,10));
//    }
//    public static int powerOf(int x,int n){
//        if (n==0){
//            return 1;
//        }
//        return x*powerOf(x,n-1);
//    }
//}


//class Recursion{
//    public static void main(String[] args) {
//        System.out.println(opPowerOf(2,10));
//    }
//    public static int opPowerOf(int x,int n){
//        if(n==0){
//            return 1;
//        }
//        int answer = opPowerOf(x,n/2)*opPowerOf(x,n/2);
//        if (n%2!=0){
//            return x*answer;
//        }
//        return answer;
//    }
//}

//public class Recursion {
//   public static void main(String[] args) {
//       int[] array = {1,2,3,4,5};
//       System.out.println(sum(array,4));
//   }
//   public static int sum(int[] array,int i){
//       if(i==0){
//           return array[i];
//       }
//    //   int sumOf = sum(array,i-1);
//       return array[i]+sum(array,i-1);
//   }
//}


// class Recursion{
//     public static void main(String[] args) {
//         String str = "Hello";
//        char[] arr = str.toCharArray();
//         for (int i = 0;i< arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


//BACKTRACKING
//public class Recursion {
//    public static void main(String[] args) {
//        String str = "abc";
//        boolean[] array = new boolean[str.length()];
//        sol(str,array,"");
//    }
//    public static void sol(String str,boolean[] visited,String ans){
//        if (ans.length()==str.length()){
//            System.out.println(ans);
//            return;
//        }
//        for (int i=0;i<str.length();i++){
//            if (!visited[i]){
//                visited[i]=true;
//                sol(str,visited,ans+str.charAt(i));
//                visited[i]=false; //this line is referred as the part of backtracking
//            }
//        }
//    }
//}

//public class Recursion {
//    public static void main(String[] args) {
//        int[][] arr = new int[4][4];
//        sol(arr,0,arr.length-1,0,arr.length-1,"");
//    }
//}
//    public static void sol(int[][] arr,int cr,int er,int cc,int ec,String ans){
//        if (cr==er&&cc==ec){
//            System.out.println(ans);
//            return;
//        }
//        if (cr<0||cc<0||cr>er||cc>ec){
//            return;
//        }
//        //up
//        sol(arr, cr-1, er, cc, ec, ans+"U ");
//        //down
//        sol(arr, cr+1, er, cc, ec, ans+"D ");
//        //right
//        sol(arr, cr, er, cc+1, ec, ans+"R ");
//        //left
//        sol(arr, cr, er, cc-1, ec, ans+"L ");
////        visited[cr][cc]=false;
//    }
//}

//public class Recursion {
//    public static void main(String[] args) {
//        int n= 10;
//        sum(1);
//    }
//    public static int sum(int n){
//        if (i==n){
//            return 1;
//        }
//        return n+sum(n+1);
//    }
//}
//public class Recursion {
//    public static void main(String[] args) {
//        int n = 1635;
//        int ans= String.valueOf(n).length();
//        System.out.println(ans);
//    }
//}

//public class Recursion {
//   public static void function(int n){
//        if(n==0){
//            return;
//        }
//        function(n-1);
//        System.out.println(n);
//        function(n-1);
//    }
//    public static void main(String[] args) {
//        function(3);
//    }
//}

//public class Recursion {
//    public static void main(String[] args) {
//        String palindrome = "abbcbba";
//       boolean ans= checkPalindrome(palindrome);
//        System.out.println(ans);
//    }
//    public static boolean checkPalindrome(String palindrome){
//        for(int i=0;i<palindrome.length();i++){
//            for (int j=palindrome.length()-1;j>=0;j--){
//                if(palindrome.charAt(i)!=palindrome.charAt(j)){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}


//CHECK IF PALINDROME OR NOT
public class Recursion {
    public static void main(String[] args) {
        String palindrome = "geeks";
        boolean ans = checkPalindrome(palindrome);
        System.out.println(ans);
    }

    public static boolean checkPalindrome(String palindrome) {
        for (int i = 0; i<palindrome.length()/2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
