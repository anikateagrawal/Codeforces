package questions.leetcode;

import java.util.Scanner;

public class Water_and_Jug_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println(canMeasureWater(x,y,z));
    }
    public static boolean canMeasureWater(int x, int y, int z) {
        //limit brought by the statement that water is finallly in one or both buckets
        if(x + y < z) return false;
        //get GCD, then we can use the property of Bézout's identity
        return z%GCD(x, y) == 0;
    }

    public static int GCD(int a, int b){
        if(b==0)return a;
        return GCD(b,a%b);
    }
}
