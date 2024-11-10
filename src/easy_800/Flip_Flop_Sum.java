package easy_800;

import java.util.Scanner;

public class Flip_Flop_Sum {
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
            boolean two=false;
            boolean negative=false;
            for (int i=0;i<n-1;i++){
                if(a[i]==a[i+1]){
                    if(a[i]==-1){
                        two=true;
                        break;
                    }
                }
                else negative=true;
            }
            if(two) System.out.println(s+4);
            else if(negative) System.out.println(s);
            else System.out.println(s-4);
        }
    }
}
