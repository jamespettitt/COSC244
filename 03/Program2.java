import java.io.*;

public class Program2 {
    public static void main(String[] args){
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str;
            while((str = buf.readLine()) != null){
                System.out.println(new StringBuilder(str).reverse());
            }
    
        } catch(IOException e){
            System.out.println("Error: IOException");
        }
    }
}
