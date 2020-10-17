package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //aqui a mágica
        setContentView(R.layout.activity_login);
    }


    public void login(View view) {

        Intent login = new Intent(this, MenuInicial.class);
        startActivity(login);
    }

    public void startCadastrar(View view) {

        Intent cadastrar = new Intent(this, Cadastrar.class);
        startActivity(cadastrar);
    }

}
