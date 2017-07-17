package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 후위표기식 ing
 * @author lsaa5
 *
 */
public class Postfix_BJ1918 {
	public static void main(String[] args) {
        StackClass2 mStack = new StackClass2();

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        
        for(int i=0; i<arr.length; i++){
        	char chInput = arr[i];
        	
        	if(chInput == '+' || chInput == '-' || chInput == '*' || chInput == '/'){
        		mStack.push(chInput);
        	}else if(chInput == '('){
        		
        	}else if(chInput == ')'){
                mStack.pop();
        		
        	}else{
                System.out.print(chInput);
        		
        	}
        	

        }
        
        while(mStack.empty() == 0){
            mStack.pop();
        }

        sc.close();
       
	}
}

class StackClass2 {
    public ArrayList<Character> arr = new ArrayList<>();

    public void push(char x){
        arr.add(x);
    }

    public void pop(){
        top();
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
            System.out.print(-1);
        }else{
            System.out.print(arr.get(arr.size()-1));
        }
    }

}


