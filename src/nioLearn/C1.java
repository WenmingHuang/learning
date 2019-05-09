package nioLearn;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class C1 {

    public static void main(String[] args) throws IOException {

        RandomAccessFile randomAccessFile = new RandomAccessFile("C:\\Users\\Administrator.000\\Desktop\\1.txt","rw");
        FileChannel fileChannel  =randomAccessFile.getChannel();

    }
}
