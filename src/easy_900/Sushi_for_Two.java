package easy_900;

import java.util.Scanner;

public class Sushi_for_Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        int t=0,e=0,p=-1;
        int ans=0;
        for (int i=0;i<n;i++){
            if (a[i]==p){
                if (a[i]==1)t++;
                else e++;
            }
            else {
                if (a[i]==1)t=1;
                else e=1;
            }
            p=a[i];
            ans=Math.max(ans,Math.min(t,e)*2);
        }
        System.out.println(ans);
    }
}
