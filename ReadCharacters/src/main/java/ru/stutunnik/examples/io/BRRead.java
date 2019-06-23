package ru.stutunnik.examples.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {


    public static void main(String[] args) throws IOException {

        //reads characters by one, starts when enter is  pressed
        readExample();

        //reads lines of text
        readLineExample();
    }


    private static void readExample() throws IOException {

        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter characters, 'q' to quit");
        do {
            int val = br.read();
            c = (char) val;
            //System.out.println(val);
            System.out.println(c);
        } while (c != 'q');
    }

    private static void readLineExample() throws IOException {

        String str;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter lines of text");
        System.out.println("Enter 'stop' to quit");
        do {
            str = bf.readLine();
            System.out.println(str);
        } while (!"stop".equals(str));

    }
}
