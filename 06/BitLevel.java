import java.util.*;
import java.io.*;

public class BitLevel {
    public static void main(String[] args){
        String inFile = args[0];
        String outFile = args[1];
        
        System.out.println("Enter key: ");
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();

        try{
            InputStream in = new FileInputStream(inFile);
            OutputStream out = new FileOutputStream(outFile);

            int n = 0;
            int bits = in.read();

            while(bits != -1){
                
                if( n >= key.length()){
                    n = 0;
                }
                
                out.write(bits ^ key.charAt(n));
                out.flush();
                bits = in.read();
                n++;
            }
        }
        
        catch(IOException e){
            System.out.println("exception: " + e);
        }
        
    }

}
