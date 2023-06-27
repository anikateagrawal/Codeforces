package easy_800;

import java.util.Scanner;

public class Spy_Detected {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int num=-1;
            if(a[0]==a[1])num=a[0];
            if(a[1]==a[2])num=a[1];
            if(a[0]==a[2])num=a[0];
            for(int i=0;i<n;i++){
                if(a[i]!=num) System.out.println(i+1);
            }
        }
    }
}
