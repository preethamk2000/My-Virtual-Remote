package com.google.myvremote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Main3Activity extends AppCompatActivity {

    private Socket skt3 = null;
    private PrintWriter p3 = null;
    private boolean conn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button q = (Button)findViewById(R.id.button13);
        Button w = (Button)findViewById(R.id.button14);
        Button e = (Button)findViewById(R.id.button15);
        Button r = (Button)findViewById(R.id.button16);
        Button t = (Button)findViewById(R.id.button17);
        Button y = (Button)findViewById(R.id.button19);
        Button u = (Button)findViewById(R.id.button18);
        Button i = (Button)findViewById(R.id.button21);
        Button o = (Button)findViewById(R.id.button20);
        Button p = (Button)findViewById(R.id.button22);
        Button a = (Button)findViewById(R.id.button24);
        Button s = (Button)findViewById(R.id.button25);
        Button d = (Button)findViewById(R.id.button26);
        Button f = (Button)findViewById(R.id.button27);
        Button g = (Button)findViewById(R.id.button28);
        Button h = (Button)findViewById(R.id.button29);
        Button j = (Button)findViewById(R.id.button30);
        Button k = (Button)findViewById(R.id.button31);
        Button l = (Button)findViewById(R.id.button32);
        Button z = (Button)findViewById(R.id.button33);
        Button x = (Button)findViewById(R.id.button34);
        Button c = (Button)findViewById(R.id.button35);
        Button v = (Button)findViewById(R.id.button36);
        Button b = (Button)findViewById(R.id.button37);
        Button n = (Button)findViewById(R.id.button38);
        Button m = (Button)findViewById(R.id.button39);
        Button space = (Button)findViewById(R.id.button40);
        Button bspace = (Button)findViewById(R.id.button41);
        Button bck = (Button)findViewById(R.id.button42);
        Button enter = (Button)findViewById(R.id.button23);

        MyApp m3 = new MyApp();
        skt3 = m3.getSock();
        if (skt3 != null) {
            try {
                p3 = new PrintWriter(skt3.getOutputStream(), true);
                conn3 = true;
            } catch (IOException e1) {
                conn3 = false;
                Toast.makeText(Main3Activity.this, "No ostream!", Toast.LENGTH_SHORT).show();
            }
        } else {
            conn3 = false;
            Toast.makeText(Main3Activity.this, "No socket here...", Toast.LENGTH_SHORT).show();
        }


        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("q");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "q", Toast.LENGTH_SHORT).show();
                }
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("w");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "w", Toast.LENGTH_SHORT).show();
                }
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("e");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "e", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("r");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "r", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("t");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "t", Toast.LENGTH_SHORT).show();
                }
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("y");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "y", Toast.LENGTH_SHORT).show();
                }
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("u");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "u", Toast.LENGTH_SHORT).show();
                }
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("i");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "i", Toast.LENGTH_SHORT).show();
                }
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("o");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "o", Toast.LENGTH_SHORT).show();
                }
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("p");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "p", Toast.LENGTH_SHORT).show();
                }
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("a");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "a", Toast.LENGTH_SHORT).show();
                }
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("s");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "s", Toast.LENGTH_SHORT).show();
                }
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("d");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "d", Toast.LENGTH_SHORT).show();
                }
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("f");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "f", Toast.LENGTH_SHORT).show();
                }
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("g");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "g", Toast.LENGTH_SHORT).show();
                }
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("h");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "h", Toast.LENGTH_SHORT).show();
                }
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("j");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "j", Toast.LENGTH_SHORT).show();
                }
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("k");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "k", Toast.LENGTH_SHORT).show();
                }
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("l");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "l", Toast.LENGTH_SHORT).show();
                }
            }
        });
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("z");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "z", Toast.LENGTH_SHORT).show();
                }
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("x");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "x", Toast.LENGTH_SHORT).show();
                }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("c");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "c", Toast.LENGTH_SHORT).show();
                }
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("v");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "v", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("b");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "b", Toast.LENGTH_SHORT).show();
                }
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("n");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "n", Toast.LENGTH_SHORT).show();
                }
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("m");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "m", Toast.LENGTH_SHORT).show();
                }
            }
        });
        space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("space");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "spacebar", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("bspace");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "backspace", Toast.LENGTH_SHORT).show();
                }
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conn3 && p3 != null){
                    Runnable r = new Runnable() {
                        @Override
                        public void run() {
                            p3.println("enter");
                        }
                    };
                    Thread th = new Thread(r);
                    th.start();
                    Toast.makeText(Main3Activity.this, "backspace", Toast.LENGTH_SHORT).show();
                }
            }
            }
        );
        bck.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                MyApp.setNtbs(true);
                Intent i = new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(i);
            }
        });
}

}
