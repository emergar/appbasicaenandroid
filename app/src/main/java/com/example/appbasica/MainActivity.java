package com.example.appbasica;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener {

    EditText txtusuario, txtclave;
    Button btnacceder;
    Context contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Toast.makeText(this, "Bienvenidos", Toast.LENGTH_SHORT).show();
        iniciarControles();
    }//Fin del método onCreate()

    private void iniciarControles(){
        contexto = getApplicationContext();
        txtusuario = findViewById(R.id.txtusuario);
        txtclave =  findViewById(R.id.txtclave);
        btnacceder = findViewById(R.id.btnacceder);

        btnacceder.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if( v.getId() == btnacceder.getId() ){
            String u;
            u = txtusuario.getText().toString();
            String c = txtclave.getText().toString();
            String mensaje = "Usuario: " + u + "\n";
            mensaje += "Contraseña: " + c + "\n";
            mensaje += "Bienvenido";

            Log.e("Error:",mensaje);
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();

            //Intención :: Es la promesa de que se hara el intento
            Intent intencion = new Intent(this, MenuActivity.class);
            startActivity(intencion);
        }
    }

    /*
    public void abrirMenu(View v) {
        String u, c;
        u = txtusuario.getText().toString();
        c = txtclave.getText().toString();
        String mensaje = "Usuario: " + u + "\n";
        mensaje += "Contraseña: " + c + "\n";
        mensaje += "Bienvenido";

        Log.v("Mensaje:",mensaje);
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();

        //Intención :: Es la promesa de que se hara el intento
        Intent intencion = new Intent(this, MenuActivity.class);
        startActivity(intencion);
    }*/
}//Fin de la clase Activity

/*
Android Studio
 Proyecto Nuevo
  MainActivity { xml:diseño de la ventana, java: programación  }
      Muestra: Imagen
      Solicita: Usuario y Password
      Botón: {
        1. Mostrar los datos ingresados en un Toast
        2. Ir a la Activity MenuActivity
      }

  MenuActivity { xml:diseño de la ventana, java: programación }
     Botón Calc: {
        1. Ir a la Activity CalculadoraActivity
      }

  CalculadoraActivity



*/




