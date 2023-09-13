package easy_800;

import java.util.Scanner;

public class Most_Unstable_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int ans=0;
            if(n==2)ans=m;
            else if(n>2)ans=2*m;
            System.out.println(ans);
        }
    }
}
