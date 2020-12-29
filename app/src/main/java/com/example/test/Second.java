package com.example.test;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        CheckBox chB_public = (CheckBox) findViewById(R.id.chB_public);
        CheckBox chB_defalt = (CheckBox) findViewById(R.id.chB_defalt);
        CheckBox chB_private = (CheckBox) findViewById(R.id.chB_private);
        CheckBox chB_protected = (CheckBox) findViewById(R.id.chB_protected);

        TextView text_main = (TextView) findViewById(R.id.text_main);

        Button button = (Button) findViewById(R.id.button_ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chB_protected.isChecked() & chB_public.isChecked() & ! chB_defalt.isChecked() & ! chB_private.isChecked()){
                    text_main.setText("Молодец ты всё выполнил");
                }
            }
        });
    }
}