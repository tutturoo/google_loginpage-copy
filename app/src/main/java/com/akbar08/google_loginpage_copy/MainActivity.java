package com.akbar08.google_loginpage_copy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_attempt_screen);

        Button emailNextButton = (Button)findViewById(R.id.email_next_button);
        String email = "r.aaron@gmail.com";
        EditText emailAttempt = findViewById(R.id.editTextEmail);
        TextInputLayout errorAttempt = (TextInputLayout) findViewById(R.id.emailBox);

        emailNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PasswordAttemptActivity.class);

                if( !(emailAttempt.getText().toString().equals(email)) ){
                    errorAttempt.setError("Email is incorrect! Please try again!");
                }
                else {
                    startActivity(intent);
                }
            }
        });
    }
}