import java.util.Scanner;


public class BJ2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		StringBuilder strBuilder = new StringBuilder();
		
		for(int i=0; i<n; i++){
			int t = sc.nextInt();
			String s=sc.nextLine();
			s = s.trim();
			
			for(int sIdx=0; sIdx<s.length(); sIdx++){
				for(int j=0; j<t; j++){
					strBuilder.append(s.substring(sIdx, sIdx+1));	
				}
			}
			
			System.out.println(strBuilder.toString());
			strBuilder.setLength(0);
		}
	}

}
