import java.util.Scanner;


public class BJ8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++){
			String str = sc.nextLine();
			char[] arr = str.toCharArray();

			int cnt=0, sum=0;
			for(int j=0; j<arr.length; j++){
				if(arr[j] == 'O'){
					cnt++;
				}else{
					cnt = 0;
				}
				sum += 1*cnt;
			}
			System.out.println(sum+"");
			//1*1 + 1*2 + 0 + 0 + 1*1+ 0 + 0 + 1*1 + 1*2 + 1*3
		}
	}

}
