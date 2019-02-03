package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items);
        ArrayList<WordClass> words = new ArrayList<WordClass>();
        words.add(new WordClass("one", "lutti"));
        words.add(new WordClass("two", "otiiko"));
        words.add(new WordClass("three", "tolookosu"));
        words.add(new WordClass("four", "oyyisa"));
        words.add(new WordClass("five", "massokka"));
        words.add(new WordClass("six", "temmokka"));
        words.add(new WordClass("seven", "kenekaku"));
        words.add(new WordClass("eight", "kawinta"));
        words.add(new WordClass("nine", "wo’e"));
        words.add(new WordClass("ten", "na’aacha"));

        //Step 2
        // Create an WordAdapter object, whose data source is the list of {@link WordClass}
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrases);

        // Find the {@link ListView} object which is declared in the activity_numbers.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link WordClass} in the list.
        listView.setAdapter(adapter);



        }
    }

