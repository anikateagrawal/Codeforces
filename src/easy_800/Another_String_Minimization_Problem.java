package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Another_String_Minimization_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt()-1;
            char b[]=new char[m];
            Arrays.fill(b,'B');
            for (int i=0;i<n;i++){
                int min=Math.min(a[i],m-a[i]-1);
                int max=Math.max(a[i],m-a[i]-1);
                if(b[min]=='A')b[max]='A';
                else b[min]='A';
            }
            System.out.println(new String(b));
        }
    }
}
