package com.example.madprework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = ((TextView)findViewById(R.id.textView2)).getCurrentTextColor();
                if(color == getColor(R.color.colorWhite)) {
                    color = R.color.colorRed;
                } else {
                    color = R.color.colorWhite;
                }

                ((TextView)findViewById(R.id.textView2)).setTextColor(
                        getResources().getColor(color)
                );
            }
        });
    }
}