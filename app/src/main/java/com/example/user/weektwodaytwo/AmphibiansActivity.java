package com.example.user.weektwodaytwo;

import com.example.user.weektwodaytwo.model.Animals;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class AmphibiansActivity extends AppCompatActivity {


    ArrayList<Animals> animalsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amphibians);

        getSupportActionBar().setTitle("Amphibians List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


       /////   instantiating   data reader classs

        DataReader   dataReader = new DataReader(this,"Amphibian");


        /// calll  back getting  data   from csv file    res/raw/animal.csv

         animalsList = new ArrayList<>();

        animalsList =   dataReader.readData_Csv_File();

        CustomAdapter customAdapter = new CustomAdapter(this, animalsList);
        ListView listView = (ListView) findViewById(R.id.lvAmphi);
        listView.setAdapter(customAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText(AmphibiansActivity.this, "clicked" + animalsList.get(position), Toast.LENGTH_LONG).show();
            }
        });

    }



}
