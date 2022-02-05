package com.example.lessontasks_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    double USD = 10820;
    double sum;
    EditText editText1, editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        editText1 = findViewById(R.id.et_one);
        editText2 = findViewById(R.id.et_two);
        button = findViewById(R.id.btn_one);


        editText1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                button.setEnabled(!editText1.getText().toString().isEmpty());
                String number = editText1.getText().toString();
                if (number.isEmpty()){
                    editText2.setText("");
                }
                else {
                    double sum = Double.valueOf(editText1.getText().toString())/USD;
                    editText2.setText(sum+"");
                }
                return false;
            }
        });

        editText2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
//                button.setEnabled(!editText2.getText().toString().isEmpty());
                String lbs = editText2.getText().toString();
                if (lbs.isEmpty()){
                    editText1.setText("");
                }
                else {
                    double sum = Double.valueOf(editText2.getText().toString())*USD;
                    editText1.setText(sum+"");
                }
                return false;
            }


        });

        Button button = findViewById(R.id.btn_task4);
        Button button1 = findViewById(R.id.btn_task5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSeconActivity();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTask5Activity();
            }
        });
    }

    public void openSeconActivity(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    public  void openTask5Activity(){
        Intent intent = new Intent(this,Task5Activity.class);
        startActivity(intent);
    }
}