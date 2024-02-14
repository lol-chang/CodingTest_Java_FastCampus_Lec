package Part1.문자열;

// [String Part - 1]
// [BOJ - 2744] 대소문자 바꾸기
// https://www.acmicpc.net/problem/2744

import java.util.Scanner;

public class BOJ_2744_대소문자바꾸기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i =0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                // int dist =  str.charAt(i) - 'A';
                // int lower_ascii = 'a' + dist;
                System.out.print((char) ('a' + str.charAt(i) - 'A'));
            }
            else {
                System.out.print((char) ('A' + str.charAt(i) - 'a'));
            }
        }
    }
}