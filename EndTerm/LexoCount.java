package EndTerm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LexoCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> str = new ArrayList<>();

        for (int i=0;i<=n;i++){
            String val = String.valueOf(i);
            str.add(val);
        }
        Collections.sort(str);
        System.out.print(str+" ");
    }
}
