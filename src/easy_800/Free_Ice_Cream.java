package easy_800;

import java.util.Scanner;

public class Free_Ice_Cream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long x=sc.nextInt();
        int d=0;
        for(int i=0;i<n;i++){
            char ch=sc.next().charAt(0);
            int c=sc.nextInt();
            if(ch=='+')x+=c;
            else{
                if(c>x){
                    d++;
                    continue;
                }
                x-=c;
            }
        }
        System.out.println(x+" "+d);
    }
}
