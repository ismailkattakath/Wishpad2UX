package com.etuper.wishpad.wishpad2ux;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class ItemScreen extends Activity {

    ListView subitemList;
    ListView flagList;
    ListView nutriList;

    String[] subitemTitleList = {
            "Penne in Wild Mushroom Sauce",
            "Beef Lasagna ",
            "Home Made Char Grilled Beef or Chicken Burger",
            "Beer Battered"
    };

    String[] subitemPriceList = {
            "£4.95",
            "£7.25",
            "£8.95",
            "£1.95"
    };

    String[] flagTitleList = {
            "Vegetarian",
            "Healthy",
            "Spicy"
    };

    String[] nutriTitleList = {
            "Energy",
            "Sugars",
            "Fat"
    };

    String[] nutriValueList = {
            "458kj",
            "11.0g",
            "0.4g"
    };

    Integer[] flagImageList = {
            R.drawable.vegicon,
            R.drawable.healthyicon,
            R.drawable.spicyicon
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_screen);

        SubitemAdapter subitemAdapter = new SubitemAdapter(ItemScreen.this, subitemTitleList, subitemPriceList);
        subitemList=(ListView)findViewById(R.id.subitemList);
        subitemList.setAdapter(subitemAdapter);

        FlagAdapter flagAdapter = new FlagAdapter(ItemScreen.this, flagTitleList, flagImageList);
        flagList=(ListView)findViewById(R.id.flagList);
        flagList.setAdapter(flagAdapter);

        nutriAdapter nutriAdapter = new nutriAdapter(ItemScreen.this, nutriTitleList, nutriValueList);
        nutriList=(ListView)findViewById(R.id.nutriList);
        nutriList.setAdapter(nutriAdapter);

    }

}
