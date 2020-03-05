package com.example.demodanny1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double a,b,c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void respuesta(View vista){
        String salida;
        EditText variable = (EditText)findViewById(R.id.variable);
        TextView resp = (TextView)findViewById(R.id.rsp);
        salida = variable.getText().toString();
        resp.setText(" "+salida);
    }

    public void calcular(View vista){

        EditText km=(EditText) findViewById(R.id.kilometro);
        EditText precio=(EditText) findViewById(R.id.precio);
        TextView resultado=(TextView) findViewById(R.id.resultado);
        a=Double.parseDouble(km.getText().toString());
        b=Double.parseDouble(precio.getText().toString());
        c=a*b;
        String textoresultado=" " + c;
        resultado.setText(textoresultado);

    }
}
