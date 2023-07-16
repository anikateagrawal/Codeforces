package easy_800;

import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int e=0,o=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(i%2==0&&a[i]%2!=0)e++;
                else if(i%2==1&&a[i]%2!=1)o++;
            }
            if(e==o) System.out.println(e);
            else System.out.println(-1);
        }
    }
}
