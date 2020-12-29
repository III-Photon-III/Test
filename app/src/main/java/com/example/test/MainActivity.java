package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edExtends = (EditText) findViewById(R.id.ed_extends);

        Button button = (Button) findViewById(R.id.but_ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strED = edExtends.getText().toString();
                if(strED.equalsIgnoreCase("extends")){
                    Intent intent = new Intent(MainActivity.this, Second.class);
                    startActivity(intent);
                }
            }
        });
    }
}