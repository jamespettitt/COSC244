import java.io.*;

public class Program1 {
   public static void main(String[] args){
        try {
            InputStream in = System.in;
            OutputStream out = System.out;

            int b = in.read();

            while(b != -1){
                out.write(b);
                b = in.read();
            }
        } catch (IOException e){
            System.out.println("Error: IOException");
        }
    }

}
