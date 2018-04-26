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



       Numbers_list.add( new Word("one","lutti",R.drawable.number_one));
        Numbers_list.add( new Word("two","otiiko",R.drawable.number_two));
        Numbers_list.add( new Word("three","tolookosu",R.drawable.number_three));
        Numbers_list.add( new Word("four","oyyisa",R.drawable.number_four));
        Numbers_list.add( new Word("five","massokka",R.drawable.number_five));
        Numbers_list.add( new Word("six","temmokka",R.drawable.number_six));
        Numbers_list.add( new Word("seven","kenekaku",R.drawable.number_seven));
        Numbers_list.add( new Word("eight","kawinta",R.drawable.number_eight));
        Numbers_list.add( new Word("nine","wo'e",R.drawable.number_nine));
        Numbers_list.add( new Word("ten","na'aacha",R.drawable.number_ten));



       WordAdapter wad=new WordAdapter(this,Numbers_list);

       ListView mylist = (ListView) findViewById(R.id.rootViewNumber);

        mylist.setAdapter(wad);

    }




}
