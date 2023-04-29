package easy_900;

import java.util.Scanner;

public class MKnez_ConstructiveForces_Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==3){
                System.out.println("NO");
                continue;
            }
            if(n%2==0){
                System.out.println("YES");
                for (int i = 0; i < n; i++) {
                    if(i%2==0){
                        System.out.print(1+" ");
                    }
                    else System.out.print(-1+" ");
                }
                System.out.println();
            }
            else {
                int f=n/2;
                System.out.println("YES");
                for (int i = 0; i < n; i++) {
                    if(i%2==0){
                        System.out.print((f-1)+" ");
                    }
                    else System.out.print(-1*(f)+" ");
                }
                System.out.println();
            }

        }
    }
}
