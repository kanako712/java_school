import java.io.*;
public class Main {
    public static void main (String[] args)throws Exception{
        FileWriter fw = new FileWriter("deta.txt");
        fw.write('そ');
        fw.write('れ');
        fw.write('で');
        fw.write('は');
        fw.close();
    }
    
}
