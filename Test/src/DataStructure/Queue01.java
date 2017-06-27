package DataStructure;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ť BJ10845
 * @author lsaa5
 *
 */
public class Queue01 {

	public static void main(String[] args) {
		
		QueueClass mQueue = new QueueClass();

        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        
        if(n<1 && n>10000){
        	return;
        }
        
        sc.nextLine();

        String command = "";
        for(int i=0; i<n; i++){
            command = String.valueOf(sc.nextLine());
            command = command.trim();

            if(command.contains("push")){
                int num = Integer.parseInt(command.split(" ")[1]);
                mQueue.push(num);
            }else if(command.equals("pop")){
                mQueue.pop();
            }else if(command.equals("size")){
                mQueue.size();
            }else if(command.equals("empty")){
                mQueue.empty();
            }else if(command.equals("front")){
                mQueue.front();
            }else if(command.equals("back")){
                mQueue.back();
            }
        }


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
