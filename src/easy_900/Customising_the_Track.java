package easy_900;

import java.util.Scanner;

public class Customising_the_Track {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] a=new long[n];
            long sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
                sum+=a[i]%n;
            }
            sum=sum%n;
            System.out.println(sum*(n-sum));

        }
    }
}
