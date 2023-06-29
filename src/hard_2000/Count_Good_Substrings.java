package hard_2000;

import java.util.Scanner;

public class Count_Good_Substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long a[][]=new long[2][2];
        long odd=0,even=0;
        for (int i = 1; i <= s.length(); i++) {
            odd++;
            if(i%2!=0){
                odd+=a[s.charAt(i-1)-'a'][0]++;
                even+=a[s.charAt(i-1)-'a'][1];
            }
            else{
                odd+=a[s.charAt(i-1)-'a'][1]++;
                even+=a[s.charAt(i-1)-'a'][0];
            }
        }
        System.out.println(even+" "+odd);
    }
}
