package easy_800;

import java.util.Scanner;

public class Find_K_Distinct_Points_with_Fixed_Center {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int k=sc.nextInt();
            int d=k/2;
            for (int i=0;i<k;i++){
                if(k%2==0&&i==k/2){
                    k++;continue;
                }
                int x2=x+i-d;
                int y2=y+i-d;
                System.out.println(x2+" "+y2);
            }
        }
    }
}
