package ioLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        do{
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("end"));
    }

}
