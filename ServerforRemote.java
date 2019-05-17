
package serverforremote;


import com.sun.glass.events.KeyEvent;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.net.Socket;
import java.util.Scanner;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.net.ServerSocket;


public class ServerforRemote {

    public static void main(String[] args) {
        
        String input = "";
        try{
        boolean connected = true;
        Robot r = new Robot();    
        ServerSocket ss = new ServerSocket(6324);
        Socket s = ss.accept();
        System.out.println("client found...");
        while(connected){      
        Scanner sc = new Scanner(s.getInputStream());
        input = sc.nextLine();
        if(!input.contains(" "))
        System.out.println(input);
        if(input.equals("vdown"))
        {
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_DOWN);
        }
        else if(input.equals("vup"))
        {
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_UP);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_UP);
        }
        else if(input.equals("pp"))
        {
            r.keyPress(KeyEvent.VK_SPACE);
            r.keyRelease(KeyEvent.VK_SPACE);
            
        }else if(input.equals("stop"))
        {
            r.keyPress(KeyEvent.VK_S);
            r.keyRelease(KeyEvent.VK_S);
            
        }else if(input.equals("nxt"))
        {
            r.keyPress(KeyEvent.VK_N);
            r.keyRelease(KeyEvent.VK_N);
            
        }else if(input.equals("mute"))
        {
            r.keyPress(KeyEvent.VK_M);
            r.keyRelease(KeyEvent.VK_M);
            
        }else if(input.equals("ar"))
        {
            r.keyPress(KeyEvent.VK_A);
            r.keyRelease(KeyEvent.VK_A);
            
        }else if(input.equals("lclick"))
        {
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            
        }else if(input.equals("rclick"))
        {
            r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
            
        }else if(input.contains(" "))
        {   
           int dx = Integer.parseInt(input.split(" ")[0]);         
           int dy = Integer.parseInt(input.split(" ")[1]);
           PointerInfo a = MouseInfo.getPointerInfo();
           Point b = a.getLocation();
           int X = b.x; 
           int Y = b.y;
           r.mouseMove(X+dx,Y+dy);
            
        }else if(input.equals("q"))
        {
            r.keyPress(KeyEvent.VK_Q);
            r.keyRelease(KeyEvent.VK_Q);
            
        }else if(input.equals("w"))
        {
            r.keyPress(KeyEvent.VK_W);
            r.keyRelease(KeyEvent.VK_W);
            
        }
        else if(input.equals("e"))
        {
            r.keyPress(KeyEvent.VK_E);
            r.keyRelease(KeyEvent.VK_E);
            
        }
        else if(input.equals("r"))
        {
            r.keyPress(KeyEvent.VK_R);
            r.keyRelease(KeyEvent.VK_R);
            
        }
        else if(input.equals("t"))
        {
            r.keyPress(KeyEvent.VK_T);
            r.keyRelease(KeyEvent.VK_T);
            
        }
        else if(input.equals("y"))
        {
            r.keyPress(KeyEvent.VK_Y);
            r.keyRelease(KeyEvent.VK_Y);
            
        }
        else if(input.equals("u"))
        {
            r.keyPress(KeyEvent.VK_U);
            r.keyRelease(KeyEvent.VK_U);
            
        }
        else if(input.equals("i"))
        {
            r.keyPress(KeyEvent.VK_I);
            r.keyRelease(KeyEvent.VK_I);
            
        }
        else if(input.equals("o"))
        {
            r.keyPress(KeyEvent.VK_O);
            r.keyRelease(KeyEvent.VK_O);
            
        }
        else if(input.equals("p"))
        {
            r.keyPress(KeyEvent.VK_P);
            r.keyRelease(KeyEvent.VK_P);
            
        }
        else if(input.equals("a"))
        {
            r.keyPress(KeyEvent.VK_A);
            r.keyRelease(KeyEvent.VK_A);
            
        }
        else if(input.equals("s"))
        {
            r.keyPress(KeyEvent.VK_S);
            r.keyRelease(KeyEvent.VK_S);
            
        }
        else if(input.equals("d"))
        {
            r.keyPress(KeyEvent.VK_D);
            r.keyRelease(KeyEvent.VK_D);
            
        }
        else if(input.equals("f"))
        {
            r.keyPress(KeyEvent.VK_F);
            r.keyRelease(KeyEvent.VK_F);
            
        }
        else if(input.equals("g"))
        {
            r.keyPress(KeyEvent.VK_G);
            r.keyRelease(KeyEvent.VK_G);
            
        }
        else if(input.equals("h"))
        {
            r.keyPress(KeyEvent.VK_H);
            r.keyRelease(KeyEvent.VK_H);
            
        }
        else if(input.equals("j"))
        {
            r.keyPress(KeyEvent.VK_J);
            r.keyRelease(KeyEvent.VK_J);
            
        }
        else if(input.equals("k"))
        {
            r.keyPress(KeyEvent.VK_K);
            r.keyRelease(KeyEvent.VK_K);
            
        }
        else if(input.equals("l"))
        {
            r.keyPress(KeyEvent.VK_L);
            r.keyRelease(KeyEvent.VK_L);
            
        }
        else if(input.equals("z"))
        {
            r.keyPress(KeyEvent.VK_Z);
            r.keyRelease(KeyEvent.VK_Z);
            
        }
        else if(input.equals("x"))
        {
            r.keyPress(KeyEvent.VK_X);
            r.keyRelease(KeyEvent.VK_X);
            
        }
        else if(input.equals("c"))
        {
            r.keyPress(KeyEvent.VK_C);
            r.keyRelease(KeyEvent.VK_C);
            
        }
        else if(input.equals("v"))
        {
            r.keyPress(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_V);
            
        }
        else if(input.equals("b"))
        {
            r.keyPress(KeyEvent.VK_B);
            r.keyRelease(KeyEvent.VK_B);
            
        }
        else if(input.equals("n"))
        {
            r.keyPress(KeyEvent.VK_N);
            r.keyRelease(KeyEvent.VK_N);
            
        }
        else if(input.equals("m"))
        {
            r.keyPress(KeyEvent.VK_M);
            r.keyRelease(KeyEvent.VK_M);
            
        }
        else if(input.equals("space"))
        {
            r.keyPress(KeyEvent.VK_SPACE);
            r.keyRelease(KeyEvent.VK_SPACE);
            
        }
        else if(input.equals("bspace"))
        {
            r.keyPress(KeyEvent.VK_BACKSPACE);
            r.keyRelease(KeyEvent.VK_BACKSPACE);
            
        }
        else if(input.equals("enter"))
        {
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            
        }
        else if(input.equals("closed"))
        {
            connected = false;
            s.close();
            ss.close();
        }
        
        
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
