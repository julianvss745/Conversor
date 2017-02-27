package com.example.resistencias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    TextView tResultado;
    RadioButton rbN10,rbN20,rbN30, rbM11, rbM21, rbM31, rbR12,rbR22,rbR32, rbN13, rbN23, rbN33, rbA14,rbA24,rbA34, rbV15, rbV25, rbV35, rbA16,rbA26,rbA36, rbP17, rbP27, rbG18,rbG28, rbB19, rbB29, rbM40,rbR41,rbO42,rbP43;
    Button bCalcular;
    String sB1,sB2,sB3,sB4,sResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbN10=(RadioButton) findViewById(R.id.rbN10);
        rbN20=(RadioButton) findViewById(R.id.rbN20);
        rbN30=(RadioButton) findViewById(R.id.rbN30);
        rbM11=(RadioButton) findViewById(R.id.rbM11);
        rbM21=(RadioButton) findViewById(R.id.rbM21);
        rbM31=(RadioButton) findViewById(R.id.rbM31);
        rbM40=(RadioButton) findViewById(R.id.rbM40);
        rbR12=(RadioButton) findViewById(R.id.rbR12);
        rbR22=(RadioButton) findViewById(R.id.rbR22);
        rbR32=(RadioButton) findViewById(R.id.rbR32);
        rbR41=(RadioButton) findViewById(R.id.rbR41);
        rbN13=(RadioButton) findViewById(R.id.rbN13);
        rbN23=(RadioButton) findViewById(R.id.rbN23);
        rbN33=(RadioButton) findViewById(R.id.rbN33);
        rbA14=(RadioButton) findViewById(R.id.rbA14);
        rbA24=(RadioButton) findViewById(R.id.rbA24);
        rbA34=(RadioButton) findViewById(R.id.rbA34);
        rbV15=(RadioButton) findViewById(R.id.rbV15);
        rbV25=(RadioButton) findViewById(R.id.rbV25);
        rbV35=(RadioButton) findViewById(R.id.rbV35);
        rbA16=(RadioButton) findViewById(R.id.rbA16);
        rbA26=(RadioButton) findViewById(R.id.rbA26);
        rbA36=(RadioButton) findViewById(R.id.rbA36);
        rbP17=(RadioButton) findViewById(R.id.rbP17);
        rbP27=(RadioButton) findViewById(R.id.rbP27);
        rbG18=(RadioButton) findViewById(R.id.rbG18);
        rbG28=(RadioButton) findViewById(R.id.rbG28);
        rbB19=(RadioButton) findViewById(R.id.rbB19);
        rbB29=(RadioButton) findViewById(R.id.rbB29);
        rbO42=(RadioButton) findViewById(R.id.rbO42);
        rbP43=(RadioButton) findViewById(R.id.rbP43);

        tResultado=(TextView) findViewById(R.id.tResultado);

        bCalcular=(Button) findViewById(R.id.bCalcular);

        sResultado="";
        sB1="";

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(sB1.equals("")) && !(sB2.equals("")) && !(sB3.equals("")) && !(sB4.equals(""))){

                    sResultado= sB1+sB2+sB3+sB4;

                    tResultado.setText(String.valueOf(sResultado));
                }

            }
        });

    }


    public void Clicked1(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {

            case R.id.rbN10:
                if (checked)
                    sB1=" ";
                break;

            case R.id.rbM11:
                if (checked)
                    sB1="1";
                break;

            case R.id.rbR12:
                if (checked)
                    sB1="2";
                break;

            case R.id.rbN13:
                if (checked)
                    sB1="3";
                break;

            case R.id.rbA14:
                if (checked)
                    sB1="4";
                break;

            case R.id.rbV15:
                if (checked)
                    sB1="5";
                break;

            case R.id.rbA16:
                if (checked)
                    sB1="6";
                break;

            case R.id.rbP17:
                if (checked)
                    sB1="7";
                break;

            case R.id.rbG18:
                if (checked)
                    sB1="8";
                break;

            case R.id.rbB19:
                if (checked)
                    sB1="9";
                break;
        }
    }


    public void Clicked2(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {

            case R.id.rbN20:
                if (checked)
                    sB2="0";
                break;

            case R.id.rbM21:
                if (checked)
                    sB2="1";
                break;

            case R.id.rbR22:
                if (checked)
                    sB2="2";
                break;

            case R.id.rbN23:
                if (checked)
                    sB2="3";
                break;

            case R.id.rbA24:
                if (checked)
                    sB2="4";
                break;

            case R.id.rbV25:
                if (checked)
                    sB2="5";
                break;

            case R.id.rbA26:
                if (checked)
                    sB2="6";
                break;

            case R.id.rbP27:
                if (checked)
                    sB2="7";
                break;

            case R.id.rbG28:
                if (checked)
                    sB2="8";
                break;

            case R.id.rbB29:
                if (checked)
                    sB2="9";
                break;
        }
    }


    public void Clicked3(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {

            case R.id.rbN30:
                if (checked)
                    sB3=" Ohm";
                break;

            case R.id.rbM31:
                if (checked)
                    sB3="0 Ohm";
                break;

            case R.id.rbR32:
                if (checked)
                    sB3="00 Ohm";
                break;

            case R.id.rbN33:
                if (checked)
                    sB3=" K Ohm";
                break;

            case R.id.rbA34:
                if (checked)
                    sB3="0 K Ohm";
                break;

            case R.id.rbV35:
                if (checked)
                    sB3="00 K Ohm";
                break;

            case R.id.rbA36:
                if (checked)
                    sB3=" M Ohm";
                    break;

        }
    }


    public void Clicked4(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.rbM40:
                if (checked)
                    sB4=" +/- 1%";
                break;

            case R.id.rbR41:
                if (checked)
                    sB4=" +/- 2%";
                break;

            case R.id.rbO42:
                if (checked)
                    sB4=" +/- 5%";
                break;

            case R.id.rbP43:
                if (checked)
                    sB4=" +/- 10%";
                break;
        }

    }

}
