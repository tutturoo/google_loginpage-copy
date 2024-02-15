package com.akbar08.google_loginpage_copy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class PasswordAttemptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_attempt);

        Button passwordNextButton = (Button)findViewById(R.id.password_next_button);
        String password = "qwerty123";
        EditText passwordAttempt = findViewById(R.id.editTextPassword);
        TextInputLayout errorAttempt = (TextInputLayout) findViewById(R.id.passwordBox);

        passwordNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PasswordAttemptActivity.this, Kalkulator.class);

                if( !(passwordAttempt.getText().toString().equals(password)) ){
                    errorAttempt.setError("Password is incorrect! Please try again!");
                }
                else {
                    startActivity(intent);
                }
            }
        });
    }
}