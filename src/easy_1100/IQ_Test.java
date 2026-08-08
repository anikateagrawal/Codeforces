package easy_1100;

import java.util.Scanner;

public class IQ_Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char b[][]=new char[4][4];
        for(int i=0;i<4;i++){
            String s=sc.next();
            for(int j=0;j<4;j++){
                b[i][j]=s.charAt(j);
            }
        }

        boolean fl=false;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                int d=0,h=0;
                int f=b[i][j]=='.'?d++:h++;
                f=b[i+1][j]=='.'?d++:h++;
                f=b[i][j+1]=='.'?d++:h++;
                f=b[i+1][j+1]=='.'?d++:h++;

                if (d>=3||h>=3){
                    fl=true;
                }
            }
        }
        System.out.println(fl?"YES":"NO");
    }
}
