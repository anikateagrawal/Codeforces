package easy_800;

import java.util.Scanner;

public class Make_Equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int s=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                s+=a[i];
            }
            s=s/n;
            int p=0;
            boolean f=true;
            for(int i=0;i<n;i++){
                if(a[i]+p<s){
                    f=false;
                    break;
                }
                p=a[i]+p-s;
            }
            if(f) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
