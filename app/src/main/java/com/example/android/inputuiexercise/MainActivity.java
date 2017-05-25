package com.example.android.inputuiexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultTV;
    private EditText inputET;
//    private Button submitBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTV = (TextView) findViewById(R.id.result_tv);
        inputET = (EditText) findViewById(R.id.input_et);
//        submitBT = (Button) findViewById(R.id.submit_bt);
    }

    private void setResult(String result) {
        resultTV.setText(result);
    }

    private String retrieveText() {
        return inputET.getText().toString();
    }

    public void submitOnClick(View view) {
        setResult(retrieveText());

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("input", retrieveText());
        startActivity(intent);
    }
}
