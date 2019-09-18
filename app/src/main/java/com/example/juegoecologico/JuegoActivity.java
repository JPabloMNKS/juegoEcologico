package com.example.juegoecologico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class JuegoActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtFrase;
    CardView cardOne,cardTwo,cardThree,cardFour,cardFive,cardSix;
    TextView txtNombre1,txtNombre2,txtNombre3,txtNombre4,txtNombre5,txtNombre6;
    ImageView imgThumb1,imgThumb2,imgThumb3,imgThumb4,imgThumb5,imgThumb6;
    TextView txtPuntaje;

    Button btnPrueba;
    int numFrase;

    Juego juego = new Juego();
    Random random = new Random();
    int num = 0;
    int puntaje=0;
    ArrayList<Integer> aleatorioNombre;
    ArrayList<Integer> aleatorioFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        // textViews
        txtFrase = findViewById(R.id.txt_frase);
        txtNombre1 = findViewById(R.id.txt_nombre_1);
        txtNombre2 = findViewById(R.id.txt_nombre_2);
        txtNombre3 = findViewById(R.id.txt_nombre_3);
        txtNombre4 = findViewById(R.id.txt_nombre_4);
        txtNombre5 = findViewById(R.id.txt_nombre_5);
        txtNombre6 = findViewById(R.id.txt_nombre_6);

        txtPuntaje = findViewById(R.id.txt_puntuacion);

        // Cardviews
        cardOne = findViewById(R.id.card_one);
        cardTwo = findViewById(R.id.card_two);
        cardThree = findViewById(R.id.card_three);
        cardFour = findViewById(R.id.card_four);
        cardFive = findViewById(R.id.card_five);
        cardSix = findViewById(R.id.card_six);


        // Image Views
        imgThumb1 = findViewById(R.id.img_thumbnail_1);
        imgThumb2 = findViewById(R.id.img_thumbnail_2);
        imgThumb3 = findViewById(R.id.img_thumbnail_3);
        imgThumb4 = findViewById(R.id.img_thumbnail_4);
        imgThumb5 = findViewById(R.id.img_thumbnail_5);
        imgThumb6 = findViewById(R.id.img_thumbnail_6);

        // prueba

        //Click Listeners
        cardOne.setOnClickListener(this);
        cardTwo.setOnClickListener(this);
        cardThree.setOnClickListener(this);
        cardFour.setOnClickListener(this);
        cardFive.setOnClickListener(this);
        cardSix.setOnClickListener(this);


        try{
            llenado();
        }catch (Exception ex){
            Toast.makeText(this,ex.toString(),Toast.LENGTH_LONG).show();
        }

    }

    protected void funcionAleatorio(){
        int aux = 0;

        aleatorioNombre = new ArrayList<Integer>(juego.getTamNombre());
        while (aux < juego.getTamNombre()){
            num = random.nextInt(juego.getTamNombre());
            if(!aleatorioNombre.contains(num)){
                aleatorioNombre.add(num);
                aux++;
          }
        }
    }

    private void llenado(){
        funcionAleatorio();
        numFrase = random.nextInt(4);
        txtFrase.setText(juego.getFrase(numFrase));

        txtNombre1.setText(juego.getNombre(numFrase, aleatorioNombre.get(0)));
        txtNombre2.setText(juego.getNombre(numFrase, aleatorioNombre.get(1)));
        txtNombre3.setText(juego.getNombre(numFrase, aleatorioNombre.get(2)));
        txtNombre4.setText(juego.getNombre(numFrase, aleatorioNombre.get(3)));
        txtNombre5.setText(juego.getNombre(numFrase, aleatorioNombre.get(4)));
        txtNombre6.setText(juego.getNombre(numFrase, aleatorioNombre.get(5)));

        imgThumb1.setImageResource(juego.getThumbnail(0,aleatorioNombre.get(0)));
        imgThumb2.setImageResource(juego.getThumbnail(0,aleatorioNombre.get(1)));
        imgThumb3.setImageResource(juego.getThumbnail(0,aleatorioNombre.get(2)));
        imgThumb4.setImageResource(juego.getThumbnail(0,aleatorioNombre.get(3)));
        imgThumb5.setImageResource(juego.getThumbnail(0,aleatorioNombre.get(4)));
        imgThumb6.setImageResource(juego.getThumbnail(0,aleatorioNombre.get(5)));

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.card_one:
                if(txtNombre1.getText().toString() == juego.getRespuesta(numFrase)){
                    puntaje += 10;
                    txtPuntaje.setText("La puntuacion es de: "+puntaje);
                }
                llenado();
                break;
            case R.id.card_two:
                if(txtNombre2.getText().toString() == juego.getRespuesta(numFrase)) {
                    puntaje += 10;
                    txtPuntaje.setText("La puntuacion es de: " + puntaje);
                }
                llenado();
                break;
            case R.id.card_three:
                if(txtNombre3.getText().toString() == juego.getRespuesta(numFrase)){
                    puntaje += 10;
                    txtPuntaje.setText("La puntuacion es de: "+puntaje);
                }
                llenado();
                break;
            case R.id.card_four:
                if(txtNombre4.getText().toString() == juego.getRespuesta(numFrase)){
                    puntaje += 10;
                    txtPuntaje.setText("La puntuacion es de: "+puntaje);
                }
                llenado();
                break;
            case R.id.card_five:
                if(txtNombre5.getText().toString() == juego.getRespuesta(numFrase)){
                    puntaje += 10;
                    txtPuntaje.setText("La puntuacion es de: "+puntaje);
                }
                llenado();
                break;
            case R.id.card_six:
                if(txtNombre6.getText().toString() == juego.getRespuesta(numFrase)){
                    puntaje += 10;
                    txtPuntaje.setText("La puntuacion es de: "+puntaje);
                }
                llenado();
                break;
        }
    }
}
