package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Famili_Members extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famili__members);
        this.setTitle("Family");

        ArrayList <Word> FamilyList = new ArrayList<Word>();

FamilyList.add(new Word ("father","әpә"));
        FamilyList.add(new Word ("mother","әṭa"));
        FamilyList.add(new Word ("son","angsi"));
    FamilyList.add(new Word ("daugther","tune"));
        FamilyList.add(new Word ("older brother", "taachi"));
        FamilyList.add(new Word ("younger brother","chilatti"));
        FamilyList.add(new Word ("older sister", "teṭe"));
        FamilyList.add(new Word ("younger sister","kolliti"));
        FamilyList.add(new Word ("grandmother","ama"));
        FamilyList.add(new Word ("grandfather","paapa"));

        WordAdapter wad=new WordAdapter(this,FamilyList);

        ListView mylist = (ListView) findViewById(R.id.rootViewFamily);

        mylist.setAdapter(wad);
    }
}
