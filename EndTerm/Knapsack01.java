package EndTerm;

import java.util.Scanner;

public class Knapsack01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();//row
        int col = 2; //col

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxCap = sc.nextInt();

        int ans = solve2(arr,0,0,maxCap);//approach 2
        System.out.println(ans);
    }
//    static int solve2(int[][] arr,int i,int cap,int maxCap){
//        if(i == arr.length){
//            return 0;
//        }
//
//        int include = 0;
//        if(cap + arr[i][0] <= maxCap){
//            include = arr[i][1] + solve2(arr,i+1,cap+arr[i][0],maxCap);
//        }
//        int exclude = solve2(arr,i+1,cap,maxCap);
//
//        return Math.max(include,exclude);
//
//    }
    public static int solve2(int[][] arr,int index,int cap,int maxCap){
        if(index==arr.length){
            return 0;
        }
        int include = 0;
        if(cap+arr[index][0]<=maxCap){
            include = solve2(arr,index+1,arr[index][0]+cap,maxCap);
        }
        int exclude = solve2(arr,index+1,cap,maxCap);

        return Math.max(include,exclude);
    }
}
