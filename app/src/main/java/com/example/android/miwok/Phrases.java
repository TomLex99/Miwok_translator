package com.example.android.miwok;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


public class Phrases extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        this.setTitle("Phrases");

        ArrayList<Word> PhrasesList = new ArrayList <Word>();

        PhrasesList.add(new Word("Where are you going?","mintp wukusu"));
        PhrasesList.add(new Word ("What is your Name?", "tinnә oyaase'nә"));
        PhrasesList.add(new Word ("My name is ... ", "oyaaset ... "));
        PhrasesList.add(new Word ("How are you feeling?","michәksәs?"));
        PhrasesList.add(new Word ("I'm feeling good.", "Kuchi achit"));
        PhrasesList.add(new Word ("Are you comming?","әәnәs'aa?"));
        PhrasesList.add(new Word ("Yes , I'm comming.","hәә’ әәnәm"));
        PhrasesList.add(new Word ("I'm comming", "әәnәm"));
        PhrasesList.add(new Word ("Let's go.","yoowutis"));
        PhrasesList.add(new Word ("Come here","әnni'nem"));

        WordAdapter wad=new WordAdapter(this,PhrasesList);

        ListView mylist = (ListView) findViewById(R.id.rootViewPhrases);

        mylist.setAdapter(wad);




    }
}
