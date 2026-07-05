package easy_1100;

import java.util.Scanner;

public class Good_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int ans=0;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            boolean fl=true;
            for (int d=0;d<=k;d++){
                if (!(""+a[i]).contains(""+d)){
                    fl=false;
                    break;
                }
            }
            if (fl)ans++;
        }
        System.out.println(ans);
    }
}
