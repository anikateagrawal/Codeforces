package easy_800;

import java.util.Scanner;

public class New_Year_Cake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(Math.max(cal(a,b),cal(b,a)));
        }
    }
    static int cal(int a,int b){
        int l=0;
        for (int i=1;;i*=2){
            if(l%2==0){
                a-=i;
            }
            else {
                b-=i;
            }
            if(a<0||b<0)break;
            l++;
        }
        return l;
    }
}
