package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Everyone_Loves_to_Sleep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int h=sc.nextInt()*60+sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt()*60+sc.nextInt();
            }
            Arrays.sort(a);
            int ans=0;
            int i;
            for(i=0;i<n;i++){
                if(a[i]>=h){
                    ans=a[i]-h;
                    break;
                }
            }
            if(i==n){
                ans=1440+a[0]-h;
            }
            System.out.println(ans/60+" "+ans%60);
        }
    }
}
