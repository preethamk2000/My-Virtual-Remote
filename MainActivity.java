package com.google.myvremote;

import android.app.Application;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {


        private boolean connected = false;
        private Socket skt = null;
        private PrintWriter pout = null;

        Handler h = new Handler(){

            @Override
            public void handleMessage(Message msg) {
                Toast.makeText(MainActivity.this, "Executing...", Toast.LENGTH_SHORT).show();

            }
        };



      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

          Button vdown = (Button)findViewById(R.id.button);
          Button pp = (Button)findViewById(R.id.button2);
          Button vup = (Button)findViewById(R.id.button3);
          Button stop = (Button)findViewById(R.id.button6);
          Button ar = (Button)findViewById(R.id.button5);
          Button nxt = (Button)findViewById(R.id.button7);
          Button mute = (Button)findViewById(R.id.button4);
          Button nac = (Button)findViewById(R.id.button8);


            if (MyApp.getNtbs())
            {
                MyApp.setNtbs(false);
                MyApp m = new MyApp();
                skt = m.getSock();
                if (skt != null){
                    try {
                        pout = new PrintWriter(skt.getOutputStream(), true);
                        connected = true;
                    }catch (IOException e){
                        connected = false;
                        Toast.makeText(MainActivity.this, "No ostream!", Toast.LENGTH_SHORT).show();
                    }
                } else{
                    connected = false;
                    Toast.makeText(MainActivity.this, "No socket here...", Toast.LENGTH_SHORT).show();
                }
            }



            vdown.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (connected && pout != null)
                    {
                        Runnable r = new Runnable() {
                            @Override
                            public void run() {
                                pout.println("vdown");
                                h.sendEmptyMessage(0);
                            }
                        };
                        Thread th = new Thread(r);
                        th.start();
                    }
                }
            });


            pp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (connected && pout!=null) {

                        Runnable r = new Runnable() {
                            @Override
                            public void run() {
                                pout.println("pp");
                                h.sendEmptyMessage(0);
                            }

                        };

                        Thread th = new Thread(r);
                        th.start();

                    }

                }
            });


            vup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (connected && pout != null)
                    {
                        Runnable r = new Runnable() {
                            @Override
                            public void run() {
                                pout.println("vup");
                                h.sendEmptyMessage(0);
                            }
                        };

                        Thread th = new Thread(r);
                        th.start();
                    }
                }
            });

            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (connected && pout != null)
                    {
                        Runnable r = new Runnable() {
                            @Override
                            public void run() {
                                pout.println("stop");
                                h.sendEmptyMessage(0);
                            }
                        };

                        Thread th = new Thread(r);
                        th.start();
                    }
                }
            });

            nxt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (connected && pout != null)
                    {
                        Runnable r = new Runnable() {
                            @Override
                            public void run() {
                                pout.println("nxt");
                                h.sendEmptyMessage(0);
                            }
                        };

                        Thread th = new Thread(r);
                        th.start();
                    }
                }
            });

            ar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (connected && pout != null)
                    {
                        Runnable r = new Runnable() {
                            @Override
                            public void run() {
                                pout.println("ar");
                                h.sendEmptyMessage(0);
                            }
                        };

                        Thread th = new Thread(r);
                        th.start();
                    }
                }
            });

            mute.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (connected && pout != null)
                    {
                        Runnable r = new Runnable() {
                            @Override
                            public void run() {
                                pout.println("mute");
                                h.sendEmptyMessage(0);
                            }
                        };

                        Thread th = new Thread(r);
                        th.start();
                    }
                }
            });

          nac.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent i = new Intent(MainActivity.this,Main2Activity.class);
                  startActivity(i);
              }
          });


      }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_connect) {

            try {
                EditText et = (EditText)findViewById(R.id.editText);
                String ip;
                ip = et.getText().toString();
                et.setText("");
                confone cp = new confone();
                cp.execute(ip);
            }catch (Exception e){
                Toast.makeText(this, "here...", Toast.LENGTH_SHORT).show();
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*public void connectPhone(){

          try {
              skt = new Socket("10.1.93.20",6324);
              connected = true;
          }catch(Exception e)
          {
              connected = false;
              Log.e("mvremote","connectphone error.");
          }
          if (connected){
              try {
                  pout = new PrintStream(skt.getOutputStream());
              }catch (Exception e){
                  Log.e("mvremote","error connection!");
              }

          }
          else
              Toast.makeText(this, "Error while connecting to server!", Toast.LENGTH_SHORT).show();

          } */

    @Override
    protected void onDestroy() {
        super.onDestroy();
            if (connected && pout!=null) {
                Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        try {
                            pout.println("closed");
                            skt.close();
                            pout.close();
                        }catch (Exception e){}
                    }

                };

                Thread th = new Thread(r);
                th.start();
            }
        }


    public class confone extends AsyncTask<String,Void,Boolean>{

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
            Toast.makeText(MainActivity.this, connected ? "Connected to the server!" : "Error...", Toast.LENGTH_SHORT).show();
            if (connected) {
                try {
                    pout = new PrintWriter(skt.getOutputStream(), true);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error while connecting to server!", Toast.LENGTH_SHORT).show();
                }
            }
        }

        @Override
        protected Boolean doInBackground(String... strings) {

            try {
                InetAddress sadd = InetAddress.getByName(strings[0]);
                skt = new Socket(sadd,6324);
                connected = true;
                MyApp m = new MyApp();
                m.setSocket(skt);
            }catch(Exception e)
            {
                connected = false;
            }


            return connected;
        }
    }
}


