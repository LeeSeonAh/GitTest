import java.util.ArrayList;
import java.util.Scanner;

/**
 * 스택 심화1 - Stack 클래스 사용 
 * @author lsaa5
 *
 */
public class BJ9012_02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		
		sc.nextLine();

		for(int i=0; i<n; i++){
			VPSStack vpsStack = new VPSStack();
			String str = sc.nextLine();
			char[] charInput = str.toCharArray();
			String rst = "YES";
			
			for(int j=0; j<charInput.length; j++){
				if(charInput[j] == '(' ){
					vpsStack.push(charInput[j]);
				}else{
					if(vpsStack.empty() == 1){
						rst = "NO";
						break;
					}else{
						vpsStack.pop();
					}
				}
			}
			
			if(vpsStack.empty() == 0){
				rst = "No";
			}

			System.out.println(rst);
	
		}
	}

	
}

class VPSStack {
    public ArrayList<Integer> arr = new ArrayList<>();

    public void push(int x){
        arr.add(x);
    }

    public void pop(){
//        top();
        if(arr.size() > 0){
            arr.remove(arr.size()-1);
        }
    }

    public void size(){
        System.out.println(arr.size());
    }

    public int empty(){
        int result = arr.isEmpty() ? 1 : 0;
//        System.out.println(result);
        return result;
    }

    public void top(){
        if(arr.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(arr.get(arr.size()-1));
        }
    }

}

/*
입력 예
6
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(

*/