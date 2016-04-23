package com.anurag.android.trkrmaps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    Button zoomIn, zoomOut, carBtn, cycleBtn, walkBtn;
    ImageView img;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zoomIn = (Button) findViewById(R.id.zoom_in);
        zoomOut= (Button) findViewById(R.id.zoom_out);
        carBtn=(Button) findViewById(R.id.carBtn);
        walkBtn=(Button) findViewById(R.id.walkBtn);
        cycleBtn=(Button) findViewById(R.id.cycleBtn);
        img = (ImageView) findViewById(R.id.imageView1);
        carBtn.setBackgroundResource(R.drawable.active);

        zoomIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                float x = img.getScaleX();
                float y = img.getScaleY();

                img.setScaleX(x+1);
                img.setScaleY(y+1);
            }
        });


        zoomOut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                float x = img.getScaleX();
                float y = img.getScaleY();

                img.setScaleX(x-1);
                img.setScaleY(y-1);
            }
        });

        carBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                img.setImageResource(R.drawable.bg2);
                carBtn.setBackgroundResource(R.drawable.active);
                walkBtn.setBackgroundResource(R.drawable.navigation);
                cycleBtn.setBackgroundResource(R.drawable.navigation);
            }
        });

        cycleBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                img.setImageResource(R.drawable.bg3);
                walkBtn.setBackgroundResource(R.drawable.navigation);
                cycleBtn.setBackgroundResource(R.drawable.active);
                carBtn.setBackgroundResource(R.drawable.navigation);
            }
        });

        walkBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                img.setImageResource(R.drawable.bg2);
                walkBtn.setBackgroundResource(R.drawable.active);
                cycleBtn.setBackgroundResource(R.drawable.navigation);
                carBtn.setBackgroundResource(R.drawable.navigation);
            }
        });
    }


}
