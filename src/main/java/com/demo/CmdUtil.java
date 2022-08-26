package com.demo;

import java.io.IOException;

public class CmdUtil {
    public static void execCmd(String cmd) {
        try {
            Process process = Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
