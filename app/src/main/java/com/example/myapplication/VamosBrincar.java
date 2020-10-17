package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class VamosBrincar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vamos_brincar);


    }

    public void brincar(View view) {

        EditText codpraca = (EditText) findViewById(R.id.codPraca);
        if(codpraca.getText().toString().equals("")){
            Toast.makeText(
                    getApplicationContext(),
                    "Por favor escaneie ou digite o codigo da praça",
                    Toast.LENGTH_SHORT
            ).show();
        }
        if(!codpraca.getText().toString().equals("001")){

            Toast.makeText(
                    getApplicationContext(),
                    "Nao reconheci esta praça, tente novamente",
                    Toast.LENGTH_SHORT
            ).show();
        }else{
            Intent brincadeiras = new Intent(this, BrincadeirasLista.class);
            startActivity(brincadeiras);
        }

    }

    public void sair(View view) {

        Intent menu = new Intent(this, MenuInicial.class);
        startActivity(menu);
    }

    public void lerQR(View view) {

        final Activity activity = this;
        IntentIntegrator integrator = new IntentIntegrator(activity);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
        integrator.setPrompt("Leia o QR Code presente na plaça");
        integrator.setCameraId(0);
        integrator.initiateScan();


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode,resultCode,data);

        if(result!=null){
            if(result.getContents()!=null){
                setCodPraca(result.getContents()); //result.getContents retorna a string do qrcode String
            }
        }else {
            super.onActivityResult(requestCode, resultCode, data);
        }

    }


    public void setCodPraca(String codigo){

        if(codigo.equals("001")){
            TextView info = (TextView) findViewById(R.id.informacao);
            info.setText("Você está na praça do Sol?");


        }
        EditText e1 = (EditText) findViewById(R.id.codPraca);
        e1.setText(codigo);
    }
}
