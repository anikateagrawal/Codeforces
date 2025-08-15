package easy_1000;

import java.util.Scanner;

public class Crafting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int b[]=new int[n];
            for (int i=0;i<n;i++)b[i]=sc.nextInt();

            boolean flag=true;
            for (int i=0;i<n;i++){
                if(b[i]>a[i]){
                    int r=b[i]-a[i];
                    for (int j=0;j<n;j++){
                        if(j==i)continue;
                        if(a[j] < b[j]+r){
                            flag=false;
                            break;
                        }
                    }
                    break;
                }
            }

            if(flag) System.out.println("YES");
            else System.out.println("NO");
//            int n=sc.nextInt();
//            int a[]=new int[n];
//            for (int i=0;i<n;i++)a[i]=sc.nextInt();
//            int b[]=new int[n];
//            for (int i=0;i<n;i++)b[i]=sc.nextInt();
//            boolean flag=true;
//            for (int i=0;i<n;i++){
//                if(b[i]>a[i]){
//                    int r=b[i]-a[i];
//                    for (int j=0;j<n;j++){
//                        if(i==j)continue;
//                        if(b[j]+r>a[j]){
//                            flag=false;
//                            break;
//                        }
//                    }
//                    break;
//                }
//            }
//            if (flag) System.out.println("YES");
//            else System.out.println("NO");
        }
    }
}
