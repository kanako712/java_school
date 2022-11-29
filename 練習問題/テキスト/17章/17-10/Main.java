import java.io.*;

public class Main {
    public static void main(String[] args){
        //try-catch文を抜けた際に自動的にclise()が呼び出される
        try(FileWriter fw = new FileWriter("data.txt");){
            fw.write("hello!");
        }catch(Exception e){
            System.out.println("何らかの例外が発生しました");

        }
    }
}
