package easy_800;

import java.util.Scanner;

public class Playing_with_Dice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int aw=0,bw=0,d=0;
        for (int i=1;i<=6;i++){
            int da=Math.abs(a-i);
            int db=Math.abs(b-i);
            if(da>db)bw++;
            else if(db>da)aw++;
            else d++;
        }
        System.out.println(aw+" "+d+" "+bw);
    }
}
