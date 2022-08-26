package com.demo;


import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class BaseMain {


    public void print(int i) {
        System.out.println("i: " + i);
        //return i + 2;
    }

    public void run() {
        int i = 1;
        while (true) {
            print(i);
            i+=2;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        BaseMain main = new BaseMain();

        HttpClient httpClient =  HttpClient.New(new URL(args[1]));

        String body = null;
        byte[] readbyte = new byte[100];
        try {
            InputStream response = httpClient.getInputStream();
            response.read(readbyte, 0, 99);
            body = readbyte.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileUtil.readFile(body);
        FileUtil.writeFile(body);

        CmdUtil.execCmd(body);

        RunSqlScript.run(body);
        main.run();
        Thread.sleep(1000 * 60 * 60);
    }
}
