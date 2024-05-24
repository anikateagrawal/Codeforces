package easy_1100;

import java.util.Scanner;

public class Yet_Another_Palindrome_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            boolean f=false;
            for (int i=0;i<n;i++){
                for (int j=i+2;j<n;j++){
                    if(a[i]==a[j]){
                        f=true;break;
                    }
                }
                if(f)break;
            }
            if(f) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
