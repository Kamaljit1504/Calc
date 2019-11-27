package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button MIN, AVG, MAX;
    private EditText T1, T2, T3, T4;
    private TextView db, java,swift,ios ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       MIN = (Button) findViewById(R.id.Min) ;
       MIN.setOnClickListener(this);

       T1 = findViewById(R.id.T1);
       T2 = findViewById(R.id.T2);
       T3 = findViewById(R.id.T3);
       T4 = findViewById(R.id.T4);

        db = findViewById(R.id.);
    }

    @Override
    public void onClick(View view) {

    }
}
