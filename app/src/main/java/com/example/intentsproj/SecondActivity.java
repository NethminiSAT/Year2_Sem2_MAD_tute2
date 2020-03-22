package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText edit3 = findViewById(R.id.edit3);
        EditText edit4 = findViewById(R.id.edit4);

        Button btnadd = findViewById(R.id.btnadd);
        Button btnsub = findViewById(R.id.btnsub);
        Button btnmulti = findViewById(R.id.btnmulti);
        Button btndiv = findViewById(R.id.btndiv);

        Bundle bundle = getIntent().getExtras();
        String data1 = bundle.getString("A");
        String data2 = bundle.getString("B");
        edit3.setText(String.valueOf(data1));
        edit4.setText(String.valueOf(data2));

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Addition();
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Substraction();
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiplication();
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Divition();
            }
        });
    }

    public void Addition(){
        EditText edit3 = findViewById(R.id.edit3);
        EditText edit4 = findViewById(R.id.edit4);
        TextView display = findViewById(R.id.display);

        int number1 = Integer.parseInt(edit3.getText().toString());
        int number2 = Integer.parseInt(edit4.getText().toString());
        int result = number1 + number2;
        display.setText(String.valueOf(number1) + " + " + String.valueOf(number2) + " = " + String.valueOf(result));
    }

    public void Substraction(){
        EditText edit3 = findViewById(R.id.edit3);
        EditText edit4 = findViewById(R.id.edit4);
        TextView display = findViewById(R.id.display);

        int number1 = Integer.parseInt(edit3.getText().toString());
        int number2 = Integer.parseInt(edit4.getText().toString());
        int result = number1 - number2;
        display.setText(String.valueOf(number1) + " - " + String.valueOf(number2) + " = " + String.valueOf(result));

    }
    public void Multiplication(){
        EditText edit3 = findViewById(R.id.edit3);
        EditText edit4 = findViewById(R.id.edit4);
        TextView display = findViewById(R.id.display);

        int number1 = Integer.parseInt(edit3.getText().toString());
        int number2 = Integer.parseInt(edit4.getText().toString());
        int result = number1 * number2;
        display.setText(String.valueOf(number1) + " * " + String.valueOf(number2) + " = " + String.valueOf(result));

    }
    public void Divition(){
        EditText edit3 = findViewById(R.id.edit3);
        EditText edit4 = findViewById(R.id.edit4);
        TextView display = findViewById(R.id.display);

        int number1 = Integer.parseInt(edit3.getText().toString());
        int number2 = Integer.parseInt(edit4.getText().toString());
        int result = number1 / number2;
        display.setText(String.valueOf(number1) + " / " + String.valueOf(number2) + " = " + String.valueOf(result));

    }
}
