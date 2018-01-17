package com.example.user.weektwodaytwo;

/**
 * Created by user on 1/16/2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.example.user.weektwodaytwo.model.Animals;

import java.util.ArrayList;

/**
 * Created by user on 1/12/2018.
 */

public class CustomAdapter extends ArrayAdapter<Animals>
{


    public CustomAdapter( Context context, ArrayList<Animals> data)
    {
        super(context, R.layout.row_item_lite, data);


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater myinflator = LayoutInflater.from(getContext());



        View customView = myinflator.inflate(R.layout.row_item_lite, parent, false);
        Animals singleAnimal = getItem(position);

        TextView  textView= (TextView)customView.findViewById(R.id.textView);

        textView.setText(singleAnimal.getName());




        return customView;
    }
}