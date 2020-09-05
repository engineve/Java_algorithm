// Package java.lang;
// public class System{
//    public static PrintStream out; // System.out
//    public static InputStream in; // System.in
//    public static PrintStream err; // System.err
// }

import java.io.*;

public class input{
    
    public static void main(String[] args) throws IOException{
        char c=(char) System.in.read();
        System.out.println("1 : "+c);

        FileOutputStream data=new FileOutputStream("data.txt");
        data.write(1); // void write(byte[] b) byte 배열 형식 저장
        data.write(2);  // void write(int b) byte 형식 저장
        data.write(3);
        data.close();

        FileInputStream item=new FileInputStream("data.txt");
        int i;
        while((i=item.read())!=-1){
            System.out.println(i); // 1 2 3
        }
        item.close();
    }
}