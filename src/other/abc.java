package other;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x[]=new int[n];
            for (int i=1;i<n;i++){
                x[i]=sc.nextInt();
            }
            int a[]=new int[n];
            a[0]=1000;
            for (int i=1;i<n;i++){
                a[i]=a[i-1]+x[i];
            }
            for (int i=0;i<n;i++) System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}