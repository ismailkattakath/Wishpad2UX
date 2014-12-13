package com.etuper.wishpad.wishpad2ux;


import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.os.Build;

public class OrderScreen extends Activity {

    ListView catList;
    String[] catTitles = {
            "American cuisine",
            "Australian cuisine",
            "Lists of beverages‎",
            "Brazilian cuisine",
            "Lists of breads",
            "Lists of cheeses‎",
            "Dessert",
            "Indian cuisine",
            "Italian cuisine",
            "Japanese cuisine",
            "Lists of Korean cuisine‎",
            "United Kingdom cuisine",
            "Vietnamese cuisine"
    } ;
    Integer[] catImages = {
            R.drawable.item1,
            R.drawable.item2,
            R.drawable.item3,
            R.drawable.item4,
            R.drawable.item5,
            R.drawable.item6,
            R.drawable.item7,
            R.drawable.item8,
            R.drawable.item9,
            R.drawable.item10,
            R.drawable.item1,
            R.drawable.item2,
            R.drawable.item3,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_screen);

        CategoryAdapter adapter = new CategoryAdapter(OrderScreen.this, catTitles, catImages);
        catList=(ListView)findViewById(R.id.categoryList);
        catList.setAdapter(adapter);



    }

}