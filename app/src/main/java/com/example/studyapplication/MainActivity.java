package com.example.studyapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        widgetBasicExample();
    }


    public void widgetBasicExample() {
        setContentView(R.layout.widget_basic1);
        setContentView(R.layout.widget_basic2);
        setContentView(R.layout.widget_basic3);
        setContentView(R.layout.widget_basic_exam);
    }
}