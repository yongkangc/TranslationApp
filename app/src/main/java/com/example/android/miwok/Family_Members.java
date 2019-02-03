package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Family_Members extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items);
        ArrayList<WordClass> words = new ArrayList<WordClass>();
        words.add(new WordClass("father", "әpә", R.drawable.family_father));
        words.add(new WordClass("mother", "әṭa", R.drawable.family_mother));
        words.add(new WordClass("son", "angsi", R.drawable.family_son));
        words.add(new WordClass("daughter", "tune", R.drawable.family_daughter));
        words.add(new WordClass("older brother", "taachi", R.drawable.family_older_brother));
        words.add(new WordClass("younger brother", "chalitti", R.drawable.family_younger_brother));
        words.add(new WordClass("older sister", "teṭe", R.drawable.family_older_sister));
        words.add(new WordClass("younger sister", "kolliti", R.drawable.family_younger_sister));
        words.add(new WordClass("grandmother ", "ama", R.drawable.family_grandmother));
        words.add(new WordClass("grandfather", "paapa", R.drawable.family_grandfather));


        //Step 2
        // Create an WordAdapter object, whose data source is the list of {@link WordClass}
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);

        // Find the {@link ListView} object which is declared in the activity_numbers.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link WordClass} in the list.
        listView.setAdapter(adapter);
    }
}
