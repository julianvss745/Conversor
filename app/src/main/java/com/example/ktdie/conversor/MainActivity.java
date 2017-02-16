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

        ePesos=(EditText) findViewById(R.id.ePesos);
        eDolares=(EditText) findViewById(R.id.eDolares);

        bCalcular=(Button) findViewById(R.id.bCalcular);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(eDolares.getText().toString().equals("")&&ePesos.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(),"Ingrese la cantidad en pesos o en dólares que desea convertir",Toast.LENGTH_SHORT).show();
                }


                if(!(eDolares.getText().toString().equals(""))&& !(ePesos.getText().toString().equals(""))){

                    Toast.makeText(getApplicationContext(),"Por favor no llenar ambos recuadros. Digitar la cantidad que se desea convertir en el recuadro correspondiente",Toast.LENGTH_SHORT).show();
                }


                if(!(eDolares.getText().toString().equals(""))&& ePesos.getText().toString().equals("")){

                    dolares=Double.parseDouble(eDolares.getText().toString());

                    pesos= dolares*2850;
                    ePesos.setText(String.valueOf(pesos));
                }


                if((eDolares.getText().toString().equals(""))&& !ePesos.getText().toString().equals("")){

                    pesos=Double.parseDouble(ePesos.getText().toString());

                    dolares= pesos/2850;
                    eDolares.setText(String.valueOf(dolares));
                }
            }
        });

    }
}
