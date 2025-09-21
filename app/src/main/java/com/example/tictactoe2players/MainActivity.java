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

    private  Button btn2 , btnGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGame = findViewById(R.id.btnGame);
        btnGame.setOnClickListener(this);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == btnGame) {
            Intent i = new Intent(MainActivity.this , GameActivity.class);
            startActivity(i);
        }
        else {
            Intent i = new Intent(MainActivity.this , AiProumptActivity.class);
            startActivity(i);
        }
    }
}