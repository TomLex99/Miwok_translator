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

FamilyList.add(new Word ("father","әpә",R.drawable.family_father));
        FamilyList.add(new Word ("mother","әṭa",R.drawable.family_mother));
        FamilyList.add(new Word ("son","angsi",R.drawable.family_son));
    FamilyList.add(new Word ("daugther","tune",R.drawable.family_daughter));
        FamilyList.add(new Word ("older brother", "taachi",R.drawable.family_older_brother));
        FamilyList.add(new Word ("younger brother","chilatti",R.drawable.family_younger_brother));
        FamilyList.add(new Word ("older sister", "teṭe",R.drawable.family_older_sister));
        FamilyList.add(new Word ("younger sister","kolliti",R.drawable.family_younger_sister));
        FamilyList.add(new Word ("grandmother","ama",R.drawable.family_grandmother));
        FamilyList.add(new Word ("grandfather","paapa",R.drawable.family_grandfather));

        WordAdapter wad=new WordAdapter(this,FamilyList);

        ListView mylist = (ListView) findViewById(R.id.rootViewFamily);

        mylist.setAdapter(wad);
    }
}
