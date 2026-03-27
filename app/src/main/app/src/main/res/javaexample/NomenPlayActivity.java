package com.example.praeporsition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NomenPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomen_play);
        Button startNewQuizBtn = findViewById(R.id.startNewQuizBtn);

        startNewQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NomenPlayActivity.this, HauptSeite.class);
                startActivity(intent);
            }
        });
    }
}
