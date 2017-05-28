import java.util.ArrayList;
import java.util.Scanner;


public class BJ1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strInput = sc.nextLine();
		char[] charInput = strInput.toCharArray();
		int arr[] = new int[26];
		
		for(int i=0; i<charInput.length; i++){
			int code = charInput[i];

			if(code>=65 && code<=90){
				code = code-65;
			}else if(code>=97 && code<=122){//소문자 -> 대문자
				code = code-97;
			}
			arr[code]++;
		}
		
		int max = 0;
		int code = 0;
		String rst = "";
		for(int i=0; i<arr.length; i++){
//			System.out.println(arr[i]+"");
			if(max < arr[i]){
				max = arr[i];
				code = i;
			}
		}
		
		//가장 많이 사용된 알파벳의 수가 같으면 code는 -1
		for(int i=0; i<arr.length; i++){
			if(i != code && arr[i] == max){
				code = -1;
				break;
			}
		}
		
		
		if(code == -1){
			rst = "?";
			System.out.println(rst);
		}else{
			code = code+65;
			System.out.println(Character.toChars(code));
		}
		
		
		
	}



}
