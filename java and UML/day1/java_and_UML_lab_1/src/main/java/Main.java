
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;


/**
 *
 * @author Hossam osman 
 * reading data from console until user writes stop
 * 
 * reading data from console until user writes stop
 */
public class Main{
    public static void main(String[] args) throws IOException {
        InputStreamReader stream =new InputStreamReader(System.in);
        BufferedReader buffer =new BufferedReader(stream);
        System.out.println("Enter data :");
        
        FileWriter writeInFile=new FileWriter("data.txt");
       
        String s=null;
        
        do{
        s=buffer.readLine();
        writeInFile.write(s+"\n");
        
        
        
        
        }while(!s.equals("stop"));
        writeInFile.close();
        
    }
    
    
    
}
