package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView greetingTextView;
    private EditText nameEditText;
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        greetingTextView = findViewById(R.id.greetingTextView);
        nameEditText = findViewById(R.id.nameEditText);
        returnButton = findViewById(R.id.returnButton);
        String greeting = getIntent().getStringExtra("greeting");
        greetingTextView.setText(greeting);

        returnButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString();
            Intent resultIntent = new Intent();
            resultIntent.putExtra("name", name);
            setResult(RESULT_OK, resultIntent);
            finish();
        });
    }
}