package EndTerm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PalindromeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        list.add(n);
        while (n!=-1){
            n = sc.nextInt();
            if(n!=-1){
                list.add(n);
            }
        }
        boolean flag = true;
        int i = 0;
        int j = list.size()-1;
        while(i < j){
            if(list.get(i) != list.get(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(flag);

    }
}
