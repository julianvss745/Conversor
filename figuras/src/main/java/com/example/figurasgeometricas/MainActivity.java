package com.example.figurasgeometricas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText eLado,eRadio,eBase,eAltura,eClado;
    TextView tAcuadrado,tPcuadrado,tAciruclo,tPcirculo,tAtrinagulo,tPtriangulo,tVcubo,tAcubo,tPcubo;
    RadioButton rbCuadrado,rbCirculo,rbTriangulo,rbCubo;

    Double vol,area,perimetro,lado,radio,base,altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eLado=(EditText) findViewById(R.id.eLado);
        eRadio=(EditText) findViewById(R.id.eRadio);
        eBase=(EditText) findViewById(R.id.eBase);
        eAltura=(EditText) findViewById(R.id.eAltura);
        eClado=(EditText) findViewById(R.id.eClado);

        tVcubo=(TextView) findViewById(R.id.tVcubo);
        tAcuadrado=(TextView) findViewById(R.id.tAcuadrado);
        tAciruclo=(TextView) findViewById(R.id.tAcirculo);
        tAtrinagulo=(TextView) findViewById(R.id.tAtriangulo);
        tAcubo=(TextView) findViewById(R.id.tAcubo);
        tPcuadrado=(TextView) findViewById(R.id.tPcuadradro);
        tPcirculo=(TextView) findViewById(R.id.tPcirculo);
        tPtriangulo=(TextView) findViewById(R.id.tPtriangulo);
        tPcubo=(TextView) findViewById(R.id.tPcubo);

        rbCuadrado=(RadioButton) findViewById(R.id.rbCuadrado);
        rbCirculo=(RadioButton) findViewById(R.id.rbCirculo);
        rbTriangulo=(RadioButton) findViewById(R.id.rbTriangulo);
        rbCubo=(RadioButton) findViewById(R.id.rbCubo);

    }

    public void onRadioButtononClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {

            case R.id.rbCuadrado:
                if (checked)

                    if(!(eLado.getText().toString().equals(""))){

                        //Covertir texto a string y luego a double
                        lado=Double.parseDouble(eLado.getText().toString());

                        // Realizar la operacion e imprimir en el TextView
                        area= lado*lado;
                        tAcuadrado.setText(String.format("Área = "+"%.3f",area));

                        perimetro=4*lado;
                        tPcuadrado.setText(String.format("Perímetro = "+"%.3f",perimetro));
                    }

                    if(eLado.getText().toString().equals("")){

                         Toast.makeText(getApplicationContext(),"Ingrese un valor",Toast.LENGTH_SHORT).show();
                    }
                break;


            case R.id.rbCirculo:
                if (checked)

                    if(!(eRadio.getText().toString().equals(""))){

                        //Covertir texto a string y luego a double
                        radio=Double.parseDouble(eRadio.getText().toString());

                        // Realizar la operacion e imprimir en el TextView
                        area= (Math.PI)*(Math.pow(radio,2)) ;
                        tAciruclo.setText(String.format("Área = " + "%.3f",area));

                        perimetro=2*(Math.PI)*radio;
                        tPcirculo.setText(String.format("Perímetro = " + "%.3f",perimetro));
                    }

                    if(eRadio.getText().toString().equals("")){

                        Toast.makeText(getApplicationContext(),"Ingrese un valor",Toast.LENGTH_SHORT).show();
                     }

                    break;

            case R.id.rbTriangulo:
                if (checked)

                    if(!(eBase.getText().toString().equals(""))){

                        //Covertir texto a string y luego a double
                        base=Double.parseDouble(eBase.getText().toString());
                        altura=Double.parseDouble(eAltura.getText().toString());

                        // Realizar la operacion e imprimir en el TextView

                        perimetro=(Math.sqrt((Math.pow(altura, 2)) + (Math.pow(base, 2))));
                        perimetro= perimetro + base + altura;
                        tPtriangulo.setText(String.format("Perímetro = " + "%.3f",perimetro));

                        area= base*altura;
                        tAtrinagulo.setText(String.format("Área = " + "%.3f",area));
                    }

                    if((eBase.getText().toString().equals("")) && (eAltura.getText().toString().equals(""))){

                        Toast.makeText(getApplicationContext(),"Ingrese un valor",Toast.LENGTH_SHORT).show();
                    }

                    break;

            case R.id.rbCubo:
                if (checked)

                    if(!(eClado.getText().toString().equals(""))){

                        //Covertir texto a string y luego a double
                        lado=Double.parseDouble(eClado.getText().toString());

                        // Realizar la operacion e imprimir en el TextView
                        vol= lado*lado*lado;
                        tVcubo.setText(String.format("Volumen = " + "%.3f",vol));

                        area= lado*lado;
                        tAcubo.setText(String.format("Área = " + "%.3f",area));

                        perimetro=12*lado;
                        tPcubo.setText(String.format("Perímetro = "+ "%.3f",perimetro));
                    }

                    if(eLado.getText().toString().equals("")){

                        Toast.makeText(getApplicationContext(),"Ingrese un valor",Toast.LENGTH_SHORT).show();
                    }

                    break;
        }
    }

}

