package easy_800;

import java.util.Scanner;

public class Tatar_TV_Show {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            char a[]=s.toCharArray();
            for (int i=0;i<n-k;i++){
                if (a[i]=='1'){
                    a[i]='0';
                    a[i+k]=a[i+k]=='1'?'0':'1';
                }
            }
            s=new String(a);
            if (s.contains("1")) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
