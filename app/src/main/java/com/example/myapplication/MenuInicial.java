package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_menu_inicial);
    }

    public void ondeBrincar(View view) {

        Intent login = new Intent(this, OndeBrincar.class);
        startActivity(login);
    }

    public void vamosBrincar(View view) {

        Intent vamosbrincar = new Intent(this, VamosBrincar.class);
        startActivity(vamosbrincar);
    }

    public void meuPerfil(View view) {

        Intent meuperfil = new Intent(this, MeuPerfil.class);
        startActivity(meuperfil);
    }

    public void ranking(View view) {

        Intent ranking = new Intent(this, Ranking.class);
        startActivity(ranking);
    }

    public void sobre(View view) {

        Intent sobre = new Intent(this, sobre.class);
        startActivity(sobre);
    }


    public void sugestoes(View view) {

        Intent login = new Intent(this, Sugestoes.class);
        startActivity(login);
    }

    public void sair(View view) {

        Intent login = new Intent(this, login.class);
        startActivity(login);
    }

    public void loja(View view) {

        Intent login = new Intent(this, lojinha.class);
        startActivity(login);
    }

    public void mapa(View view) {

        Intent login = new Intent(this, MapsActivity.class);
        startActivity(login);
    }





}
