import java.util.ArrayList;
import java.util.Scanner;


public class BJ2490 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++){
			String str = sc.nextLine();
			String[] strArr = str.trim().split("\\s+");

			ArrayList<Integer> arrZero = new ArrayList<Integer>();
			ArrayList<Integer> arrOne = new ArrayList<Integer>();
			
			for(int j=0; j<strArr.length; j++){
				if(Integer.parseInt(strArr[j]) == 0){
					arrZero.add(Integer.parseInt(strArr[j]));
				}else{
					arrOne.add(Integer.parseInt(strArr[j]));
				}
			}
			int zeroSize = arrZero.size();
			int oneSize = arrOne.size();

			char output = 0;
			if(zeroSize == 1 && oneSize == 3){
				output = 'A';
			}else if(zeroSize == 2 && oneSize == 2){
				output = 'B';
			}else if(zeroSize == 3 && oneSize == 1){
				output = 'C';				
			}else if(zeroSize == 4 && oneSize == 0){
				output = 'D';
			}else if(zeroSize == 0 && oneSize == 4){
				output = 'E';
			}
//			System.out.println(arrZero.size()+" "+arrOne.size());
			System.out.println(String.valueOf(output));
			
		}
		
		sc.close();
	}

}
