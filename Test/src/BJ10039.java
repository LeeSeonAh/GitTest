import java.util.Scanner;


public class BJ10039 {

	public static void main(String[] args) {
		int scores[] = new int[5];
		int sum = 0, avg = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();

			if (scores[i] < 40) {
				scores[i] = 40;
			}
			
			sum += scores[i];
		}
		avg = sum / scores.length; 
		System.out.println(avg+"");
	}

}
