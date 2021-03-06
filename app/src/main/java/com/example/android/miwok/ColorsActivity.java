package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translation_list);

        //ArrayList of strings for numbers words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.color_red, "red", "weṭeṭṭi"));
        words.add(new Word(R.drawable.color_green, "green", "chokokki"));
        words.add(new Word(R.drawable.color_brown, "brown", "ṭakaakki"));
        words.add(new Word(R.drawable.color_gray, "gray", "ṭopoppi"));
        words.add(new Word(R.drawable.color_black, "black", "kululli"));
        words.add(new Word(R.drawable.color_white, "white", "kelelli"));
        words.add(new Word(R.drawable.color_dusty_yellow, "dusty yellow", "ṭopiisә"));
        words.add(new Word(R.drawable.color_mustard_yellow, "mustard yellow", "chiwiiṭә"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // translation_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.activity_numbers);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }

}
