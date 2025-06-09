package questions.week4;

import java.util.Scanner;

public class Palindrome_Reorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'A']++;
        }

        int oddCount = 0;
        int oddIndex = -1;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
                oddIndex = i;
            }
        }

        if (oddCount > 1) {
            System.out.println("NO SOLUTION");
            return;
        }

        StringBuilder firstHalf = new StringBuilder();
        StringBuilder middle = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            int count = freq[i];
            if(i==oddIndex)continue;
            for (int j = 0; j < count / 2; j++) {
                firstHalf.append((char) (i + 'A'));
            }
        }

        if (oddIndex != -1) {
            for (int j = 0; j < freq[oddIndex]; j++) {
                middle.append((char) (oddIndex + 'A'));
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(firstHalf);
        result.append(middle);
        result.append(firstHalf.reverse());

        System.out.println(result.toString());
    }
}