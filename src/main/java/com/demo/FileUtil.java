package com.demo;

import java.io.*;

public class FileUtil {
    public static void readFile(String fileName) {
      try
        {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch(IOException e)

        {
        }
    }

    public static void writeFile(String fileName) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            out.write("ll");
            out.append("dasd");
            out.newLine();
            out.write("ff");
            out.flush();
            out.close();
            System.out.println("follow");
            BufferedReader in = new BufferedReader(new FileReader("runoob.txt"));
            StringBuffer sb;
            while (in.ready()) {
                sb = (new StringBuffer(in.readLine()));
                System.out.println(sb);
            }
            in.close();
        } catch (IOException e) {
        }
    }
}
