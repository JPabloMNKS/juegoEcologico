package com.example.juegoecologico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnJuego;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJuego = findViewById(R.id.btn_juego);
        btnJuego.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_juego:
                Intent intent = new Intent(getApplicationContext(),JuegoActivity.class);
                startActivity(intent);
                break;
        }
    }
}
