import java.util.Scanner;

public class BJ10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputS = sc.nextLine();
		char[] arr = inputS.toCharArray();
		int rst[] = new int[26];
		int code = 97;//a 아스키 코드
		
		for(int i=0; i<rst.length; i++){
			rst[i] = -1;
		}
		
		
		for(int i=0; i<arr.length; i++){
			int idx = arr[i] - code;
			if(rst[idx]==-1){
				rst[idx] = i;
			}
		}
		
		for(int i=0; i<rst.length; i++){
			System.out.print(rst[i]+" ");
		}

	}

}
