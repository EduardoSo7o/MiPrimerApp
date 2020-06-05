package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv = (TextView)findViewById(R.id.txt_result);
    }

    public void addition(View view){
        String value1 = et1.getText().toString();
        String value2 = et2.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);

        int addition = num1 + num2;

        String result = String.valueOf(addition);

        tv.setText(result);
    }
}