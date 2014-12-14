package com.etuper.wishpad.wishpad2ux;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SubitemAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] subitemTitle;
    private final String[] subitemPrice;
    public SubitemAdapter(Activity context, String[] name, String[] price) {
        super(context, R.layout.single_subitem_card, name);
        this.context = context;
        this.subitemTitle = name;
        this.subitemPrice = price;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.single_subitem_card, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.subitemTitle);
        TextView txtPrice = (TextView) rowView.findViewById(R.id.subitemPrice);
        txtTitle.setText(subitemTitle[position]);
        txtPrice.setText(subitemPrice[position]);
        return rowView;
    }
}