package com.example.tapiooht.muisti_lista_koti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

CheckBox cb;
EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb= (CheckBox) findViewById(R.id.checkBox);
        text = (EditText) findViewById(R.id.editText);
    }

    public void  checkone(View v)
    {
        if (cb.isChecked())
        {
            text.setText("Valmis lähtemään");
        }
        else
        {
            text.setText("Ei valmis lähtöön");
        }
    }
}
