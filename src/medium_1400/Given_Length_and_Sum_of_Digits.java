package medium_1400;

import java.util.Arrays;
import java.util.Scanner;

public class Given_Length_and_Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int s=sc.nextInt();
        if(s==0){
            if(m==1) System.out.println(0+" "+0);
            else System.out.println(-1+" "+-1);
        }
        else if(9*m<s) System.out.println(-1+" "+-1);
        else{
            char sm[]=new char[m];
            Arrays.fill(sm,'0');
            sm[0]='1';
            int s2=s-1;
            for(int i=m-1;i>=0;i--){
                if(s2>=9){
                    sm[i]='9';
                    s2-=9;
                }
                else{
                    sm[i]=(char)(sm[i]+s2);
                    break;
                }
            }
            char lg[]=new char[m];
            Arrays.fill(lg,'0');
            for (int i=0;i<m;i++){
                if(s>=9){
                    lg[i]='9';
                    s-=9;
                }
                else {
                    lg[i]=(char)(s+'0');
                    break;
                }
            }
            System.out.println(new String(sm)+" "+new String(lg));
        }
    }
}
