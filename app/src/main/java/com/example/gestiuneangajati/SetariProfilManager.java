package com.example.gestiuneangajati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SetariProfilManager extends AppCompatActivity {
    private EditText editMailM;
    private EditText editUsernameM;
    private EditText parolaVecheM;
    private EditText parolaNouaM;
    private Button salvareModificari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setari_profil_manager);

        editMailM = findViewById(R.id.editMailMan);
        editUsernameM = findViewById(R.id.editUserMan);
        parolaVecheM = findViewById(R.id.parolaVecheMan);
        parolaNouaM = findViewById(R.id.parolaNouaMan);
        salvareModificari = findViewById(R.id.salveazaModificariMan);
    }

    public void salveazaModificariMClick(View view){
        Intent i = new Intent(SetariProfilManager.this, ProfilManager.class);
        startActivity(i);
        Toast.makeText(this, "Modificarile au fost salvate cu succes", Toast.LENGTH_SHORT).show();
        this.finish();
    }
}
