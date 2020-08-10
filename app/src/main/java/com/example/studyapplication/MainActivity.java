package com.example.studyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //widgetBasicExample();
        widgetOptionExample();
    }


    //뷰에 대한 전반적인 예제
    public void widgetBasicExample() {
        setContentView(R.layout.widget_basic1);
        setContentView(R.layout.widget_basic2);
        setContentView(R.layout.widget_basic3);
        setContentView(R.layout.widget_basic_exam);
    }

    //위젯 예제
    public void widgetOptionExample() {
        setContentView(R.layout.widget_option);
        setContentView(R.layout.widget_xml_option);
        textviewSet();
    }

    private void textviewSet() {
        TextView tv1, tv2, tv3;
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);

        tv1.setText("안녕하세요");
        tv1.setTextColor(Color.RED);
        tv2.setTextSize(30);
        tv2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);
        tv3.setText("가나다라마바사자아자나바자");
        tv3.setSingleLine(true);
    }
}