package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.ServiceTestCase;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList <Word> English_Numbers = new ArrayList <Word>();


        English_Numbers.add( new Word("one","lutti"));
        English_Numbers.add( new Word("two","otiiko"));
        English_Numbers.add( new Word("three","tolookosu"));
        English_Numbers.add( new Word("four","oyyisa"));
        English_Numbers.add( new Word("five","massokka"));
        English_Numbers.add( new Word("six","temmokka"));
        English_Numbers.add( new Word("seven","kenekaku"));
        English_Numbers.add( new Word("eight","kawinta"));
        English_Numbers.add( new Word("nine","wo'e"));
        English_Numbers.add( new Word("ten","na'aacha"));



       WordAdapter wad=new WordAdapter(this,English_Numbers);

       ListView mylist = (ListView) findViewById(R.id.rootViewNumber);

        mylist.setAdapter(wad);

    }




}
