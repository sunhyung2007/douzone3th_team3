package baekjoon;

import java.util.Scanner;

public class 피보나치수수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0, b = 1, c = 0;
		for(int i = 0; i < N-1; i ++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(c);
	}
}
