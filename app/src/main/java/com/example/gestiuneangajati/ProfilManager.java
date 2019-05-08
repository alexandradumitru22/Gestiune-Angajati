package com.example.gestiuneangajati;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ProfilManager extends AppCompatActivity {
    private ImageButton actualizarePoza;
    private CardView angajati;
    private CardView agenda;
    private CardView progres;
    private CardView setari;
    private Button deconectare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_manager);

        actualizarePoza = findViewById(R.id.actualizareImagineManager);
        angajati = findViewById(R.id.cvAngajatiiMei);
        setari = findViewById(R.id.cvSetariManager);
        agenda = findViewById(R.id.cvAgenda);
        progres = findViewById(R.id.cvProgres);
        deconectare = findViewById(R.id.deconectareManager);
    }

    public void angajatiClick(View view){
        Intent i = new Intent(ProfilManager.this, Angajati.class);
        startActivity(i);
    }

    public void setariMClick(View view){
        Intent i = new Intent(ProfilManager.this, SetariProfilManager.class);
        startActivity(i);
    }

    public void agendaClick(View view){
        Intent i = new Intent(ProfilManager.this, Agenda.class);
        startActivity(i);
    }

    public void progresClick(View view){
        Intent i = new Intent(ProfilManager.this, Progres.class);
        startActivity(i);
    }

    public void deconectareMClick(View view){
        Intent i = new Intent(ProfilManager.this, MainActivity.class);
        startActivity(i);
        this.finish();
    }

}
