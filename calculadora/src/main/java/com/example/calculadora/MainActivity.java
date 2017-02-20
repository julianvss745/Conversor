package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText ePantalla, eResultado;

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bDiv,bMul,bRes,bSum,bC,bComa,bIgual;

    String  sDigito, sNumero, sPantalla, sResultado;

    Double add, ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=(Button) findViewById(R.id.b0);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        bDiv=(Button) findViewById(R.id.bDiv);
        bMul=(Button) findViewById(R.id.bMul);
        bRes=(Button) findViewById(R.id.bRes);
        bSum=(Button) findViewById(R.id.bSum);
        bC=(Button) findViewById(R.id.bC);
        bComa=(Button) findViewById(R.id.bComa);
        bIgual=(Button) findViewById(R.id.bIgual);


        ePantalla=(EditText)findViewById(R.id.ePantalla);
        eResultado=(EditText) findViewById(R.id.eResultado);

        sDigito="";
        sNumero="";
        sPantalla="";
        sResultado="";

    }

    public void click (View view){

        int id = view.getId();

        switch (id){

            case R.id.b0:
                sDigito="0";
                ePantalla.setText(sNumero.toString());
                eResultado.setText(sDigito.toString());

                break;

            case R.id.b1:
                sDigito="1";
                ePantalla.setText(sNumero.toString());
                eResultado.setText(sDigito.toString());

                break;

            case R.id.b2:
                sDigito="2";
                ePantalla.setText(sNumero.toString());
                eResultado.setText(sDigito.toString());

                break;

            case R.id.b3:
                sDigito="3";
                ePantalla.setText(sNumero.toString());
                eResultado.setText(sDigito.toString());

                break;
            case R.id.b4:
                sDigito="4";
                ePantalla.setText(sNumero.toString());
                eResultado.setText(sDigito.toString());

                break;

            case R.id.b5:
                sDigito="5";
                ePantalla.setText(sNumero.toString());
                eResultado.setText(sDigito.toString());

                break;

            case R.id.b6:
                sDigito="6";
                ePantalla.setText(sNumero.toString());
                eResultado.setText(sDigito.toString());

                break;

            case R.id.b7:
                sDigito="7";
                ePantalla.setText(sNumero.toString());
                eResultado.setText(sDigito.toString());

                break;

            case R.id.b8:
                sDigito="8";
                ePantalla.setText(sNumero.toString());
                eResultado.setText(sDigito.toString());

                break;

            case R.id.b9:
                sDigito="9";
                ePantalla.setText(sNumero.toString());
                eResultado.setText(sDigito.toString());

                break;

            case R.id.bSum:

                add=Double.parseDouble(sNumero);

                sPantalla= sNumero + "+";
                ePantalla.setText(sPantalla.toString());

                sDigito="";
                sNumero="";

                eResultado.setText(sDigito);

                break;

            case R.id.bRes:

                add=Double.parseDouble(sNumero);

                sPantalla= sNumero + "-";
                ePantalla.setText(sPantalla.toString());

                sDigito="";
                sNumero="";

                eResultado.setText(sDigito);

                break;

            case R.id.bMul:

                add=Double.parseDouble(sNumero);

                sPantalla= sNumero + "×";
                ePantalla.setText(sPantalla.toString());

                sDigito="";
                sNumero="";

                eResultado.setText(sDigito);

                break;

            case R.id.bDiv:

                add=Double.parseDouble(sNumero);

                sPantalla= sNumero + "÷";
                ePantalla.setText(sPantalla.toString());

                sDigito="";
                sNumero="";

                eResultado.setText(sDigito);

                break;

            case R.id.bC:
                sDigito=" ";
                sPantalla="";
                sResultado="";
                sNumero="";
                ePantalla.setText(sDigito.toString());
                eResultado.setText(sDigito.toString());

                break;



        }

        sNumero= sNumero + sDigito;
        ePantalla.setText(sPantalla.toString());




    }
}
