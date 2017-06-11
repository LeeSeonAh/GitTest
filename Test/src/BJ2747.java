import java.util.Scanner;


public class BJ2747 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fibo(n)+"");
	}
	
	public static int fibo(int n){
		int result = 0;
		
		if(n < 2){
			result = n;
		}else{
			result = fibo(n-1) + fibo(n-2);
		}
		
		return result;
	}

}
