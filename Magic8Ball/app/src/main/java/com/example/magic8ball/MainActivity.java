package com.example.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView printed_answer;
    private int selection;
    private int x;
    private Random rand = new Random();
    private ImageView image;
    private String[] answers = {"Cannot Predict Now", "No.", "YES!", "Very Doubtful", "Without A Doubt"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //x = R.id.main_pic;
        //Log.i("MainActivity", "test" + x);
        image = (ImageView) findViewById(R.id.main_pic);

        //image.setImageResource(R.id.xxx);
        printed_answer = (TextView) findViewById(R.id.answer);


    }

    public void showAnswer(View view) {

        selection = rand.nextInt(answers.length);
        printed_answer.setText(answers[selection]);

        //image.setVisibility(image.INVISIBLE);

        if (selection == 0) {
            image.setVisibility(image.INVISIBLE);
            image = (ImageView) findViewById(R.id.cannot_predict);
            image.setVisibility(image.VISIBLE);
        } else if (selection == 1) {
            image.setVisibility(image.INVISIBLE);
            image = (ImageView) findViewById(R.id.no);
            image.setVisibility(image.VISIBLE);
        } else if (selection == 2) {
            image.setVisibility(image.INVISIBLE);
            image = (ImageView) findViewById(R.id.yes);
            image.setVisibility(image.VISIBLE);
        } else if (selection == 3) {
            image.setVisibility(image.INVISIBLE);
            image = (ImageView) findViewById(R.id.very_doubtful);
            image.setVisibility(image.VISIBLE);
        } else if (selection == 4) {
            image.setVisibility(image.INVISIBLE);
            image = (ImageView) findViewById(R.id.without_a_doubt);
            image.setVisibility(image.VISIBLE);

        } else {
            image.setVisibility(image.INVISIBLE);
            image = (ImageView) findViewById(R.id.main_pic);
            image.setVisibility(image.VISIBLE);
        }


    }
}
