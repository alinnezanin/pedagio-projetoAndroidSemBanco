package com.example.aluno.pedagio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edtEstrada, edtDistancia, edtkm, edtcusto;
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEstrada = findViewById(R.id.edtEstrada);
        edtDistancia = findViewById(R.id.edtDistancia);
        edtkm = findViewById(R.id.edtkm);
        edtcusto = findViewById(R.id.edtcusto);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double edtEstradaValue = Double.parseDouble(edtEstrada.getText().toString());
                Double edtDistanciaValue = Double.parseDouble(edtDistancia.getText().toString()) ;
                Double edtCustoValue = Double.parseDouble(edtcusto.getText().toString()) ;
                Double edtkmValue = Double.parseDouble(edtkm.getText().toString()) ;

                Double resto  = edtEstradaValue % edtDistanciaValue;

                Double precoP = ((edtEstradaValue- resto)/edtDistanciaValue)* edtCustoValue;

                Double total = edtkmValue *edtEstradaValue + precoP;

                Context contexto = getApplicationContext();
                String texto = "Valor total "+total;
                int duracao = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(contexto, texto, duracao);
                toast.show();


            }
        });



    }
}
