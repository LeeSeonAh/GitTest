import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * 스택 심화1
 * @author lsaa5
 *
 */
public class BJ9012 {
	static VPS mVps = new VPS();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		
		sc.nextLine();

		for(int i=0; i<n; i++){

			String str = sc.nextLine();
			mVps.checkVPS(str);
			
		/*	String str = sc.nextLine();
			Stack<Character> mStack = new Stack<Character>();
			
			char[] charInput = str.toCharArray();
			
			for(int j=0; j<charInput.length; j++){
				if( charInput[j] == '(' ){
					mStack.push(charInput[j]);
				}else{
					
				}
			}
	            */
		}
	}

	
}

class VPS{
	ArrayList<String> arrP = new ArrayList<String>();
	ArrayList<String> arrS = new ArrayList<String>();

	public void checkVPS(String str){
		
		int top = str.length()-1;
		while(top >= 0){
			if(str.substring(top, top+1).equals("(")){
				arrP.add(str.substring(top, top+1));
			}else{
				arrS.add(str.substring(top, top+1));
			}
			top--;
		}
		
		if(arrP.size() == arrS.size()){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		arrP.clear();
		arrS.clear();
		
	}
}
/*
입력 예
6
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(
*/