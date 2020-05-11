package com.example.countrycode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText Ccode,Cname;
    Button Csubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ccode=findViewById(R.id.code);
        Cname=findViewById(R.id.name);
        Csubmit=findViewById(R.id.sumbit);

        Ccode.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        Csubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=Ccode.getText().toString();
                Locale l = new Locale("", value);
                String country = l.getDisplayCountry();
                Cname.setText(country);
            }
        });
    }
}
