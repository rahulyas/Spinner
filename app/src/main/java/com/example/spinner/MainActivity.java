package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private Spinner spin;
    private TextView textView;
    String[] letter= {"A","B","C","D","E"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin=findViewById(R.id.spinner);
        textView=findViewById(R.id.textview);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter a = new ArrayAdapter(this,android.R.layout.simple_spinner_item,letter);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(a);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),letter[position], Toast.LENGTH_LONG).show();
        String item=letter[position];
        textView.setText(item);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}