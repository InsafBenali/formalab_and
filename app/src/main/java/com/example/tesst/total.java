package com.example.tesst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.tesst.MainActivity.bd;

public class total extends AppCompatActivity {
    EditText t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total);

        t = findViewById(R.id.tot);
        t.setText(Float.toString(bd.total()));

    }

}
