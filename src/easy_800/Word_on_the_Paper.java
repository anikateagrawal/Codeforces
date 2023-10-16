package easy_800;

import java.util.Scanner;

public class Word_on_the_Paper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            char a[][]=new char[8][8];
            int c=-1,r=-1;
            for(int i=0;i<8;i++){
                String s=sc.next();
                for (int j=0;j<8;j++){
                    a[i][j]=s.charAt(j);
                    if(a[i][j]!='.'&&c==-1){
                        c=j;r=i;
                    }
                }
            }
            String word="";
            while(r<8&&a[r][c]!='.')word+=a[r++][c];
            System.out.println(word);
        }
    }
}
