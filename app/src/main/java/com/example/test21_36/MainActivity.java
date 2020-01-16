package com.example.test21_36;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void big(View view) {
        ((TextView)findViewById(R.id.textView)).setTextSize(100);
    }
    public void small(View view) {
        ((TextView)findViewById(R.id.textView)).setTextSize(10);
    }
}
