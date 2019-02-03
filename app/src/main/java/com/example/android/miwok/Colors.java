/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items);

        // Create a list of words
        ArrayList<WordClass> words = new ArrayList<WordClass>();
        words.add(new WordClass("red", "weṭeṭṭi",R.drawable.color_red));
        words.add(new WordClass("mustard yellow", "chiwiiṭә",R.drawable.color_mustard_yellow));
        words.add(new WordClass("dusty yellow", "ṭopiisә",R.drawable.color_dusty_yellow));
        words.add(new WordClass("green", "chokokki",R.drawable.color_green));
        words.add(new WordClass("brown", "ṭakaakki",R.drawable.color_brown));
        words.add(new WordClass("gray", "ṭopoppi",R.drawable.color_gray));
        words.add(new WordClass("black", "kululli",R.drawable.color_black));
        words.add(new WordClass("white", "kelelli",R.drawable.color_white));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        //set background

    }
}
