package com.example.student.przelicznik;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    //DecimalFormat usaDf = new DecimalFormat("###,###,###,###.##");
    private Button przelicz;
    private Button wyczysc;
    private EditText PLN;
    private EditText USD;

    private final double PLNnaUSD = 4.5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PLN = (EditText) findViewById(R.id.PLNwej);
        USD = (EditText) findViewById(R.id.USDwyj);

        wyczysc = (Button) findViewById(R.id.Wyczysc);
        wyczysc.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                PLN.setText("");
                USD.setText("");
            }
        });

        przelicz = (Button) findViewById(R.id.Przelicz);
        przelicz.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String PLNStr = PLN.getText().toString();
                    double pln = Double.parseDouble(PLNStr);
                    String usd = String.valueOf(pln / PLNnaUSD);
                    USD.setText(usd);
                } catch (NumberFormatException e) {
                }
            }

        });


    }
}