package com.example.notafinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText ePracticas, eAvanceI,eAvanceII,eAvanceIII,eAplicacion,eNota;
    Button bCalcular;
    Double prac,avI,avII,avIII,app,nf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePracticas=(EditText) findViewById(R.id.ePracticas);
        eAvanceI=(EditText) findViewById(R.id.eAvanceI);
        eAvanceII=(EditText) findViewById(R.id.eAvanceII);
        eAvanceIII=(EditText) findViewById(R.id.eAvanceIII);
        eAplicacion=(EditText) findViewById(R.id.eAplicacion);
        eNota=(EditText) findViewById(R.id.eNota);

        bCalcular=(Button) findViewById(R.id.bCalcular);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!(ePracticas.getText().toString().equals(""))&& !(eAvanceI.getText().toString().equals("")) && !(eAvanceII.getText().toString().equals("")) && !(eAvanceIII.getText().toString().equals("")) && !(eAplicacion.getText().toString().equals(""))){

                    //Convertir
                    prac=Double.parseDouble(ePracticas.getText().toString());
                    avI=Double.parseDouble(eAvanceI.getText().toString());
                    avII=Double.parseDouble(eAvanceII.getText().toString());
                    avIII=Double.parseDouble(eAvanceIII.getText().toString());
                    app=Double.parseDouble(eAplicacion.getText().toString());


                    // avisos tipo Toast si se presenta algun error
                    if (prac>5 || prac<0){
                        Toast.makeText(getApplicationContext(),"Error!! Rango de la nota de 0 a 5, revisar las notas",Toast.LENGTH_SHORT).show();
                    }
                    if (avI>5 || avI<0){
                        Toast.makeText(getApplicationContext(),"Error!! Rango de la nota de 0 a 5, revisar las notas",Toast.LENGTH_SHORT).show();
                    }
                    if (avII>5 || avII<0){
                        Toast.makeText(getApplicationContext(),"Error!! Rango de la nota de 0 a 5, revisar las notas",Toast.LENGTH_SHORT).show();
                    }
                    if (avIII>5 || avIII<0){
                        Toast.makeText(getApplicationContext(),"Error!! Rango de la nota de 0 a 5, revisar las notas",Toast.LENGTH_SHORT).show();
                    }
                    if (app>5 || app<0){
                        Toast.makeText(getApplicationContext(),"Error!! Rango de la nota de 0 a 5, revisar las notas",Toast.LENGTH_SHORT).show();
                    }

                    //Calculo de la nota
                    nf= (0.6*prac) + (0.05*avI) + (0.07*avII) + (0.08*avIII) + (0.2*app);


                    if (app>5 || app<0){
                        Toast.makeText(getApplicationContext(),"Error!! Rango de la nota de 0 a 5, revisar las notas",Toast.LENGTH_SHORT).show();
                    }

                    eNota.setText(String.valueOf(nf));
                }


                // avisos tipo Toast segun la nota del estudiante

                if (nf <= 1) {

                    Toast.makeText(getApplicationContext(), "Estás en el lugar equivoado", Toast.LENGTH_SHORT).show();
                }
                if (nf > 1 && nf <= 2) {

                    Toast.makeText(getApplicationContext(), "Remal", Toast.LENGTH_SHORT).show();
                }

                if (nf > 2 && nf <= 3) {

                    Toast.makeText(getApplicationContext(), "Es posible recuperarse", Toast.LENGTH_SHORT).show();
                }

                if (nf > 3 && nf <= 4) {

                    Toast.makeText(getApplicationContext(), "Normalito", Toast.LENGTH_SHORT).show();
                }

                if (nf > 4 && nf <= 4.5) {

                    Toast.makeText(getApplicationContext(), "Muy bien", Toast.LENGTH_SHORT).show();
                }

                if (nf > 4.5 && nf <= 5) {

                    Toast.makeText(getApplicationContext(), "Excelente estudiante", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
