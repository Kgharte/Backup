import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadandWrite
{
    public static void main(String args[]) throws IOException {
       try {
           FileReader fr = new FileReader("Content.txt");
           BufferedReader br = new BufferedReader(fr);
           int len = 0;
           String str;
           String temp = " ";
           while ((str = br.readLine()) != null) {
               temp = str.toUpperCase();
               len = len + str.length();
           }
           System.out.println(len);
           System.out.println(temp);
           br.close();
       }catch(FileNotFoundException e)
       {
           System.out.println();
       }
    }
}
