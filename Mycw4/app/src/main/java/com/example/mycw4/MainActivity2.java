package com.example.mycw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle r = getIntent().getExtras();
        String Thesomething = r.getString("something");
        String Thesomething2 = r.getString("something2");
        TextView bag = findViewById(R.id.textView);
        TextView bag2 = findViewById(R.id.textView2);
        bag.setText(Thesomething);
        bag2.setText(Thesomething2);



            }


    }



