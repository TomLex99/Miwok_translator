package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.lits_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word TheItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_txt);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(TheItem.getMiwok_word());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.english_txt);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(TheItem.getDefault_word());

    // Find the ImageView in the list_item.xml layout with the ID list_item_icon
    ImageView iconView = (ImageView) listItemView.findViewById(R.id.displayed_Image);
    // Get the image resource ID from the current AndroidFlavor object and
    // set the image to iconView


        // checks if imageis Exsisteing

        if (TheItem.getImageStatus()==false) {
           iconView.setVisibility(View.GONE);
        }

        else {
            iconView.setImageResource(TheItem.getID());
        }


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

    public WordAdapter(Activity context, ArrayList<Word> mywords){
super(context, 0 ,mywords);
    }
}
