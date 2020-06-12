package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Family> familyname = new ArrayList<Family>();
        familyname.add(new Family("father", "әpә", R.drawable.family_father));
        familyname.add(new Family("mother", "әṭa", R.drawable.family_mother));
        familyname.add(new Family("son", "angsi", R.drawable.family_son));
        familyname.add(new Family("daugter", "tune", R.drawable.family_daughter));
        familyname.add(new Family("older brother", "taachi", R.drawable.family_older_brother));
        familyname.add(new Family("younger brother", "chalitti", R.drawable.family_younger_brother));
        familyname.add(new Family("older sister", "teṭe", R.drawable.family_older_sister));
        familyname.add(new Family("younger sister", "kolliti", R.drawable.family_younger_sister));
        familyname.add(new Family("grandmother", "ama", R.drawable.family_grandmother));
        familyname.add(new Family("grandfather", "paapa", R.drawable.family_grandfather));








        FamilyAdapter adapter = new FamilyAdapter(this,familyname);
        ListView listView = findViewById(R.id.list2);
        listView.setAdapter(adapter);



    }
}
