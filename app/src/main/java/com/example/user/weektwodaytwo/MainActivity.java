package com.example.user.weektwodaytwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final String[] animalList = new String[]{"Mammals", "Birds", "Fishes", "Reptiles", "Amphibians", "Invertebrates"};

        ArrayAdapter<String> itemsAdapter =  new ArrayAdapter<String>(this,  R.layout.row_item, animalList);

        ListView listView = (ListView) findViewById(R.id.lvAnimal);
        listView.setAdapter(itemsAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this, "name: "+ animalList[position], Toast.LENGTH_SHORT).show();

                Intent intent;

                switch (animalList[position])
                {
                   case "Mammals" :
                       intent =   new Intent(getApplicationContext(), MammalsActivity.class);
                       startActivity(intent);
                    break;

                    case "Birds" :
                        intent =   new Intent(getApplicationContext(), BirdsActivity.class);
                        startActivity(intent);
                        break;

                    case "Fishes" :
                        intent =   new Intent(getApplicationContext(), FishesActivity.class);
                        startActivity(intent);
                        break;
                    case "Reptiles" :
                        intent =   new Intent(getApplicationContext(), ReptilesActivity.class);
                        startActivity(intent);
                        break;

                    case "Invertebrates" :
                        intent =   new Intent(getApplicationContext(),InvertebratesActivity.class);
                        startActivity(intent);


                    break;

                    case "Amphibians" :
                        intent =   new Intent(getApplicationContext(),AmphibiansActivity.class);
                        startActivity(intent);


                        break;




                }
            }
        } );
    }
}
