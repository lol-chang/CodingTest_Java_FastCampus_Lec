package Part1.문자열;

// [String Part - 1]
// [BOJ - 1157] 단어 공부
// https://www.acmicpc.net/problem/1157

import java.util.Scanner;

public class BOJ_1157_단어공부 {

    public static int[] getAlphaCount(String str) {
        int[] count = new int[26];
        for(int i=0; i<str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int[] count = getAlphaCount(str);

        char res = '?';
        int maxCount = -1;
        for(int i=0; i<26; i++) {
            if (maxCount < count[i]) {
                maxCount = count[i];
                res = (char) (i + 'A');
            }
            else if (maxCount == count[i]) {
                res = '?';
            }
        }
        System.out.println(res);
    }
}
