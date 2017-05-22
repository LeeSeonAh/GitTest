import java.util.ArrayList;
import java.util.Scanner;


public class BJ4344 {

	public static void main(String[] args) {

		   Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       sc.nextLine();
	       
	       for(int i=0; i<n; i++){
	    	   int num = sc.nextInt();
	    	   int sum = 0;
	    	   float avg = 0;
	    	   ArrayList<Integer> arr = new ArrayList<Integer>();
	    	   
	    	   for(int j=0; j<num; j++){
	    		   arr.add(sc.nextInt());
	    		   sum += arr.get(j);
	    	   }
	    	   avg = (float)sum/num;
	    	   
 		   int rst = 0;//평균 넘는 학생 수
	    	   for(int j=0; j<num; j++){
	    		   if(arr.get(j) > avg){
	    			   rst++;
	    		   }
	    	   }
	    	   System.out.println(String.format("%.3f", (float)rst/num * 100)+"%");
	       }
	}

}
/* 입력예
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91*/