package easy_1200;

import java.util.Scanner;

public class Before_an_Exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int sum=sc.nextInt();
        int min=0,max=0;
        int a[][]=new int[d][2];
        for (int i=0;i<d;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
            min+=a[i][0];
            max+=a[i][1];
        }
        if(sum<min||sum>max) System.out.println("NO");
        else {
            System.out.println("YES");
            sum-=min;
            for (int i=0;i<d;i++){
                int diff=a[i][1]-a[i][0];
                int md=Math.min(sum,diff);
                sum-=md;
                System.out.print(a[i][0]+md+" ");
            }
        }
    }
}
