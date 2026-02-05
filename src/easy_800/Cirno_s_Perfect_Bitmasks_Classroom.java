package easy_800;

import java.util.Scanner;

public class Cirno_s_Perfect_Bitmasks_Classroom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int x=sc.nextInt();
            if(x==1) {
                System.out.println(3);
                continue;
            }
            int ans=1;
            if((x&(x-1))==0){
                ans=x+1;
            }
            else{
                while((x&(ans))==0)ans<<=1;
            }
            System.out.println(ans);
        }
    }
}
