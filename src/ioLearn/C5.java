package ioLearn;

import java.io.File;
import java.io.IOException;

public class C5 {
    public static void main(String[] args) throws IOException {
        String dirName = "F:/test";
        File file = new File(dirName);
        file.mkdirs();
    }
}
