package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Phrases> words = new ArrayList<Phrases>();
        words.add(new Phrases("Where are you going?", "minto wuksus"));
        words.add(new Phrases("What is your name?", "tinnә oyaase'nә"));
        words.add(new Phrases("My name is...", "oyaaset..."));
        words.add(new Phrases("How are you feeling?", "michәksәs?"));
        words.add(new Phrases("I’m feeling good.", "kuchi achit"));
        words.add(new Phrases("Are you coming?", "әәnәs'aa?"));
        words.add(new Phrases("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Phrases("I’m coming.", "әәnәm"));
        words.add(new Phrases("Let’s go.", "yoowutis"));
        words.add(new Phrases("Come here.", "әnni'nem"));








        PhrasesAdapter adapter = new PhrasesAdapter(this,words);
        ListView listView = findViewById(R.id.list4);
        listView.setAdapter(adapter);

    }
}
