package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button btnOK;
    private EditText edit1;
    private EditText edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnOK = (Button) findViewById(R.id.btnOK);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });
    }

    public void openSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        String data1 =  edit1.getText().toString();
        String data2 = edit2.getText().toString();

        intent.putExtra("A", data1);
        intent.putExtra("B", data2);
        startActivity(intent);
        finish();

        Context context = getApplicationContext();
        CharSequence meaasge = "Sending Message...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, meaasge, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 270, 1400);
        toast.show();

    }
}
