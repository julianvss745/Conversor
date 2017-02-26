package com.example.ktdie.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ePesos, eDolares;
    Button bCalcular;
    Double pesos, dolares;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asociación
        ePesos=(EditText) findViewById(R.id.ePesos);
        eDolares=(EditText) findViewById(R.id.eDolares);

        bCalcular=(Button) findViewById(R.id.bCalcular);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Avisos tipo Toast dependiendo del valor de los EditText
                if(eDolares.getText().toString().equals("")&&ePesos.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(),"Ingrese la cantidad en pesos o en dólares que desea convertir",Toast.LENGTH_SHORT).show();
                }


                if(!(eDolares.getText().toString().equals(""))&& !(ePesos.getText().toString().equals(""))){

                    Toast.makeText(getApplicationContext(),"Por favor no llenar ambos recuadros. Digitar la cantidad que se desea convertir en el recuadro correspondiente",Toast.LENGTH_SHORT).show();
                }


                if(!(eDolares.getText().toString().equals(""))&& ePesos.getText().toString().equals("")){

                    //Covertir texto a string y luego a double
                    dolares=Double.parseDouble(eDolares.getText().toString());

                    // Realizar la operacion e imprimir en el EditText
                    pesos= dolares*2850;
                    ePesos.setText(String.format("%.4f",pesos));
                }


                if((eDolares.getText().toString().equals(""))&& !ePesos.getText().toString().equals("")){

                    //Covertir texto a string y luego a double
                    pesos=Double.parseDouble(ePesos.getText().toString());

                    // Realizar la operacion e imprimir en el EditText
                    dolares= pesos/2850;
                    eDolares.setText(String.format("%.4f",dolares));
                }

            }
        });

    }
}
