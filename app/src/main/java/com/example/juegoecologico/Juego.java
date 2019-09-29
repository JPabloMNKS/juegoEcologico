package com.example.juegoecologico;

import android.content.Context;
import android.content.res.Resources;


public class Juego {
    public Juego() {
    }

    private String[][] nombre = {
            { "coca","no coca","no coca","no coca","no coca","no coca"},
            { "si","no","no","no","no","no"},
            { "no","no ","no","si","no","no"},
            { "no","no","no","no","no","talvez"},
    };
    private String[] frase = {
            "Esta es una frase sobre la coca cola",
            "este necesita que eligas la pregunta si",
            "este no necesita que eligas la pregunta no",
            "este necesita que eligas la pregunta  tal vez"
    };
    private int[][] thumbnail = {
            { R.drawable.soda, R.drawable.ic_launcher_foreground, R.drawable.soda, R.drawable.ic_launcher_foreground, R.drawable.soda, R.drawable.ic_launcher_foreground},
            { R.drawable.soda, R.drawable.ic_launcher_foreground, R.drawable.soda, R.drawable.ic_launcher_foreground, R.drawable.soda, R.drawable.ic_launcher_foreground}

    };

    private String[] respuestaCorrecta = {
            "coca",
            "si",
            "si",
            "talvez"
    };

    public Juego(String nombre[][], String[] frase, int[][] thumbnail, String[] respuestaCorrecta) {
        this.nombre = nombre;
        this.frase = frase;
        this.thumbnail = thumbnail;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    protected String getRespuesta(int a){
        String respuestaE = respuestaCorrecta[a];
        return respuestaE;
    }

    public String getNombre(int a, int b) {
        String nombreE = nombre[a][b];
        return nombreE;
    }

    public String getFrase(int a) {
        String fraseE = frase[a];
        return fraseE;
    }

    public int getThumbnail(int a,int b) {
        int thumb = thumbnail[a][b];
        return thumb;
    }

    public int getTamNombre(){
        return nombre[0].length;
    }

    public int getTamFrase(){
        return frase.length;
    }

    public int getTamThumnail(){
        return thumbnail[0].length;
    }


}
