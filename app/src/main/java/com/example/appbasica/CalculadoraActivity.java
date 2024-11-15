package com.example.appbasica;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculadoraActivity extends AppCompatActivity {

    EditText txtvalor1, txtvalor2;
    TextView lblmensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculadora);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        iniciarControles();
    }

    private void iniciarControles(){
        txtvalor1 = findViewById(R.id.txtprimervalor);
        txtvalor2 = findViewById(R.id.txtsegundovalor);

        lblmensaje = findViewById(R.id.lblmensaje);
    }

    public void sumar(View v){
        String str;
        double v1, v2, res;
        str = txtvalor1.getText().toString();
        v1 = Double.parseDouble(str);
        str = txtvalor2.getText().toString();
        v2 = Double.parseDouble(str);

        res = v1 + v2;
        String m = "La suma de " + v1 + " + " + v2 + " = " + res;
        Toast.makeText(this, m, Toast.LENGTH_LONG).show();
        lblmensaje.setText(m);
    }

    public void restar(View v){
        String cadena;
        double v1, v2, res;
        cadena = txtvalor1.getText().toString();
        v1 = Double.parseDouble(cadena);
        cadena = txtvalor2.getText().toString();
        v2 = Double.parseDouble(cadena);

        res = v1 - v2;
        String mensaje = "La resta de " + v1 + " - " + v2 + " = " + res;
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
        lblmensaje.setText(mensaje);
    }

    public void multiplicar(View v){
        String cadena;
        double v1, v2, res;
        cadena = txtvalor1.getText().toString();
        v1 = Double.parseDouble(cadena);
        cadena = txtvalor2.getText().toString();
        v2 = Double.parseDouble(cadena);

        res = v1 * v2;
        String mensaje = "La multiplicación de " + v1 + " x " + v2 + " = " + res;
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
        lblmensaje.setText(mensaje);
    }

    public void dividir(View v){
        String cadena;
        double v1, v2, res;
        cadena = txtvalor1.getText().toString();
        v1 = Double.parseDouble(cadena);
        cadena = txtvalor2.getText().toString();
        v2 = Double.parseDouble(cadena);

        res = v1 / v2;
        String mensaje = "La división de " + v1 + " / " + v2 + " = " + res;
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
        lblmensaje.setText(mensaje);
    }
}