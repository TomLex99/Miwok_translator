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
        ColorList.add(new Word ("red","weṭeṭṭi"));
        ColorList.add(new Word ("green","chokokki"));
        ColorList.add(new Word ("brown","ṭakaakki"));
        ColorList.add(new Word ("gray","ṭopoppi"));
        ColorList.add(new Word ("black","kululli"));
        ColorList.add(new Word ("white","kelelli"));
        ColorList.add(new Word ("dusty yellow","ṭopiisә"));
        ColorList.add(new Word ("mustard yellow","chiwiiṭә"));


        WordAdapter wad=new WordAdapter(this,ColorList);

        ListView mylist = (ListView) findViewById(R.id.rootViewColor);

        mylist.setAdapter(wad);
    }
}
