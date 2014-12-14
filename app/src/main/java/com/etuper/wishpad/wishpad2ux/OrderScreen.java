package com.etuper.wishpad.wishpad2ux;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

public class OrderScreen extends Activity {

    ListView catList;
    GridView itemGrid;

    String[] titleList = {
            "Penne in Wild Mushroom Sauce",
            "Home Made Beef Lasagna ",
            "Home Made Char Grilled Beef or Chicken Burger",
            "Beer Battered Cod Fillet",
            "شر غرلد كمبرلاند سوسق",
            "Char Grilled Rump Steak",
            "Chicken Tikka Masala",
            "Saag Aloo (Potato & Spinach)",
            "Cod Fish Goujons and French Fries",
            "Margherita Pizza with Salad",
            "സ്പാഘെറ്റി വിത്ത്‌ മീറ്റ്‌ ബോള്‍സ്",
            "Cheese Burger with French Fries ",
            "Chicken Burger with French Fries"
    } ;

    String[] secondaryTitleList = {
            "بينه إن ولد مشروم سوس",
            "هم مدي بيف لسجن",
            "هم مدي شر غرلد بيف ار شيكن برجر",
            "بير بطرد كود فيلة",
            "Char Grilled Cumberland Sausage",
            "شر غرلد رومب ستيك",
            "ചിക്കന്‍ ടിക്ക മസാല",
            "صاج ألو (بتت & سبنش)",
            "كود فيش ججنس اند فرنش فريس",
            "مرغريتا بيتزا وذ سلاد",
            "سباغتي وذ ميت بلس",
            "شيس برجر وذ فرنش فريس",
            "شيكن برجر وذ فرنش فريس"
    } ;

    String[] priceList = {
            "£4.95 / £8.95",
            "£7.25",
            "£8.95 / 97.10",
            "£1.95 / £4.95 / £7.25 / £8.95",
            "£10.95",
            "£12.95 / £1.95 / £4.95",
            "£6.95",
            "£12.95",
            "£11.95",
            "£14.95",
            "£14.95",
            "£10.95",
            "£6.95"
    } ;

    Integer[] imageList = {
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

        CategoryAdapter catAdapter = new CategoryAdapter(OrderScreen.this, titleList, imageList);
        catList=(ListView)findViewById(R.id.categoryList);
        catList.setAdapter(catAdapter);

        ItemAdapter itemAdapter = new ItemAdapter(OrderScreen.this, titleList, secondaryTitleList,priceList, imageList);
        itemGrid=(GridView)findViewById(R.id.itemGridView);
        itemGrid.setAdapter(itemAdapter);

    }

    public void onClick(View v) {
        Intent intent=new Intent(this,ItemScreen.class);
        startActivity(intent);
    }

}