package easy_800;

import java.util.Scanner;

public class Rudolph_and_Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            char win=' ';
            char b[][]=new char[3][3];
            for (int i=0;i<3;i++){
                String s=sc.next();
                for (int j=0;j<3;j++)b[i][j]=s.charAt(j);
            }
            for (int i=0;i<3;i++){
                if(b[i][0]!='.'){
                    if(b[i][0]==b[i][1]&&b[i][1]==b[i][2]){
                        win=b[i][0];break;
                    }
                }

                if(b[0][i]!='.'){
                    if(b[0][i]==b[1][i]&&b[1][i]==b[2][i]){
                        win=b[0][i];break;
                    }
                }
            }
            if(b[0][0]!='.' && b[0][0]==b[1][1] && b[1][1]==b[2][2])win=b[0][0];
            if(b[0][2]!='.' && b[0][2]==b[1][1] && b[1][1]==b[2][0])win=b[0][2];

            if(win==' ') System.out.println("DRAW");
            else System.out.println(win);
        }
    }
}
