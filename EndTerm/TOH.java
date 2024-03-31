package EndTerm;

import java.util.Scanner;


//public class TOH {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(answer(n,1,3,2));
//    }
//    static int answer(int n, int A, int B, int C){
//        int count = 0;
//        if (n==1){
//            System.out.println("move 1 from " + A +" to rod " + B );
//            return 1;
//        }
//        count+=answer(n-1,A,C,B);
//        System.out.println("move "+n+ " from "+ A + " to rod "+ B);
//        count++;
//        count+=answer(n-1,C,B,A);
//        return count;
//    }

public class TOH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(answer(n,1,3,2));
    }
    public static int answer(int n,int A,int B,int C){
        int count=0;
        if(n==1){
            System.out.println("move 1 from "+A+" to rod "+B);
            return 1;
        }
        count+=answer(n-1,A,C,B);
        System.out.println("move "+n+" from "+A+" to rod "+B);
        count++;
        count+=answer(n-1,C,B,A);
        return count;
    }
}
