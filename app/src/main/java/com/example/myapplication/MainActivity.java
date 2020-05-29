package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editAlcool,editGasolina;
    private TextView txtResultado;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcool = findViewById(R.id.editTextAlcool);
        editGasolina = findViewById(R.id.editTextGasolina);
        txtResultado = findViewById(R.id.txtResultado);
        button = findViewById(R.id.btnVerify);




    }

    public void Calcular(View view){

        Double precoAlcool = Double.parseDouble(editAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editGasolina.getText().toString());
        Double resultado = precoAlcool/precoGasolina;

        if(resultado > 0.7)
            txtResultado.setText("Melhor utilizar Gasolina");
        else
            txtResultado.setText("Melhor utilizar Álcool");

    }
}