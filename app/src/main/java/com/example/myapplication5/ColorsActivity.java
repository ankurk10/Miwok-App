package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        ArrayList<Color> colors = new ArrayList<Color>();
        colors.add(new Color("red", "weṭeṭṭi", R.drawable.color_red));
        colors.add(new Color("brown", "ṭakaakki", R.drawable.color_brown));
        colors.add(new Color("green", "chokokki", R.drawable.color_green));
        colors.add(new Color("gray", "ṭopoppi", R.drawable.color_gray));
        colors.add(new Color("black", "kululli", R.drawable.color_black));
        colors.add(new Color("white", "kelelli", R.drawable.color_white));
        colors.add(new Color("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        colors.add(new Color("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));





        ColorsAdaptor adapter = new ColorsAdaptor(this,colors);
        ListView listView = findViewById(R.id.list1);
        listView.setAdapter(adapter);

    }
}
