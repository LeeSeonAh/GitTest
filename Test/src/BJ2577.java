import java.util.Scanner;


public class BJ2577 {

	public static void main(String[] args) {

		int a=0, b=0, c=0, rst=0;
		String strRst = "";
		int cnt[] = new int[10];
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		rst = a * b * c;
		strRst = String.valueOf(rst);
		
		for(int i=0; i<strRst.length(); i++){
			cnt[Integer.parseInt(strRst.substring(i,i+1))]++;
		}
		
		for(int i=0; i<cnt.length; i++){
			System.out.println(cnt[i]);
		}
		
	}

}
