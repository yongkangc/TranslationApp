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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the ac66tivity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //numbers
        TextView numberbutton = (TextView) findViewById(R.id.numbers);
        numberbutton.setOnClickListener(NumberClickListener);

        //Phrases
        TextView phrasebutton = (TextView) findViewById(R.id.phrases);
        phrasebutton.setOnClickListener(phrasesClickListener);
        //Family
        TextView familybutton = (TextView) findViewById(R.id.family);
        familybutton.setOnClickListener(familyClickListener);
        //Colors
        TextView colorsbutton = (TextView) findViewById(R.id.colors);
        colorsbutton.setOnClickListener(ColorsClickListener);
    }



    // Create an anonymous implementation of OnClickListener
    private OnClickListener NumberClickListener = new OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,Numbers.class);
            startActivity(intent);
            // do something when the button is clicked
        }
    };

    private OnClickListener phrasesClickListener = new OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,Phrases.class);
            startActivity(intent);
            // do something when the button is clicked
        }
    };
    private OnClickListener familyClickListener = new OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,Family_Members.class);
            startActivity(intent);
            // do something when the button is clicked
        }
    };
    private OnClickListener ColorsClickListener = new OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,Colors.class);
            startActivity(intent);
            // do something when the button is clicked
        }
    };


}
