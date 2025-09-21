package com.example.tictactoe2players;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AiProumptActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et;
    private Button btn1;
    private TextView tv;
    private String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ai_proumpt);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        et = findViewById(R.id.et);
        tv = findViewById(R.id.tv);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        str = et.getText().toString();
    }

    @Override
    public void onClick(View view) {
        tv.setText(str);
    }
}