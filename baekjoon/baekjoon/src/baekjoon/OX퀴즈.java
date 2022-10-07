package baekjoon;

import java.util.Scanner;

public class OXÄûÁî {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String a = "";
		int count;
		int result;
		for(int i = 0; i < N; i ++) {
			a = sc.next();
			result = 0;
			count = 0;
			for(int j = 0; j < a.length(); j ++) {
				if (a.charAt(j) == 'X') {
					count = 0;
				}
				else count ++;
				result += count;
			}
			System.out.println(result);
		}
		
	}
}
