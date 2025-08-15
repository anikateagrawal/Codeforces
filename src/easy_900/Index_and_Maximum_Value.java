package easy_900;

import java.util.Scanner;

public class Index_and_Maximum_Value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();

            for (int i=0;i<m;i++){
                char ch=sc.next().charAt(0);
                int l=sc.nextInt();
                int r=sc.nextInt();
                int v=ch=='+'?+1:-1;
                int max=Integer.MIN_VALUE;
                for (int j=0;j<n;j++){
                    if(a[j]>=l&&a[j]<=r){
                        a[j]+=v;
                    }
                    max=Math.max(max,a[j]);
                }
                System.out.print(max+" ");
            }
            System.out.println();
            
//            int max=0;
//            for (int i=0;i<n;i++){
//                max=Math.max(max,sc.nextInt());
//            }
//
//            for (int i=0;i<m;i++){
//                char ch=sc.next().charAt(0);
//                int l=sc.nextInt();
//                int r=sc.nextInt();
//                if(max>=l && max<=r){
//                    if(ch=='+'){
//                        max++;
//                    }
//                    else {
//                        max--;
//                    }
//                }
//                System.out.print(max+" ");
//            }
//            System.out.println();

        }
    }
}
