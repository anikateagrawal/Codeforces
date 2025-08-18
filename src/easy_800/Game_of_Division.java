package easy_800;

import java.util.Scanner;

public class Game_of_Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int ans=-1;
            for (int i=0;i<n;i++){
                boolean flag=true;
                for (int j=0;j<n;j++){
                    if(i==j)continue;
                    if(Math.abs(a[i]-a[j])%k==0)flag=false;
                }
                if(flag){
                    ans=i;
                    break;
                }
            }
            if(ans==-1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                System.out.println(ans+1);
            }
        }
    }
}
