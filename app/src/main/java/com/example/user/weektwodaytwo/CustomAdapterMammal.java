package com.example.user.weektwodaytwo;

/**
 * Created by user on 1/16/2018.
 */

        import android.content.Context;
        import android.graphics.Color;
        import android.media.MediaPlayer;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.TextView;


        import com.example.user.weektwodaytwo.model.Animals;

        import java.security.PrivateKey;
        import java.util.ArrayList;

/**
 * Created by user on 1/12/2018.
 */

public class CustomAdapterMammal extends ArrayAdapter<Animals> {


    private ImageButton imageButton;
    MediaPlayer mediaPlayer = new MediaPlayer();


    boolean play=true;

    public CustomAdapterMammal(Context context, ArrayList<Animals> data) {
        super(context, R.layout.row_item_lite, data);

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater myinflator = LayoutInflater.from(getContext());


        View customView = myinflator.inflate(R.layout.row_item_lite, parent, false);

        Animals singleAnimal = getItem(position);

        if (Integer.parseInt(singleAnimal.getWeight()) >= 20) {

            customView.setBackgroundColor(Color.BLUE);

        }


        TextView textView = (TextView) customView.findViewById(R.id.textView);
        imageButton = (ImageButton) customView.findViewById(R.id.imageButton);
        textView.setText(singleAnimal.getName());



        imageButton.setOnClickListener(new View.OnClickListener()

        {


            @Override
            public void onClick(View v) {

                if (position == 0)
                {

                    mediaPlayer = MediaPlayer.create(getContext(), R.raw.bird);
                    if (play == true) {
                        imageButton.setImageResource(R.drawable.play_circle);
                        mediaPlayer.pause();
                        mediaPlayer.reset();
                        play =false;

                    } else {

                        imageButton.setImageResource(R.drawable.pause_circle);
                        mediaPlayer.start();
                        play = true;
                    }

                } else if (position == 1) {
                    mediaPlayer = MediaPlayer.create(getContext(), R.raw.lion);
                    if (play == true) {
                        imageButton.setImageResource(R.drawable.play_circle);
                        mediaPlayer.pause();
                        mediaPlayer.reset();
                        play =false;

                    } else {

                        imageButton.setImageResource(R.drawable.pause_circle);
                        mediaPlayer.start();
                        play = true;
                    }



                } else if (position == 2) {
                    mediaPlayer = MediaPlayer.create(getContext(), R.raw.elephant);

                    if (play == true) {
                        imageButton.setImageResource(R.drawable.play_circle);
                        mediaPlayer.pause();
                        mediaPlayer.reset();
                        play =false;

                    } else {

                        imageButton.setImageResource(R.drawable.pause_circle);
                        mediaPlayer.start();
                        play = true;
                    }

                } else if (position == 3) {
                    mediaPlayer = MediaPlayer.create(getContext(), R.raw.lion);

                    if (play == true) {
                        imageButton.setImageResource(R.drawable.play_circle);
                        mediaPlayer.pause();
                        mediaPlayer.reset();
                        play =false;

                    } else {

                        imageButton.setImageResource(R.drawable.pause_circle);
                        mediaPlayer.start();
                        mediaPlayer.reset();
                        play = true;
                    }

                } else if (position == 4) {
                    mediaPlayer = MediaPlayer.create(getContext(), R.raw.cat);

                    if (play == true) {
                        imageButton.setImageResource(R.drawable.play_circle);
                        mediaPlayer.pause();
                        mediaPlayer.reset();
                        play =false;

                    } else {

                        imageButton.setImageResource(R.drawable.pause_circle);
                        mediaPlayer.start();
                        play = true;
                    }

                } else if (position == 5) {
                    mediaPlayer = MediaPlayer.create(getContext(), R.raw.elephant);
                    if (play == true) {
                        imageButton.setImageResource(R.drawable.play_circle);
                        mediaPlayer.pause();
                        mediaPlayer.reset();
                        play =false;

                    } else {

                        imageButton.setImageResource(R.drawable.pause_circle);
                        mediaPlayer.start();
                        play = true;
                    }

                } else if (position == 6) {
                    mediaPlayer = MediaPlayer.create(getContext(), R.raw.lion);
                    if (play == true) {
                        imageButton.setImageResource(R.drawable.play_circle);
                        mediaPlayer.pause();
                        mediaPlayer.reset();
                        play =false;

                    } else {

                        imageButton.setImageResource(R.drawable.pause_circle);
                        mediaPlayer.start();
                        play = true;
                    }

                } else if (position == 7) {
                    mediaPlayer = MediaPlayer.create(getContext(), R.raw.lion);
                    if (play == true) {
                        imageButton.setImageResource(R.drawable.play_circle);
                        mediaPlayer.pause();
                        mediaPlayer.reset();
                        play =false;

                    } else {

                        imageButton.setImageResource(R.drawable.pause_circle);
                        mediaPlayer.start();
                        play = true;
                    }

                } else if (position == 8) {
                    mediaPlayer = MediaPlayer.create(getContext(), R.raw.lion);

                    if (play == true) {
                        imageButton.setImageResource(R.drawable.play_circle);
                        mediaPlayer.pause();
                        mediaPlayer.reset();
                        play =false;

                    } else {

                        imageButton.setImageResource(R.drawable.pause_circle);
                        mediaPlayer.start();
                        play = true;
                    }

                }


            }
        });


        return customView;
    }


}