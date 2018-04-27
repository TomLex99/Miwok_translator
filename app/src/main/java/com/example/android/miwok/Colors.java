package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        this.setTitle("Colors");

        ArrayList <Word>  ColorList= new ArrayList<Word>();
        ColorList.add(new Word (R.raw.number_one,"red","weṭeṭṭi",R.drawable.color_red));
        ColorList.add(new Word (R.raw.number_one,"green","chokokki",R.drawable.color_green));
        ColorList.add(new Word (R.raw.number_one,"brown","ṭakaakki",R.drawable.color_brown));
        ColorList.add(new Word (R.raw.number_one,"gray","ṭopoppi",R.drawable.color_gray));
        ColorList.add(new Word (R.raw.number_one,"black","kululli",R.drawable.color_black));
        ColorList.add(new Word (R.raw.number_one,"white","kelelli",R.drawable.color_white));
        ColorList.add(new Word (R.raw.number_one,"dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        ColorList.add(new Word (R.raw.number_one,"mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));


        WordAdapter wad=new WordAdapter(this,ColorList);

        ListView mylist = (ListView) findViewById(R.id.rootViewColor);

        mylist.setAdapter(wad);
    }
}
