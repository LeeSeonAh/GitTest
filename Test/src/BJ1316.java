import java.util.Scanner;


public class BJ1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		int cnt = 0;
		for(int i=0; i<n; i++){
			boolean arr[] = new boolean[26];
			String str = sc.nextLine();
			StringBuilder newStr = new StringBuilder();
			
			//1. 연속해서 나오는 문자는 하나로 묶기
			//2. 처음부터 배열에 insert
			char[] ch = str.toCharArray();
			for(int j=0; j<ch.length; j++){
				if(j != 0 && ch[j-1] == ch[j]){
					continue;
				}
				newStr.append(ch[j]);
			}
			
			int rst = 0;
			for(int j=0; j<newStr.length(); j++){
				int idx = newStr.charAt(j)-97;
				if(arr[idx] == false){
					arr[idx] = true;
				}else{
					rst = -1;
					break;
				}
			}
			if(rst != -1){
				cnt++;
			}
		}
		System.out.println(cnt+"");
		
	}

}
