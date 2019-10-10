import java.util.*;
import java.io.*;

public class Caesar {
    public static void main(String[] args){
        //        int shift = Integer.parseInt(args[0]);

        try {
            int n = 0;
            while(( n = System.in.read()) != -1){
                int output = n +  Integer.parseInt(args[0]);
                
                
                if(output < 255){
                    System.out.write((char)output);
                    System.out.flush();
                } else { 
                    output = n + (Integer.parseInt(args[0]) % 255);
                    System.out.write((char)output);
                    System.out.flush();
                }
            }
            
            System.out.close();
            
        }
        
        catch(IOException e){
            System.out.println("exception: " + e);
        }
        
    }

}
