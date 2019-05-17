package com.google.myvremote;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Main2Activity extends AppCompatActivity {


    private Socket skt2 = null;
    private PrintWriter p2 = null;
    private boolean conn2;
    private int xpos=0,ypos=0;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button lclick =(Button)findViewById(R.id.button9);
        Button rclick =(Button)findViewById(R.id.button10);
        Button back = (Button)findViewById(R.id.button11);
        Button vkey = (Button)findViewById(R.id.button12);
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (MyApp.getNtbs2())
        {
            MyApp.setNtbs2(false);
            MyApp m = new MyApp();
            skt2 = m.getSock();
            if (skt2 != null){
                try {
                    p2 = new PrintWriter(skt2.getOutputStream(), true);
                    conn2 = true;
                }catch (IOException e){
                    conn2 = false;
                    Toast.makeText(Main2Activity.this, "No ostream!", Toast.LENGTH_SHORT).show();
                }
            } else{
                conn2 = false;
                Toast.makeText(Main2Activity.this, "No socket here...", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            MyApp m2 = new MyApp();
            skt2 = m2.getSock();
            if (skt2 != null) {
                try {
                    p2 = new PrintWriter(skt2.getOutputStream(), true);
                    conn2 = true;
                } catch (IOException e) {
                    conn2 = false;
                    Toast.makeText(Main2Activity.this, "No ostream!", Toast.LENGTH_SHORT).show();
                }
            } else {
                conn2 = false;
                Toast.makeText(Main2Activity.this, "No socket here...", Toast.LENGTH_SHORT).show();
            }
        }

        lclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(conn2 && p2 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p2.println("lclick");
                        }
                    };
                    Thread t = new Thread(r);
                    t.start();
                    Toast.makeText(Main2Activity.this, "Lclicking", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(conn2 && p2 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p2.println("rclick");
                        }
                    };
                    Thread t = new Thread(r);
                    t.start();
                    Toast.makeText(Main2Activity.this, "Rclicking", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tv.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {



                switch (event.getAction()){

                    case MotionEvent.ACTION_DOWN :
                        xpos =(int) event.getX();
                        ypos =(int) event.getY();
                        Toast.makeText(Main2Activity.this, "Touched!", Toast.LENGTH_SHORT).show();
                        break;

                    case MotionEvent.ACTION_MOVE:
                        final int delX = (int)event.getX()-xpos;
                        final int delY = (int)event.getY()-ypos;
                        if(conn2 && p2 != null) {
                            Runnable r = new Runnable() {
                                @Override
                                public void run() {
                                    p2.println(delX + " " + delY);
                                }
                            };
                            Thread t = new Thread(r);
                            t.start();
                        }
                        break;

                    //case MotionEvent.ACTION_UP:


                }

                return true;

            }
        });

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                MyApp.setNtbs(true);
                Intent i = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(i);
            }
        });

        vkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });




    }
}
