package com.example.c3_luigi_llerena;

import static com.example.c3_luigi_llerena.R.id.btn_reset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtCounter = findViewById(R.id.txt_view);
        Button add = findViewById(R.id.btn_counter);
        Button delete = findViewById(R.id.btn_reset);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                txtCounter.setText(count+"");

            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                txtCounter.setText(count+"");
            }
        });
    }
}