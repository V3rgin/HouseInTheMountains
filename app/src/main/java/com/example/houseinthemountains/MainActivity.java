package com.example.houseinthemountains;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    private TextView text;
    private Button btPolub;
    private Button btUsun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        btPolub = findViewById(R.id.Polub);
        btUsun = findViewById(R.id.Usun);

        btPolub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterPlus();
            }
        });
        btUsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterMinus();
            }
        });
    }

    @SuppressLint("SetTextI18n")
    public void counterPlus(){
        counter++;
        text.setText(counter + " polubien");
    }
    @SuppressLint("SetTextI18n")
    public void counterMinus(){
        if(counter != 0) {
            counter--;
            text.setText(counter + " polubien");
        } else {
            Toast.makeText(MainActivity.this, "Polubienia nie mogą być mniejsze niż 0", Toast.LENGTH_SHORT).show();
        }
    }
}