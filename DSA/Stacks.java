package DSA;

import java.util.*;

//public class Stacks {
//    static class Stack{
//        static ArrayList<Integer> list = new ArrayList<>();
//        public static boolean isEmpty(){
//            return list.size()==0;
//        }
//        //push
//        public static void push(int data){
//            list.add(data);
//        }
//
//        //pop
//        public static int pop(){
//            if(isEmpty()){
//                return -1;
//            }
//            int top = list.get(list.size()-1);
//            list.remove(list.size()-1);
//            return top;
//        }
//
//        public static int peek(){
//            return list.get(list.size()-1);
//        }
//    }
//    public static void main(String[] args) {
////        Stack s = new Stack();
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        while(!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}

public class Stacks {

    public static void main(String[] args) {
        int[] stockPrices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateStockSpan(stockPrices);

        // Print the spans
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }

    public static int[] calculateStockSpan(int[] stockPrices) {
        int n = stockPrices.length;
        int[] spans = new int[n];

        for (int i = 0; i < n; i++) {
            // Initialize the span for the current day
            spans[i] = 1;

            // Update the span for the current day based on previous days
            for (int j = i - 1; j >= 0 && stockPrices[i] >= stockPrices[j]; j -= spans[j]) {
                spans[i] += spans[j];
            }
        }

        return spans;
    }
}
