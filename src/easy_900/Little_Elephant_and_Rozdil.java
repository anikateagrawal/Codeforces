package easy_900;

import java.util.Scanner;

public class Little_Elephant_and_Rozdil {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int small=Integer.MAX_VALUE;
        int smallPos=0;

        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            if(temp<small){
                small=temp;
                smallPos=i+1;
            }else if(temp==small){
                smallPos=0;
            }
        }

        System.out.println((smallPos==0)?"Still Rozdil":smallPos);

    }
}
