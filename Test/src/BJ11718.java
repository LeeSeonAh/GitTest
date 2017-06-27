import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 입력받은 그대로 출력 
 * @author lsaa5
 *
 */

public class BJ11718{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";//br.readLine();
        
        while( (s = br.readLine()) != null){
            System.out.println(s);
        }
    }
} 
