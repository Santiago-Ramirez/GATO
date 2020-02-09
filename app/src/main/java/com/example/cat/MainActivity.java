package com.example.cat;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    char chances = 0;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, reset,again;
    private int PuntosJugador2 = 0;
    private int contador=0;
    private int PuntosJugador1 = 0;
    private TextView textViewJugador1;
    private TextView textViewJugador2;
    public MediaPlayer ring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textViewJugador1 = (TextView) findViewById(R.id.jugador1);
        textViewJugador2 = (TextView) findViewById(R.id.jugador2);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        reset = (Button) findViewById(R.id.Resetear_Juego);
        again = (Button) findViewById(R.id.JugarDenuevo);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        reset.setOnClickListener(this);
        again.setOnClickListener(this);
        ring = MediaPlayer.create(MainActivity.this, R.raw.relajante);
        ring.start();

    }



    @Override
    public void onClick(View view) {
        contador++;

        switch (view.getId())
        {

            case R.id.btn_1:
                if (btn1.getText().toString().equals("")) {
                    if (chances == 0) {
                        chances = 1;
                        btn1.setText("O");
                        resultado();
                    } else {
                        chances = 0;
                        btn1.setText("X");
                        resultado();
                    }
                }
                break;

            case R.id.btn_2:
                if (btn2.getText().toString().equals("")) {
                    if (chances == 0) {
                        chances = 1;
                        btn2.setText("O");
                        resultado();
                    } else {
                        chances = 0;
                        btn2.setText("X");
                        resultado();
                    }
                }
                break;
            case R.id.btn_3:
                if (btn3.getText().toString().equals("")) {
                    if (chances == 0) {
                        chances = 1;
                        btn3.setText("O");
                        resultado();
                    } else {
                        chances = 0;
                        btn3.setText("X");
                        resultado();
                    }
                }
                break;

            case R.id.btn_4:
                if (btn4.getText().toString().equals("")) {
                    if (chances == 0) {
                        chances = 1;
                        btn4.setText("O");
                        resultado();
                    } else {
                        chances = 0;
                        btn4.setText("X");
                        resultado();
                    }
                }
                break;

            case R.id.btn_5:
                if (btn5.getText().toString().equals("")) {
                    if (chances == 0) {
                        chances = 1;
                        btn5.setText("O");
                        resultado();
                    } else {
                        chances = 0;
                        btn5.setText("X");
                        resultado();
                    }
                }
                break;

            case R.id.btn_6:
                if (btn6.getText().toString().equals("")) {
                    if (chances == 0) {
                        chances = 1;
                        btn6.setText("O");
                        resultado();
                    } else {
                        chances = 0;
                        btn6.setText("X");
                        resultado();
                    }
                }
                break;

            case R.id.btn_7:
                if (btn7.getText().toString().equals("")) {
                    if (chances == 0) {
                        chances = 1;
                        btn7.setText("O");
                        resultado();
                    } else {
                        chances = 0;
                        btn7.setText("X");
                        resultado();
                    }
                }
                break;

            case R.id.btn_8:
                if (btn8.getText().toString().equals("")) {
                    if (chances == 0) {
                        chances = 1;
                        btn8.setText("O");
                        resultado();
                    } else {
                        chances = 0;
                        btn8.setText("X");
                        resultado();

                    }
                }
                break;



            case R.id.btn_9:
                if (btn9.getText().toString().equals("")) {
                    if (chances == 0) {
                        chances = 1;
                        btn9.setText("O");
                        resultado();
                    } else {
                        chances = 0;
                        btn9.setText("X");
                        resultado();
                    }
                }
                break;


            case R.id.Resetear_Juego:
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                contador=0;
                textViewJugador1.setText("Jugador(X): 0");
                textViewJugador2.setText("Jugador(O): 0");
                break;

            case R.id.JugarDenuevo:
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                contador=0;
                break;


        }
        if (contador==9)
        {
            Toast.makeText(this, "EMPATE", Toast.LENGTH_SHORT).show();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
    }

    public void resultado()
    {
        if (btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X"))
        {
            Toast.makeText(this, "Jugador X GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador1++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
            /* again.callOnClick();*/
        }
        else if (btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X"))
        {
            Toast.makeText(this, "Jugador X GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador1++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
        {
            Toast.makeText(this, "Jugador X GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador1++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O"))
        {
            Toast.makeText(this, "Jugador O GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador2++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn6.getText().toString().equals("O"))
        {
            Toast.makeText(this, "Jugador O GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador2++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O"))
        {
            Toast.makeText(this, "Jugador O GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador2++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X"))
        {
            Toast.makeText(this, "Jugador X GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador1++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X"))
        {
            Toast.makeText(this, "Jugador X GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador1++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
        {
            Toast.makeText(this, "Jugador X GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador1++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn1.getText().toString().equals("O") && btn4.getText().toString().equals("O") && btn7.getText().toString().equals("O"))
        {
            Toast.makeText(this, "Jugador O GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador2++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn2.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn8.getText().toString().equals("O"))
        {
            Toast.makeText(this, "Jugador O GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador2++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn3.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn9.getText().toString().equals("O"))
        {
            Toast.makeText(this, "Jugador O GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador2++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
        {
            Toast.makeText(this, "Jugador X GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador1++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X"))
        {
            Toast.makeText(this, "Jugador X GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador1++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn1.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O"))
        {
            Toast.makeText(this, "Jugador O GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador2++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }
        else if (btn3.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn7.getText().toString().equals("O"))
        {
            Toast.makeText(this, "Jugador O GANO", Toast.LENGTH_SHORT).show();
            PuntosJugador2++;
            actualizarganadas();
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            contador=0;
        }

    }

    public void actualizarganadas()
    {
        textViewJugador1.setText("Jugador(X): " + PuntosJugador1);
        textViewJugador2.setText("Jugador(O): " + PuntosJugador2);
    }

}


