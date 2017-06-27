import java.util.Scanner;

/**
 * 소수 찾기
 * 
 * @author lsaa5
 *
 */
public class BJ1978 {
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, cnt = 0;
		n = sc.nextInt();
		sc.nextLine();
		int[] num = new int[n];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (isPrime(num[i]))
				cnt++;

		}

		System.out.println(cnt + "");

		sc.close();
	}
}