package com.example.lessontasks_java;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Task5Activity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task5);
        initViews();
    }

    private void initViews() {
        editText = findViewById(R.id.et_task5);
        textView = findViewById(R.id.tv_task5);
        button = findViewById(R.id.btn_tekshrish);

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String text = String.valueOf(editText.getText());
                        Spannable wordtoSpan = new SpannableString(text);
                        wordtoSpan.setSpan(new ForegroundColorSpan(Color.BLUE), 10, 20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        textView.setText(wordtoSpan);
                    }
                });


    }

}