
package fileutility;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, Exception {

   byte[] a=  FileUtility.NIOreadBytes("adr.png");
     
     FileUtility.NIOwriteBytes(a,"new file adr.jpg");
 }
    }
    

