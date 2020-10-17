package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Sugestoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sugestoes);
    }

    public void enviar(View view) {

        Toast.makeText(
                getApplicationContext(),
                "Sua sugestão foi enviada com sucesso, Obrigado!!",
                Toast.LENGTH_SHORT
        ).show();

        EditText sugest = (EditText) findViewById(R.id.sugestao);
        sugest.setText("");
    }

    public void sair(View view) {

        Intent login = new Intent(this, MenuInicial.class);
        startActivity(login);
    }

}
