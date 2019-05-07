package com.example.gestiuneangajati;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText userLogin;
    private EditText parolaLogin;
    private Button butonLogin;
    private TextView linkInregistrare;
    private RadioGroup radioGroup;
    private RadioButton rbAngajat;
    private RadioButton rbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userLogin = findViewById(R.id.idUtilizatorLogin);
        parolaLogin = findViewById(R.id.parolaLogin);
        butonLogin = findViewById(R.id.butonLogin);
        linkInregistrare = findViewById(R.id.linkActivitateInregistrare);
        radioGroup = findViewById(R.id.radioGroupLogin);
        rbAngajat = findViewById(R.id.radioButtonAngajat);
        rbManager = findViewById(R.id.radioButtonManager);

        butonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioGroup.getCheckedRadioButtonId()==-1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Eroare");
                    builder.setMessage("Selectarea unui tip de utilizator este obligatorie!");
                    builder.setPositiveButton("OK", null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                else if(rbAngajat.isChecked()) { //profesor
                    Intent intent = new Intent(MainActivity.this, ProfilAngajat.class);
                    startActivityForResult(intent, 2);
                }
                else{
                    Intent intent = new Intent(MainActivity.this, ProfilManager.class);
                    startActivityForResult(intent, 3);
                }
            }
        });

        linkInregistrare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Inregistrare.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    /*public void buttonClick(View view) {
        Intent i = new Intent(Login.this, MainActivity.class);
        startActivity(i);
    }*/

    public void inregistrareClick(View view)
    {
        Intent i = new Intent(MainActivity.this, Inregistrare.class);
        startActivityForResult(i, 1);
    }

    public void onRadioButtonClicked(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId())
        {
            case(R.id.radioButtonAngajat):
                if(checked)
                    break;
            case(R.id.radioButtonManager):
                if(checked)
                    break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
