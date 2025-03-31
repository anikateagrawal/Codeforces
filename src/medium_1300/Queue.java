package medium_1300;

import java.util.Arrays;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int ans=1;int w=a[0];
        for (int i=1;i<n;i++){
            if(w>a[i]){
                continue;
            }
            ans++;
            w+=a[i];
        }
        System.out.println(ans);
    }
}
