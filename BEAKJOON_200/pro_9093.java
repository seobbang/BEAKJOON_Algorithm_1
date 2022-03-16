package BEAKJOON_200;
import java.util.*;

public class pro_9093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(s.nextLine()); //nextLine���� �޾���� ���� ���ͱ��� ó�� ����
		Stack stack = new Stack();
		
		for(int i=0; i<T; i++) {
			String line = s.nextLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			int count = st.countTokens();
			
			for(int j=0 ; j<count; j++) { //���⿡ st.countTokens()������� ������ �ٱ� ������ ���� X
				String str = st.nextToken();
				
				for(int k=0; k<str.length() ; k++) {
					stack.push(str.charAt(k));
				}
				for(int k=0; k<str.length() ; k++) {
					sb.append(stack.pop());
				}
				sb.append(" ");
				
			}
			System.out.print(sb);
			sb.setLength(0);
		}
		
		s.close();
	}

}