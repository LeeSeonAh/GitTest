import java.util.ArrayList;
import java.util.Scanner;


public class Test{
    public static void main(String[] args){
        StackClass mStack = new StackClass();

        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        
        if(n<1 && n>10000){
        	return;
        }

        String command = "";
        for(int i=0; i<n; i++){
            Scanner sc2 = new Scanner(System.in);
            command = String.valueOf(sc2.nextLine());
            command = command.trim();
            
            

            if(command.contains("push")){
                int num = Integer.parseInt(command.split(" ")[1]);
                mStack.push(num);
            }else if(command.equals("pop")){
                mStack.pop();
            }else if(command.equals("size")){
                mStack.size();
            }else if(command.equals("empty")){
                mStack.empty();
            }else if(command.equals("top")){
                mStack.top();
            }
        }


    }

}

class StackClass {
    public ArrayList<Integer> arr = new ArrayList<>();

    public void push(int x){
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
        System.out.println(result);
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