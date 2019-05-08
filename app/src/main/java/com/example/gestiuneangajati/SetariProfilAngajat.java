package com.example.gestiuneangajati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SetariProfilAngajat extends AppCompatActivity {
    private EditText editMailA;
    private EditText editUsernameA;
    private EditText parolaVecheA;
    private EditText parolaNouaA;
    private Button salvareModificari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setari_profil_angajat);
        editMailA = findViewById(R.id.editMailAng);
        editUsernameA = findViewById(R.id.editUserAng);
        parolaVecheA = findViewById(R.id.parolaVecheAng);
        parolaNouaA = findViewById(R.id.parolaNouaAng);
        salvareModificari = findViewById(R.id.salveazaModificariAng);
    }

    public void salveazaModificariClick(View view){
        Intent i = new Intent(SetariProfilAngajat.this, ProfilAngajat.class);
        startActivity(i);
        Toast.makeText(this, "Modificarile au fost salvate cu succes", Toast.LENGTH_SHORT).show();
        this.finish();
    }
}
