package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items);


        //Step 1
        //initialize a WordCLass object and add it into the list aka create a word list that is type WordClass
        ArrayList<WordClass> words = new ArrayList<WordClass>();
        words.add(new WordClass("one", "lutti", R.drawable.number_one));
        words.add(new WordClass("two", "otiiko",R.drawable.number_two));
        words.add(new WordClass("three", "tolookosu",R.drawable.number_three));
        words.add(new WordClass("four", "oyyisa",R.drawable.number_four));
        words.add(new WordClass("five", "massokka",R.drawable.number_five));
        words.add(new WordClass("six", "temmokka",R.drawable.number_six));
        words.add(new WordClass("seven", "kenekaku",R.drawable.number_seven));
        words.add(new WordClass("eight", "kawinta",R.drawable.number_eight));
        words.add(new WordClass("nine", "wo’e",R.drawable.number_nine));
        words.add(new WordClass("ten", "na’aacha",R.drawable.number_ten));

        //Step 2
        // Create an WordAdapter object, whose data source is the list of {@link WordClass}
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_numbers);

        // Find the {@link ListView} object which is declared in the activity_numbers.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link WordClass} in the list.
        listView.setAdapter(adapter);

//        ArrayAdapter<WordClass> itemsAdapter =
//                new ArrayAdapter<WordClass>(this, android.R.layout.activity_list_item, words);
//
//        ListView gridView = (ListView) findViewById(R.id.list);
//
//        gridView.setAdapter(itemsAdapter);

//        // Verify the contents of the list by printing out each element to the logs
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
//        Log.v("NumbersActivity", "Word at index 1: " + words.get(1));
//        Log.v("NumbersActivity", "Word at index 2: " + words.get(2));
//        Log.v("NumbersActivity", "Word at index 3: " + words.get(3));
//        Log.v("NumbersActivity", "Word at index 4: " + words.get(4));
//        Log.v("NumbersActivity", "Word at index 5: " + words.get(5));
//        Log.v("NumbersActivity", "Word at index 6: " + words.get(6));
//        Log.v("NumbersActivity", "Word at index 7: " + words.get(7));
//        Log.v("NumbersActivity", "Word at index 8: " + words.get(8));
//        Log.v("NumbersActivity", "Word at index 9: " + words.get(9));





    }


}
