package easy_800;

import java.util.Scanner;

public class Everybody_Likes_Good_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int min=0;
            for (int i=0;i<n-1;i++){
                if(a[i]%2==a[i+1]%2){
                    min++;
                }
            }
            System.out.println(min);
        }
    }
}
