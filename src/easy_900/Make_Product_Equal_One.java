package easy_900;

import java.util.Scanner;

public class Make_Product_Equal_One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long c=0;int m=0;int z=0;
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a<0){
                c+=-1-a;
                m++;
            }
            else if(a>0)c+=a-1;
            else {
                c++;z++;
            }
        }
        if(m%2==1&&z==0)c+=2;
        System.out.println(c);
    }
}
