package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Jellyfish_and_Undertale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                b+=Math.min(arr[i],a);
            }
            System.out.println(b-1);
        }
    }
}
