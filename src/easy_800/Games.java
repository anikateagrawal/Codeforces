package easy_800;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[][]=new int[t][2];
        for(int i=0;i<t;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        int c=0;
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if(j==i)continue;
                if(a[i][0]==a[j][1])c++;
            }
        }
        System.out.println(c);
    }
}
