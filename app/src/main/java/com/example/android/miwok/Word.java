package com.example.android.miwok;

public class Word {

    private String defaultLanguage;
    private String miWokLanguage;
    private int imageResourceid=NO_IMAGE;
    private static final int NO_IMAGE=-1;
    private int audioResourceID;
    public Word(String defaultWord,String miWokWord,int audio){
        defaultLanguage=defaultWord;
        miWokLanguage=miWokWord;
        audioResourceID=audio;

    }
    public Word(String defaultWord,String miWokWord,int images,int audio){
        defaultLanguage=defaultWord;
        miWokLanguage=miWokWord;
        imageResourceid=images;
        audioResourceID=audio;
    }

public String getDefaultLanguage(){return defaultLanguage;}
public String getMiWokLanguage(){return miWokLanguage;}
public int getImageResourceid(){return imageResourceid;}
public boolean hasImage(){
        return imageResourceid!=NO_IMAGE;
}
public int getAudioResourceID(){return audioResourceID;}
}

