package com.akbar08.google_loginpage_copy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Kalkulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        EditText inputText1 = findViewById(R.id.editTextInput1);
        EditText inputText2 = findViewById(R.id.editTextInput2);
        Spinner spinnerOperator = findViewById(R.id.spinnerOperator);
        TextView operatorResult = findViewById(R.id.textOperatorOutput);
        Button calculateOperation = findViewById(R.id.calculate_button);

        calculateOperation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String operator = spinnerOperator.getSelectedItem().toString().toLowerCase();
                double input1 = Double.parseDouble(inputText1.getText().toString());
                double input2 = Double.parseDouble(inputText2.getText().toString());
                double result;

                if(inputText1.getText().toString().isEmpty()){
                    TextInputLayout textInput1 = findViewById(R.id.textInputLayout);
                    textInput1.setError("Input is Empty!");
                }
                else if (inputText2.getText().toString().isEmpty()){
                    TextInputLayout textInput2 = findViewById(R.id.textInputLayout2);
                    textInput2.setError("Input is Empty!");
                }

                else {
                    switch (operator){
                        case "addition":
                            result = input1 + input2;
                            operatorResult.setText(String.valueOf(result));
                            break;
                        case "subtraction":
                            result = input1 - input2;
                            operatorResult.setText(String.valueOf(result));
                            break;
                        case "multiplication":
                            result = input1 * input2;
                            operatorResult.setText(String.valueOf(result));
                            break;
                        case "division":
                            result = input1 / input2;
                            operatorResult.setText(String.valueOf(result));
                            break;
                        default:
                            break;
                    }
                }
            }
        });
    }
}