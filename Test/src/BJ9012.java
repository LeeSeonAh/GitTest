import java.util.ArrayList;
import java.util.Scanner;


public class BJ9012 {
	static VPS mVps = new VPS();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			 Scanner scan = new Scanner(System.in);
			 mVps.checkVPS(scan.nextLine());
	            
		}
	}

	
}

class VPS{
	ArrayList<String> arrP = new ArrayList<String>();
	ArrayList<String> arrS = new ArrayList<String>();

	public void checkVPS(String str){
		int top = str.length()-1;
		while(top >= 0){
			if(str.substring(top, top+1).equals("(")){
				arrP.add(str.substring(top, top+1));
			}else{
				arrS.add(str.substring(top, top+1));
			}
			top--;
		}
		
		if(arrP.size() == arrS.size()){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		arrP.clear();
		arrS.clear();
		
	}
}
