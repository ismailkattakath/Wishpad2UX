package com.etuper.wishpad.wishpad2ux;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.pkmmte.view.CircularImageView;

public class CategoryAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] catTitle;
    private final Integer[] catImage;
    public CategoryAdapter(Activity context, String[] name, Integer[] imageId) {
        super(context, R.layout.category_item, name);
        this.context = context;
        this.catTitle = name;
        this.catImage = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.category_item, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.categoryTitle);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.categoryImage);
        txtTitle.setText(catTitle[position]);

        imageView.setImageResource(catImage[position]);
        return rowView;
    }
}