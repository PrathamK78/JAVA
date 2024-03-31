package EndTerm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//public class DataStream {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            maxHeap.add(sc.nextInt());
//           //System.out.print(maxHeap.peek()  +" ");
//            list.add(maxHeap.peek());
//        }
//        System.out.println(list);
//    }
//}

public class DataStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for (int i=0;i<n;i++){
            maxHeap.add(sc.nextInt());
        }
        for(int i : maxHeap){
            System.out.print(i+ " ");
        }
    }
}
