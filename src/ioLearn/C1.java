package ioLearn;

import java.io.*;
import java.io.IOException;

public class C1 {

    public static void main(String[] args) throws IOException {
        char c ;
        int i;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        do{
            i = bufferedReader.read();
            c  = (char)i;
            System.out.println(c);
        }while (i!=-1);

    }

}
