package com.example.ecuacion;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText ax, bx, cx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ax = (EditText) findViewById(R.id.eta);
        bx = (EditText)findViewById(R.id.etb);
        cx = (EditText)findViewById(R.id.etc);
    }
    public void calcular(View view) {

        double a= Double.parseDouble(ax.getText().toString());
        double b= Double.parseDouble(bx.getText().toString());
        double c= Double.parseDouble(cx.getText().toString());

        double x1 = (-b + (Math.sqrt(Math.pow(b, 2)- (4*a*c)))) / 2*a;
        double x2 = (-b -(Math.sqrt(Math.pow(b, 2)- (4*a*c)))) / 2*a;
        double D = Math.pow(b,2) - (4*a*c);

        Toast.makeText(this, "el resultado de x1 es:" + x1, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "El resultado de x2 es:"+ x2, Toast.LENGTH_SHORT).show();
        if(D>= 0){
            Toast.makeText(this, "Tiene solucion con los numeros reales:"+ D, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "No tiene solucion con numeros reales:"+ D, Toast.LENGTH_SHORT).show();
        }
        }

}
