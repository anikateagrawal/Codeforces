package easy_800;

import java.util.Scanner;

public class Greg_s_Workout {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[3];
        for(int i=0;i<n;i++){
            a[i%3]+=sc.nextInt();
        }
        int max=Math.max(a[0],Math.max(a[1],a[2]));
        if(a[0]==max) System.out.println("chest");
        else if(a[1]==max) System.out.println("biceps");
        else System.out.println("back");
    }
}
