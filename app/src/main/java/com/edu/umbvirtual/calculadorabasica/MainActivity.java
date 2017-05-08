package com.edu.umbvirtual.calculadorabasica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* Variables
    **  Representarán los Buttons, EditText y TextView del resultado.
     */
    private TextView tv_result;
    private EditText et_num1, et_num2;
    private Button b_suma, b_resta, b_multi, b_divi;

    //Variables para cálculo de operaciones
    private double num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se obtienen las referencias de las vistas en la actividad
        tv_result = (TextView) findViewById(R.id.tv_result);
        et_num1 = (EditText) findViewById(R.id.et_num1);
        et_num2 = (EditText) findViewById(R.id.et_num2);
        b_suma = (Button) findViewById(R.id.b_suma);
        b_resta = (Button) findViewById(R.id.b_resta);
        b_multi = (Button) findViewById(R.id.b_multi);
        b_divi = (Button) findViewById(R.id.b_divi);

        //Listener en respuesta del botón de suma
        b_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtenerNumeros();
                //Calcula la suma
                result = num1 + num2;
                //Muestra la suma en el TextView de resultado
                tv_result.setText(String.valueOf(result));
            }
        });

        //Listener en respuesta del botón de restar
        b_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtenerNumeros();
                //Calcula la resta
                result = num1 - num2;
                //Muestra la resta en el TextView de resultado
                tv_result.setText(String.valueOf(result));
            }
        });

        //Listener en respuesta del botón de multiplicar
        b_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtenerNumeros();
                //Calcula la multiplicacion
                result = num1 * num2;
                //Muestra la multiplicacion en el TextView de resultado
                tv_result.setText(String.valueOf(result));
            }
        });
    }

    //Obtiene los valores numericos de los EditText
    private void obtenerNumeros() {
        num1 = Double.parseDouble(et_num1.getText().toString());
        num2 = Double.parseDouble(et_num2.getText().toString());
    }
}
