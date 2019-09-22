package com.example.juegoecologico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView txtPuntaje;
    Button btnTerminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtPuntaje = findViewById(R.id.txt_puntaje);
        btnTerminar = findViewById(R.id.btn_terminar);

        Intent recibir = getIntent();
        txtPuntaje.setText("Tu puntaje es: "+ recibir.getStringExtra("Puntaje"));

    }

    public void onClick(View view) {
        finish();
    }
}
