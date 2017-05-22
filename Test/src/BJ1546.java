import java.util.ArrayList;
import java.util.Scanner;


public class BJ1546 {

	public static void main(String[] args) {

		   Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        float sum = 0;
	        float avg = 0;
	        sc.nextLine();
	        
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        int max = 0;
	        for(int i=0; i<n; i++){
	        	arr.add(sc.nextInt());
	        	
	        	if( max < arr.get(i) ){
	        		max = arr.get(i);
	        	}
	        }
	        
	        for(int i=0; i<n; i++){
	        	float newScore = (float)arr.get(i)/max * 100;

	        	sum += newScore;
	        }

	        avg = sum/n;
	        System.out.println(String.format("%.2f",avg)+"");
	        
	}

}
