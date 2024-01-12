package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Construct_a_Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a[]=new int[3];
            a[0]=sc.nextInt();
            a[1]=sc.nextInt();
            a[2]=sc.nextInt();
            Arrays.sort(a);
            if(a[0]+a[1]==a[2]) System.out.println("YES");
            else{
                if(a[0]==a[1]&&a[2]%2==0) System.out.println("YES");
                else if(a[1]==a[2]&&a[0]%2==0) System.out.println("YES");
                else System.out.println("NO");
            }

        }
    }
}
