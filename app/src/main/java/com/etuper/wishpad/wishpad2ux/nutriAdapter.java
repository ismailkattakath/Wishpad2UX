package com.etuper.wishpad.wishpad2ux;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class nutriAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] nutriTitle;
    private final String[] nutriValue;
    public nutriAdapter(Activity context, String[] name, String[] value) {
        super(context, R.layout.single_subitem_card, name);
        this.context = context;
        this.nutriTitle = name;
        this.nutriValue = value;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.single_nutri_card, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.nutiTitle);
        TextView txtValue = (TextView) rowView.findViewById(R.id.nutriValue);
        txtTitle.setText(nutriTitle[position]);
        txtValue.setText(nutriValue[position]);
        return rowView;
    }
}