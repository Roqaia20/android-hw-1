package com.example.mycw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.name2);
        EditText age = findViewById(R.id.age);
        Button next = findViewById(R.id.next);
        Intent in = new Intent(MainActivity.this,MainActivity2.class);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String na = name.getText().toString();
                String ag = age.getText().toString();
                in.putExtra("something" , na);
                in.putExtra("something2" , ag);
                startActivity(in);




            }
        });

    }

}









