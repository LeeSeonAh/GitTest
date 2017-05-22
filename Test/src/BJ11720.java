import java.util.Scanner;

public class BJ11720 {

	public static void main(String[] args) {

		   Scanner sc = new Scanner(System.in);
	        int n = 0, sum = 0;
			String strInput = "";
	        n = sc.nextInt();
	        sc.nextLine();
	        
	        strInput = sc.nextLine();
	        
	        if(n != strInput.length()){
	        	return;
	        }
	        
	        for(int i=0; i<strInput.length(); i++){
	        	sum += Integer.parseInt(strInput.substring(i,i+1));
			}
	        
		    System.out.println(sum+"");
	        
	}

}
