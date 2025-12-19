package easy_800;

import java.util.Scanner;

public class Notelock {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int tt=s.nextInt();
        while(tt-->0){
            int n=s.nextInt();
            int k=s.nextInt();
            String str=s.next();
            int sum=0;int last=-k;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='1'){
                    if(i-last+1>k)sum++;last=i;
                }
            }
            System.out.println(sum);
        }
    }
}
