package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Srivignesh on 22-02-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int colorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        this.colorResourceId = color;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word word = getItem(position);
        ImageView image = (ImageView) listItemView.findViewById(R.id.imageMiwok);
        if (word.getImageId() == 0) {
            image.setVisibility(View.GONE);
        } else {
            image.setImageResource(word.getImageId());
        }

        View container = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        container.setBackgroundColor(color);

        TextView defaultranslation = (TextView) listItemView.findViewById(R.id.englishName);
        defaultranslation.setText(word.getDefaultTranslation());

        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwokName);
        miwokTranslation.setText(word.getMiwokTranslation());


        return listItemView;
    }
}
