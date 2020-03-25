package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnNewBall = findViewById(R.id.btnAsk);
        final ImageView ball =  findViewById(R.id.img_8Ball);

        final int[] diceArray ={
                                R.drawable.ball1,
                                R.drawable.ball2,
                                R.drawable.ball3,
                                R.drawable.ball4,
                                R.drawable.ball5
        };

        btnNewBall.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Random ranNum = new Random();
                int num = ranNum.nextInt(5);

                ball.setImageResource(diceArray[num]);
            }
        });
    }
}
