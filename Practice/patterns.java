package Practice;
import java.util.*;

//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int rows = sc.nextInt();
//
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= rows; k++) {
//                if (i == 1 || i == rows || k == 1 || k == rows) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        sc.close();
//    }
//
//}

//FIND THE PRIME FACTORS OF A NUMBER
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactors(n);
    }
    public static int isPrime(int n){
        for (int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void primeFactors(int n){
        for (int i=2;i<=n;i++){
            if (isPrime(i)==1){
                int x=n;
                while (x%i==0){
                    System.out.print(i+" ");
                    x/=i;
                }
            }
        }
    }
}

// Question
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        System.out.println(getPrimes(N));
//    }
//    public static ArrayList<Integer> getPrimes(int N) {
//        ArrayList<Integer> primes = new ArrayList<>();
//        for (int num = 2; num <= N; num++) {
//            if (isPrime(num)) {
//                primes.add(num);
//            }
//        }
//        return primes;
//    }
//
//    public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n) ; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}