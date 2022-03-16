package BEAKJOON_200;
import java.util.Scanner;

class myStack {
	int stack [];
	int max = -1;
	
	public myStack(int n) {
		stack = new int [n];
	}
	
	public void push(int n) {
		stack[++max] = n;
	}
	
	public int pop() {
		if(max > -1) {
			int popInt = stack[max];
			stack[max--] = 0;
			return popInt;
		}else {
			return -1;
		}
		
	}
	
	public int size() {
		return max+1;
	}
	
	public int empty() {
		if(max == -1) {
			return 1;
		}else
			return 0;
	}
	
	public int top() {
		if(max > -1) {
			return stack[max];
		}
		else {
			return -1;
		}
	}
}

public class pro_10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = s.nextInt();
		myStack stack = new myStack(N);
		
		for(int i=0 ; i<N; i++) {
			String str = s.next();
			
			if(str.equals("push")) {
				int n = s.nextInt();
				stack.push(n);
			}
			else if(str.equals("pop")) {
				sb.append(stack.pop()).append("\n");
			}
			else if(str.equals("size")) {
				sb.append(stack.size()).append("\n");
			}
			else if(str.equals("empty")) {
				sb.append(stack.empty()).append("\n");
			}
			else if(str.equals("top")) {
				sb.append(stack.top()).append("\n");
			}
		}
		System.out.println(sb);
		s.close();
	}

}
