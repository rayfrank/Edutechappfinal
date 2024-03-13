package com.example.edutechappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public Button LoginButton;
    public EditText EmailEditText;
    public EditText PasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginButton = findViewById(R.id.button);
        EmailEditText = findViewById(R.id.editTextTextEmailAddress);
        PasswordEditText = findViewById(R.id.editTextTextPassword);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = EmailEditText.getText().toString();
                String password = PasswordEditText.getText().toString();
                Login(email, password);
            }
        });
    }

    public void Login(String email, String password) {
        if (email.equals("nampiima.rebecca11") && password.equals("12345678")) {
            Intent intent = new Intent(this, Dashboard.class);
            startActivity(intent);
        }
    }
}
