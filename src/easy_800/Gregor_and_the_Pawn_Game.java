package easy_800;

import java.util.Scanner;

public class Gregor_and_the_Pawn_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int count=0;
            int n=sc.nextInt();
            String enemy=sc.next(),gregor=sc.next();
            char[]enemyArr=enemy.toCharArray();
            for (int i = 0; i < n; i++) {
                if(gregor.charAt(i)=='1'){
                    if(i>0 && enemyArr[i-1]=='1'){
                        count++;
                        enemyArr[i-1]='0';
                    }
                    else if(enemyArr[i]=='0')count++;
                    else if(i<n-1 && enemyArr[i+1]=='1'){
                        count++;
                        enemyArr[i+1]='0';
                    }
                }
            }
            System.out.println(count);
        }
    }
}
