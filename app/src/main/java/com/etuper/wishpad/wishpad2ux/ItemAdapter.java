package com.etuper.wishpad.wishpad2ux;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] itemTitle;
    private final String[] secondaryItemTitle;
    private final String[] itemPrice;
    private final Integer[] itemImage;

    public ItemAdapter(Activity context, String[] name, String[] SecondaryName, String[] itemPrice, Integer[] imageId) {
        super(context, R.layout.single_item_card, name);
        this.context = context;
        this.itemTitle = name;
        this.secondaryItemTitle = SecondaryName;
        this.itemPrice = itemPrice;
        this.itemImage = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.single_item_card, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.itemTitle);
        TextView secondaryTxtTitle = (TextView) rowView.findViewById(R.id.itemTitleSecondary);
        TextView price = (TextView) rowView.findViewById(R.id.itemPrice);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.itemImage);
        txtTitle.setText(itemTitle[position]);
        secondaryTxtTitle.setText(secondaryItemTitle[position]);
        price.setText(itemPrice[position]);
        imageView.setImageResource(itemImage[position]);
        return rowView;
    }
}