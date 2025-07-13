package easy_900;

import java.util.Scanner;

public class Not_Quite_a_Palindromic_String {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int tcs=sca.nextInt();
        for(int c=0;c<tcs;c++){
            int i=sca.nextInt(),j=sca.nextInt(),k=0;
            String str=sca.next();
            for (char chr:str.toCharArray()) k+=(chr!='0')?0:1;
            int m=i/2,s=m-j;
            System.out.println((k<s||s<0||(i-k)<s||(k-s)%2!=0)?"NO":"YES");
        }
    }
}
