package com.example.tesst;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import static com.example.tesst.MainActivity.bd;
import static com.example.tesst.MainActivity.list;

public class accueil extends AppCompatActivity {
    EditText achat ;
    EditText cout;
    Button bouton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);
        achat=findViewById(R.id.ach);
        cout=findViewById(R.id.cout);
        bouton=findViewById(R.id.bt);
        bouton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v)
            {
                String cha= achat.getText().toString();
                String ct =cout.getText().toString();
                exx nouveau = new exx(cha, ct);

                bd.ajouter(nouveau);
                Toast.makeText(accueil.this, " nouveau achat ajouté ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(accueil.this,MainActivity.class);
                startActivity(intent);
            }

        });

    }
}