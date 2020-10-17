package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Skate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_skate);
    }

    public void brincarDepois(View view) {

        Intent brincadeiras = new Intent(this, BrincadeirasLista.class);
        startActivity(brincadeiras);
    }

    public void vamosBrincar(View view) {

        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setTitle("Parabéns");
        alerta.setMessage("Parabéns Você acaba de \nganhar 50 Pontos por brincar\nno passa anel. Divirta-se!!");
        alerta.setCancelable(true);
        alerta.setIcon(R.drawable.congratulation);
        alerta.create();
        alerta.show();
    }

}

