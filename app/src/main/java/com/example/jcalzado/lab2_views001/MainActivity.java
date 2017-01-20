package com.example.jcalzado.lab2_views001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inField1;
    private EditText inField2;
    private TextView outField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inField1 = (EditText) findViewById(R.id.editText1);
        inField2 = (EditText) findViewById(R.id.editText2);
        outField = (TextView) findViewById(R.id.textView);
    }

    public void sumar (View view) {
        int numero1 = Integer.parseInt(inField1.getText().toString());
        int numero2 = Integer.parseInt(inField2.getText().toString());
        outField.setText(String.valueOf(numero1+numero2));
        //outField.setText(suma.toString());
    }
}
