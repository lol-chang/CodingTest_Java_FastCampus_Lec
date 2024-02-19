package Part1.문자열;
import java.util.Scanner;

// [String Part - 1]
// [BOJ - 1919] 애너그램 만들기
// https://www.acmicpc.net/problem/1919

public class BOJ_1919_애너그램만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] countA = new int[26];
        int[] countB = new int[26];

        for(int i=0; i<a.length(); i++) {
            countA[a.charAt(i) - 'a']++;
        }
        for(int i=0; i<b.length(); i++) {
            countB[b.charAt(i) - 'a']++;
        }
        int res = 0;
        for(int i=0; i<26; i++) {
            int x = countA[i];
            int y = countB[i];
            if (x > y) {
                res += x-y;
            }
            else if (x < y) {
                res += y-x;
            }
        }
        System.out.println(res);
    }
}
