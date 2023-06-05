package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Stripes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            char m[][]=new char[8][8];
            for(int i=0;i<8;i++){
                String s=sc.next();
                for(int j=0;j<8;j++){
                    m[i][j]=s.charAt(j);
                }
            }
            System.out.println(fun(m));
        }
    }
    static char fun(char m[][]){
        outer:
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(m[i][j]!='R')continue outer;
            }
            return 'R';
        }
        outer:
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(m[j][i]!='B')continue outer;
            }
            return 'B';
        }
        return ' ';
    }
}
