import java.util.Scanner;

//���ڿ� - ������ ����
public class BJ1152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		input = input.trim();
		String[] inputArr = input.split("\\s+");
		
		if(input.isEmpty()){
			System.out.println(0+"");
		}else{
			System.out.println(inputArr.length+"");
		}
		
		sc.close();
	}

}
