package com.example.myhw;

import androidx.appcompat.app.AppCompatActivity;

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

        EditText number1 = findViewById(R.id.Quizes);
        EditText number2 = findViewById(R.id.Homework);
        EditText number3 = findViewById(R.id.Midtems);
        EditText number4 = findViewById(R.id.Final);
        Button calc = findViewById(R.id.caloulate);
        TextView result = findViewById(R.id.result);




        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first = Integer.parseInt(number1.getText().toString());
                int second = Integer.parseInt(number2.getText().toString());
                int second1 = Integer.parseInt(number3.getText().toString());
                int finaly = Integer.parseInt(number4.getText().toString());
                int total = first + second + second1 + finaly;
                result.setText( ""+total);
                number1.setText(null);
                number2.setText(null);
                number3.setText(null);
                number4.setText(null);











            }
        });
    }
}