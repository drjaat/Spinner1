package com.example.drjaatpc.spinner1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class spinner extends AppCompatActivity {
    Spinner spinner;
    String arr[] = {"select","c","c++","java","Python","R"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
    }
}
