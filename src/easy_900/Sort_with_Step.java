package easy_900;

import java.util.Scanner;

public class Sort_with_Step {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            int c=0;
            for(int i=0;i<n;i++){
                if(a[i]%k!=(i+1)%k)c++;
            }
            if(c>2) System.out.println(-1);
            else System.out.println(c/2);
        }

    }
}
