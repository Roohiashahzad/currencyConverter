package com.currencyconverter.hp.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view)
    {
        EditText inputCurr = (EditText) findViewById(R.id.inputCurr);
        Double dollar = Double.parseDouble(inputCurr.getText().toString());
        Double KWD = dollar*0.34;

        Toast.makeText(MainActivity.this, "KWD" + String.format("%.2f",KWD) , Toast.LENGTH_LONG).show();

        Log.i("text", inputCurr.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
