package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;



public class Numbers extends AppCompatActivity {
   MediaPlayer mp;

   ListView mylist;
    WordAdapter wad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        this.setTitle("Numbers");
        final ArrayList<Word> Numbers_list = new ArrayList<Word>();

        Numbers_list.add(new Word(R.raw.number_one, "one", "lutti", R.drawable.number_one));
        Numbers_list.add(new Word(R.raw.number_two, "two", "otiiko", R.drawable.number_two));
        Numbers_list.add(new Word(R.raw.number_three, "three", "tolookosu", R.drawable.number_three));
        Numbers_list.add(new Word(R.raw.number_four, "four", "oyyisa", R.drawable.number_four));
        Numbers_list.add(new Word(R.raw.number_five, "five", "massokka", R.drawable.number_five));
        Numbers_list.add(new Word(R.raw.number_six, "six", "temmokka", R.drawable.number_six));
        Numbers_list.add(new Word(R.raw.number_seven, "seven", "kenekaku", R.drawable.number_seven));
        Numbers_list.add(new Word(R.raw.number_eight, "eight", "kawinta", R.drawable.number_eight));
        Numbers_list.add(new Word(R.raw.number_nine, "nine", "wo'e", R.drawable.number_nine));
        Numbers_list.add(new Word(R.raw.number_ten, "ten", "na'aacha", R.drawable.number_ten));

        mp = MediaPlayer.create(this,R.raw.number_ten);

        wad = new WordAdapter(this, Numbers_list);

        mylist = (ListView) findViewById(R.id.rootViewNumber);

        mylist.setAdapter(wad);

        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



TextView tmp =  (TextView) mylist.getChildAt(position).findViewById(R.id.miwok_txt);
String miko= tmp.getText().toString();




if(miko.equals("lutti")) {

    try {
        mp.setDataSource(new FileInputStream("/sdcard/raw/number_two.mp3").getFD());
        mp.prepare();
        Toast.makeText(Numbers.this, "g", Toast.LENGTH_SHORT).show();
    } catch (IOException e) {
        e.printStackTrace();
    }

}
    else if(miko.equals("otiiko")){
    try {
        mp.setDataSource(new FileInputStream("/sdcard/raw/number_two.mp3").getFD());
        mp.prepare();
        mp.start();
        Toast.makeText(Numbers.this, "dsfdf", Toast.LENGTH_SHORT).show();
    } catch (IOException e) {
        e.printStackTrace();
    }

}

       else if(miko.equals("tolookosu")) {
            try {
                mp.setDataSource("raw/number_three.mp3");
            } catch (IOException e) {
                e.printStackTrace();
            }

}

mp.start();


            }});
    }}

