package com.example.lessontasks_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class SecondActivity extends AppCompatActivity {

    private int charactersLeft = 256;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
    }

    private void initViews() {
        TextInputLayout inputLayout = findViewById(R.id.til_text);
        TextInputEditText inputEditText = findViewById(R.id.inputEdit_text);

        inputEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charactersLeft==1){
                    inputLayout.setHint(null);
                }else {
                    inputLayout.setHint((charactersLeft-1)+"character left");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}