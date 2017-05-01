package com.example.user.myapplication_list_view;

/**
 * Created by User on 2017/5/1.
 */
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
 /**
  * Created by user on 2017/4/25.
  */


         public class Adapter extends ArrayAdapter<NBAGame> {
     Context context;
     public  Adapter(Context context,ArrayList<NBAGame> items){
                 super(context,0,items);
                 this.context=context;
             }
     @Override
     public View getView(int position, View convertView,
                         ViewGroup parent){
                 LayoutInflater inflater = LayoutInflater.from(context);

                 LinearLayout itemlayout = null;
                 if(convertView == null) {
                        itemlayout = (LinearLayout)inflater.inflate
                                (R.layout.layout, null);
                    } else {
                        itemlayout = (LinearLayout) convertView;
                    }
                 NBAGame item = (NBAGame)getItem(position);


                 TextView T1Name = (TextView)itemlayout.
                         findViewById(R.id.item1Name);
                 T1Name.setText(item.T1Name);


                 ImageView T1Pic = (ImageView)itemlayout.
                         findViewById(R.id.item1Pic);
                 T1Pic.setImageResource(item.T1Pic);
                 TextView T1Point = (TextView)itemlayout.
                         findViewById(R.id.item1Point);
                 T1Point.setText(String.valueOf(item.T1Point));


                 TextView T2Name = (TextView)itemlayout.
                         findViewById(R.id.item2Name);
                 T2Name.setText(item.T2Name);




                 ImageView T2Pic = (ImageView)itemlayout.
                         findViewById(R.id.item2Pic);
                 T2Pic.setImageResource(item.T2Pic);
                 TextView T2Point = (TextView)itemlayout.
                         findViewById(R.id.item2Point);
                 T2Point.setText(String.valueOf(item.T2Point));


        if(item.T2Point>item.T1Point){
                         T2Point.setTextColor(Color.RED);
                     }
                 else{
                         T1Point.setTextColor(Color.RED);
                     }
                 return itemlayout;
             }
 }

