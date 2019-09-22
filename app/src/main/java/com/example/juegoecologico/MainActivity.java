package com.example.juegoecologico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnJuego,btnInstrucciones,btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJuego = findViewById(R.id.btn_juego);
        btnInstrucciones = findViewById(R.id.btn_instrucciones);
        btnAbout = findViewById(R.id.btn_about);

        btnInstrucciones.setOnClickListener(this);
        btnJuego.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_juego:
                Intent intent = new Intent(getApplicationContext(),JuegoActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_instrucciones:
                Intent instrucciones = new Intent(getApplicationContext(),InstruccionesActivity.class);
                startActivity(instrucciones);
                break;
            case R.id.btn_about:
                Intent about = new Intent(getApplicationContext(),AboutActivity.class);
                startActivity(about);
                break;
        }
    }
}
