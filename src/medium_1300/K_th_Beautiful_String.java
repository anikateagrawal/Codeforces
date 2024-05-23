package medium_1300;

import java.util.Arrays;
import java.util.Scanner;

public class K_th_Beautiful_String
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextInt();
            long k=sc.nextInt()-1;
            long i=1;
            for (;i<n;i++){
                if(i*(i+1)/2>k)break;
            }
            i--;
//            System.out.println(i);
            k-=i*(i+1)/2;
            char s[]=new char[(int)n];
            Arrays.fill(s,'a');
            s[(int)(n-i-2)]='b';
            s[(int)(n-k-1)]='b';
            System.out.println(String.valueOf(s));
        }
    }
}
