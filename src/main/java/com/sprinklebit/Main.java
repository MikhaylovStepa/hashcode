package com.sprinklebit;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("test");
        try {
            ReaderWriter.write("fff", "result");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
