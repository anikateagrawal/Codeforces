package easy_1000;

import java.util.Scanner;

public class Lady_Bug {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            char a[]=sc.next().toCharArray();
            char b[]=sc.next().toCharArray();
            int z1=0,z2=0;
            for (int i=0;i<n;i++){

                if (i%2==0){
                    if(a[i]=='0')z1++;
                    if(b[i]=='0')z2++;
                }
                else {
                    if(a[i]=='0')z2++;
                    if(b[i]=='0')z1++;
                }
            }
            if (z1>=(n+1)/2 && z2>=n/2) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
