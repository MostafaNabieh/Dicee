package com.example.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView imageroll;
    ImageView imagerool2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.bu_roll);
        imageroll=(ImageView)findViewById(R.id.img_roll);
        imagerool2=(ImageView)findViewById(R.id.img_roll2);
        final int [] diceimage={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,
                R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                int radom_number=random.nextInt(6);
                imageroll.setImageResource(diceimage[radom_number]);
                 radom_number=random.nextInt(6);
                 imagerool2.setImageResource(diceimage[radom_number]);


            }
        });
    }
}
