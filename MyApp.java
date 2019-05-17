package com.google.myvremote;

import android.app.Application;

import java.net.Socket;
import java.util.logging.SocketHandler;

public class MyApp extends Application {

    private static Socket sock;
    private static boolean ntbs = false;
    private static boolean ntbs2 = false;

    public static boolean getNtbs() {
        return ntbs;
    }

    public static void setNtbs(boolean ntbs) {
        MyApp.ntbs = ntbs;
    }

    public static boolean getNtbs2() {
        return ntbs2;
    }

    public static void setNtbs2(boolean ntbs) {
        MyApp.ntbs2 = ntbs;
    }

    public Socket getSock(){
        return sock;
    }

    public void setSocket(Socket socket){

    sock = socket;

    }
}
