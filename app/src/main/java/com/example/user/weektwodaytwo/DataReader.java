package com.example.user.weektwodaytwo;


import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import com.example.user.weektwodaytwo.model.Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Created by user on 1/17/2018.
 */

public class DataReader extends Activity {

    Context context;
    String  category;

    public DataReader(Context context, String category){

        this.context = context;
         this.category = category;
    }


    public ArrayList<Animals> readData_Csv_File()
    {

          ArrayList<Animals> animalsList = new ArrayList<>();
        InputStream ls = context.getApplicationContext().getResources().openRawResource(R.raw.aninmals);

        BufferedReader reader = new BufferedReader(new InputStreamReader(ls, Charset.forName("UTF-8")));
        String line = "";




        try {
            // job the header information
            reader.readLine();
            while ((line = reader.readLine()) != null) {

                String[] token = line.split(",");
                String result = token[2];
                // result = result.toUpperCase();

                boolean check = result.equalsIgnoreCase(category);
                if (check)
                {
                    Animals animals = new Animals(token[0], token[1], token[2]);
                    animalsList.add(animals);

                }

            }


        } catch (IOException e) {



        }

     return   animalsList;
    }


}
