package com.example.user.weektwodaytwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.user.weektwodaytwo.model.Animals;

import java.util.ArrayList;

public class AmphibiansActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amphibians);

        Animals animals = new Animals( "bird","12","mammals"  );
        Animals animals1 = new Animals( "dog","61","mammals"  );
        Animals animals2 = new Animals( "cat","56","mammals"  );
        Animals animals3 = new Animals( "man","10","mammals"  );
        Animals animals4 = new Animals( "elephant","12","mammals"  );
        Animals animals5 = new Animals( "cow","69","mammals"  );
        Animals animals6 = new Animals( "ox","4","mammals"  );
        Animals animals7 = new Animals( "ostrich","8","mammals"  );
        Animals animals8 = new Animals( "lion","45","mammals"  );

        ArrayList<Animals> animalsList = new  ArrayList<>();
        animalsList.add(animals);
        animalsList.add(animals1);
        animalsList.add(animals2);
        animalsList.add(animals3);
        animalsList.add(animals4);
        animalsList.add(animals5);
        animalsList.add(animals5);
        animalsList.add(animals6);
        animalsList.add(animals7);
        animalsList.add(animals8);


        CustomAdapter customAdapter = new CustomAdapter(this, animalsList);
        ListView lvAmphi =(ListView) findViewById(R.id.lvAmphi);
        lvAmphi.setAdapter(customAdapter);

    }
}
