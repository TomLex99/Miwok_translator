package com.example.android.miwok;

public class Word {
    private String default_word,miwok_word;

    public Word (String default_word, String miwok_word){
        this.default_word=default_word;
        this.miwok_word=miwok_word;
    }

    public String getDefault_word() {
        return default_word;
    }

public void setDefault_word(String default_word){
    this.default_word=default_word;
    }

    public String getMiwok_word() {
        return miwok_word;
    }

    public void setMiwok_word(String miwok_word) {
        this.miwok_word = miwok_word;
    }
}