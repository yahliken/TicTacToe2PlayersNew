package com.example.tictactoe2players;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  Button btn2 , btnGame, btnGameE, btnGameM, btnGameD, btnGameAI, btnIns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGame = findViewById(R.id.btnGame);
        btnGame.setOnClickListener(this);

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btnGameE = findViewById(R.id.btnGameE);
        btnGameE.setOnClickListener(this);

        btnGameM = findViewById(R.id.btnGameM);
        btnGameM.setOnClickListener(this);

        btnGameD = findViewById(R.id.btnGameD);
        btnGameD.setOnClickListener(this);

        btnGameAI = findViewById(R.id.btnGameAI);
        btnGameAI.setOnClickListener(this);

        btnIns = findViewById(R.id.btnIns);
        btnIns.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == btnGame) {
            Intent i = new Intent(MainActivity.this , GameActivity.class);
            startActivity(i);
        }
        if (view == btnGameE) {
            Intent i = new Intent(MainActivity.this , GameActivity.class);
            startActivity(i);
        }
        if (view == btnGameM) {
            Intent i = new Intent(MainActivity.this , GameActivity.class);
            startActivity(i);
        }
        if (view == btnGameD) {
            Intent i = new Intent(MainActivity.this , GameActivity.class);
            startActivity(i);
        }
        if (view == btnGameAI) {
            Intent i = new Intent(MainActivity.this , GameActivity.class);
            startActivity(i);
        }
        if (view == btnIns) {
            Intent i = new Intent(MainActivity.this , GameActivity.class);
            startActivity(i);
        }
        else {
            Intent i = new Intent(MainActivity.this , AiProumptActivity.class);
            startActivity(i);
        }
    }
}