package com.example.myapplication5;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ColorsAdaptor extends ArrayAdapter<Color> {

    public ColorsAdaptor(Activity context, ArrayList<Color> colors) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, colors);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Color currentcolor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView hindiTextView = (TextView) listItemView.findViewById(R.id.hindi_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        hindiTextView.setText(currentcolor.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        englishTextView.setText(currentcolor.getDefaultTranslation());
        ImageView imageView = listItemView.findViewById(R.id.imageView2);
        imageView.setImageResource(currentcolor.getmImageResourceId());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
