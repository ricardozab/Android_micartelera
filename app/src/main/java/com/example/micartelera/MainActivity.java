package com.example.micartelera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btningresar;
    EditText txtUsuario;
    EditText txtClave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = findViewById(R.id.editTextUsuario);
        txtUsuario.setText("Hola");

    }
    public void onClickIngresar(View target){
        txtUsuario = findViewById(R.id.editTextUsuario);
        txtUsuario.setText("Hola Usuario2");
        Intent ingreso = new Intent(MainActivity.this,menu.class);
        MainActivity.this.startActivity(ingreso);

    }







}
