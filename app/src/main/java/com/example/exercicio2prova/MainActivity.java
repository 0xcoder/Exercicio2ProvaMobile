package com.example.exercicio2prova;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        TelaPrincipal();

    }

    public void TelaPrincipal() {
        setContentView(R.layout.activity_main);
        Button btnImc, btnFa;

        btnImc = (Button) findViewById(R.id.btnImc);
        btnFa = (Button) findViewById(R.id.btnFa);

        btnImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TelaImc();
            }
        });

        btnFa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TelaFa();
            }
        });


    }


    public void TelaImc() {
        setContentView(R.layout.imc);
        final EditText edtAltura, edtPeso;
        Button btnCalcularIMC ,btnVoltarPrincipalIMC;
        final TextView txtResultado1;

        edtAltura = (EditText) findViewById(R.id.edtAltura);
        edtPeso = (EditText) findViewById(R.id.edtPeso);
        btnCalcularIMC = (Button) findViewById(R.id.btnCalcularIMC);
        btnVoltarPrincipalIMC = (Button) findViewById(R.id.btnVoltarPrincipalIMC);
        txtResultado1 = (TextView) findViewById(R.id.txtResultado1);

        btnCalcularIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Altura = Double.parseDouble(edtAltura.getText().toString());
                double Peso = Double.parseDouble(edtPeso.getText().toString());

                double S =  Peso/(Altura*Altura );

                txtResultado1.setText("Resultado do : IMC é: "+ S);
            }
        });

        btnVoltarPrincipalIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TelaPrincipal();
            }
        });

    }

    public void TelaFa() {
        setContentView(R.layout.fa);

        final EditText edtCelsius;
        final TextView txtResultadoFA;
        Button btnCalcularFA, btnPrincipalFA;

        edtCelsius = (EditText) findViewById(R.id.edtCelsius);
        txtResultadoFA = (TextView) findViewById(R.id.txtResultadoFA);
        btnCalcularFA = (Button) findViewById(R.id.btnCalcularFA);
        btnPrincipalFA = (Button) findViewById(R.id.btnPrincipalFA);

        btnCalcularFA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Cel;
                Cel = Double.parseDouble(edtCelsius.getText().toString());
                double Soma;
                Soma = (Cel*1.8)+32;
                txtResultadoFA.setText("Teste: "+ Soma);
            }
        });

        btnPrincipalFA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TelaPrincipal();
            }
        });

    }
}