package com.example.gestiuneangajati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ProfilAngajat extends AppCompatActivity {
    private ImageButton actualizarePoza;
    private CardView activitatileMele;
    private CardView setari;
    private Button deconectare;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        actualizarePoza = findViewById(R.id.butonSchimbareImagineProfil);
        activitatileMele = findViewById(R.id.cvActivitatileMele);
        setari = findViewById(R.id.cvSetari);
        deconectare = findViewById(R.id.buttonDeconectare);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_angajat);
    }

    public void actitatileMeleClick(View view){
        Intent i = new Intent(ProfilAngajat.this, ActivitatiAngajat.class);
        startActivity(i);
    }

    public void setariClick(View view){
        Intent i = new Intent(ProfilAngajat.this, SetariProfilAngajat.class);
        startActivity(i);
    }

    public void deconectareClick(View view){
        Intent i = new Intent(ProfilAngajat.this, MainActivity.class);
        startActivity(i);
        this.finish();
    }
}
