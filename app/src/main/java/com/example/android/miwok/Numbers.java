package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;



public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        this.setTitle("Numbers");
        ArrayList <Word> Numbers_list = new ArrayList <Word>();



       Numbers_list.add( new Word("one","lutti"));
        Numbers_list.add( new Word("two","otiiko"));
        Numbers_list.add( new Word("three","tolookosu"));
        Numbers_list.add( new Word("four","oyyisa"));
        Numbers_list.add( new Word("five","massokka"));
        Numbers_list.add( new Word("six","temmokka"));
        Numbers_list.add( new Word("seven","kenekaku"));
        Numbers_list.add( new Word("eight","kawinta"));
        Numbers_list.add( new Word("nine","wo'e"));
        Numbers_list.add( new Word("ten","na'aacha"));



       WordAdapter wad=new WordAdapter(this,Numbers_list);

       ListView mylist = (ListView) findViewById(R.id.rootViewNumber);

        mylist.setAdapter(wad);

    }




}
