import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * 정수 저장 스택 구현 후, 입력으로 주어지는 명령 처리하는 프로그램 작성
 */
public class BJ10828_정하 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<String> stack = new Stack<>(); // 스택 선언

		int N = Integer.parseInt(br.readLine()); // 입력 할 명령의 수

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			switch (input) {
			case "push":
				String num = st.nextToken();
				stack.push(num); break;
			case "pop":
				if (stack.isEmpty()) bw.write(-1+"\n");
				else bw.write(stack.pop()+"\n"); break;
			case "size":
				bw.write(stack.size()+"\n"); break;
			case "empty":
				if (stack.isEmpty()) bw.write(1+"\n");
				else bw.write(0+"\n"); break;
			case "top":
				if (stack.isEmpty()) bw.write(-1+"\n");
				else bw.write(stack.peek()+"\n"); break;
				
			}// end switch
		} // end for

		br.close();
		bw.close();
	}
}
