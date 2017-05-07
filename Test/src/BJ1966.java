import java.util.ArrayList;
import java.util.Scanner;

/** 
 * ≈• Ω…»≠1
 * @author lsaa5
 *
 */
public class BJ1966 {

	public static void main(String[] args) {
		QueueClass mQueue = new QueueClass();

        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        sc.nextLine();
	}

}

class QueueClass {
    public ArrayList<Integer> arr = new ArrayList<>();

    public void push(int x){
        arr.add(x);
    }

    public void pop(){
        front();
        if(arr.size() > 0){
        	arr.remove(0);
        }
    }

    public void size(){
        System.out.println(arr.size());
    }

    public int empty(){
        int result = arr.isEmpty() ? 1 : 0;
        System.out.println(result);
        return result;
    }
    
    public void front(){
    	if(arr.isEmpty()){
    		System.out.println(-1);
    	}else{
    		System.out.println(arr.get(0));
    	}
    }

    public void back(){
        if(arr.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(arr.get(arr.size()-1));
        }
    }

}