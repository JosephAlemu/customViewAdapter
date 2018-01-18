package com.example.user.weektwodaytwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.user.weektwodaytwo.model.Animals;

import java.util.ArrayList;

public class BirdsActivity extends AppCompatActivity {


    ArrayList<Animals> animalsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds);

        getSupportActionBar().setTitle("Birds List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        /////   instantiating   data reader classs

        DataReader   dataReader = new DataReader(this,"bird");


        /// calll  back getting  data   from csv file    res/raw/animal.csv

        animalsList = new ArrayList<>();

        animalsList =   dataReader.readData_Csv_File();

        CustomAdapter customAdapter = new CustomAdapter(this, animalsList);
        ListView lvBird =(ListView) findViewById(R.id.lvBird);
        lvBird.setAdapter(customAdapter);


        lvBird.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Toast.makeText(BirdsActivity.this, "clicked" + animalsList.get(position), Toast.LENGTH_LONG).show();
            }
        });




    }
}
