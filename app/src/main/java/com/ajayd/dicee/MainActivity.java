package com.ajayd.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] dice_arr = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        Random rand_generator = new Random();
        ImageView leftDice = (ImageView) findViewById(R.id.left_dice);
        ImageView rightDice = (ImageView) findViewById(R.id.right_dice);
        Button rollButton = (Button) findViewById(R.id.roll_btn);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sound);

        rollButton.setOnClickListener(v -> {
            mediaPlayer.start();
            leftDice.setImageResource(dice_arr[rand_generator.nextInt(6)]);
            rightDice.setImageResource(dice_arr[rand_generator.nextInt(6)]);
        });
    }
}