import java.util.Scanner;

/**
 * 수 정렬하기1
 * 버블소트
 * @author lsaa5
 *
 */
public class BJ2750 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int tmp = 0;
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-1-i; j++){
				if(arr[j] > arr[j+1]){
					//swap
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}


}
