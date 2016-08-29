package com.example.ativbook62014ed.ahang01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton btn_search;
    private ImageButton btn_record;

    void init(){
        btn_search = (ImageButton) findViewById(R.id.iv_search);
        btn_record = (ImageButton) findViewById(R.id.iv_record);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btn_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Record.class);
                startActivity(intent);
            }
        });

    }
}