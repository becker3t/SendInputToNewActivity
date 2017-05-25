package com.example.android.inputuiexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv = (TextView) findViewById(R.id.input_TV);

        tv.setText(getIntent().getExtras().getString("input"));
    }

    public void BackToMain(View view) {
        Intent i = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(i);
    }
}
