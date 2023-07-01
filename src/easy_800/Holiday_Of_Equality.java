package easy_800;

import java.util.Scanner;

public class Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            max=Math.max(max,a[i]);
        }
        int c=0;
        for(int i:a){
            c+=max-i;
        }
        System.out.println(c);
    }
}
