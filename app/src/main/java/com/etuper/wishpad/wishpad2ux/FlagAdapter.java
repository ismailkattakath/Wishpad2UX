package com.etuper.wishpad.wishpad2ux;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FlagAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] flagTitle;
    private final Integer[] flagImage;
    public FlagAdapter(Activity context, String[] name, Integer[] imageId) {
        super(context, R.layout.single_category_card, name);
        this.context = context;
        this.flagTitle = name;
        this.flagImage = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.single_flag_card, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.flagTitle);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.flagImage);
        txtTitle.setText(flagTitle[position]);

        imageView.setImageResource(flagImage[position]);
        return rowView;
    }
}