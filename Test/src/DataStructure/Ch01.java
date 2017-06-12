package DataStructure;

import java.util.Scanner;

/**
 * 자료구조 1장 factorial(재귀함수)
 * @author lsaa5
 *
 */
public class Ch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
		
	}
	
	public static int factorial(int n){
		if(n == 1){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}

}
