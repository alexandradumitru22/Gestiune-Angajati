package com.example.gestiuneangajati;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Inregistrare extends AppCompatActivity {
    private EditText nume;
    private EditText prenume;
    private EditText dataNasterii;
    private EditText mail;
    private EditText username;
    private EditText parola;
    private Spinner spinnerManager;
    private Spinner spinnerDepartament;
    private Button inregistrare;
    private CheckBox functieManager;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inregistrare);

        nume = findViewById(R.id.numeAngajat);
        prenume = findViewById(R.id.prenumeAngajat);
        dataNasterii = findViewById(R.id.dataNasteriiAngajat);
        mail = findViewById(R.id.mailAngajat);
        username = findViewById(R.id.username);
        parola = findViewById(R.id.parolaAngajat);
        spinnerDepartament = findViewById(R.id.spinnerDepartament);
        spinnerManager = findViewById(R.id.spinnerManager);
        inregistrare = findViewById(R.id.buttonInregistrare);
        functieManager = findViewById(R.id.checkBoxManager);
    }

    public void inregistrareOnClick(View view) {
        if (nume.getText().toString().trim().equals("") || prenume.getText().toString().trim().equals("") ||
                dataNasterii.getText().toString().trim().equals("") || mail.getText().toString().trim().equals("")
                || parola.getText().toString().trim().equals("")) {
            Toast.makeText(getApplicationContext(), "Toate campurile sunt obligatorii!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Inregistrarea a fost realizata cu succes!", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(Inregistrare.this, MainActivity.class);
            startActivity(i);
            this.finish();
        }
    }

}
