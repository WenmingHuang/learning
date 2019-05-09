package ioLearn;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C4 {
    public static void main(String[] args) throws IOException {

        OutputStream outputStream = new FileOutputStream("C:\\Users\\Administrator.000\\Desktop\\2.txt");

        OutputStreamWriter writer = new OutputStreamWriter(outputStream,"GBK");

        writer.append("你是头野兽！");
        writer.close();
        outputStream.close();

    }
}
