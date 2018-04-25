package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.ServiceTestCase;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList <String> English_Numbers = new ArrayList <String>();

        English_Numbers.add("one");
        English_Numbers.add("two");
        English_Numbers.add("three");
        English_Numbers.add("four");
        English_Numbers.add("five");
        English_Numbers.add("six");
        English_Numbers.add("seven");
        English_Numbers.add("eight");
        English_Numbers.add("nine");
        English_Numbers.add("ten");

        LinearLayout rootViewNumber = (LinearLayout)findViewById(R.id.rootViewNumber);

        for (int run=0;run<English_Numbers.size();run++) {
            TextView wordView = new TextView(this);
            wordView.setText(English_Numbers.get(run));
            rootViewNumber.addView(wordView);
        }
    }




}
