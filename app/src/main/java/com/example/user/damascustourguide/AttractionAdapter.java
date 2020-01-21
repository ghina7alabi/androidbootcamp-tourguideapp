package com.example.user.damascustourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 29-Jun-18.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private int mColorResourceId;


    public AttractionAdapter(Context context, ArrayList<Attraction> attractions, int colorResourceId) {
        super(context, 0, attractions);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.attraction_list, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        TextView title_textview = listItemView.findViewById(R.id.title_textview);
        title_textview.setText(currentAttraction.getTitle());


        TextView defaultTextView = listItemView.findViewById(R.id.description_textview);
        defaultTextView.setText(currentAttraction.getDescription());

        ImageView imageView =  listItemView.findViewById(R.id.image);

        if (currentAttraction.hasImage()) {
            imageView.setImageResource(currentAttraction.getImage());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.item_per_row);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
