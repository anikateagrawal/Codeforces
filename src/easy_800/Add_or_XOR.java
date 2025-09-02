package easy_800;

import java.util.Scanner;

public class Add_or_XOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            long ans=-1;
            if(a<b){
                ans=0;
                for(int i=a; i<b; i++){
                    if(i%2==0 && y<=x)ans+=y;
                    else ans+=x;
                }

            }
            else if(a>b && a-b==1 && a%2!=0)ans=y;
            else if(a==b) ans=0;
            System.out.println(ans);
        }
        
    }
}
