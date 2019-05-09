package ioLearn;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C3 {
    //C:\Users\Administrator.000\Desktop
    public static void main(String[] args) throws IOException {
        int i;
        InputStream inputStream = new FileInputStream("C:\\Users\\Administrator.000\\Desktop\\1.txt");
        byte[] r =  new byte[2];
        do{
            i = inputStream.read(r);
            System.out.println(inputStream.available());
            String str = new String(r);
            System.out.println(str);
//            System.out.println(i);
        }while (i!= -1);
        inputStream.close();
    }
}
