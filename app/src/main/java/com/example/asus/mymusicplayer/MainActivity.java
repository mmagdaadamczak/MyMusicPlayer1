package com.example.asus.mymusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        /**
         * Opens Nature Activity intent when te user click nature icon
         */
        ImageView natureView = (ImageView) findViewById ( R.id.nature );
        natureView.setOnClickListener ( new View.OnClickListener () {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent natureIntent = new Intent ( MainActivity.this, NatureActivity.class );
                startActivity ( natureIntent );
            }
        } );

        /**
         * Opens Noise Activity intent when te user click whote noise icon
         */

        ImageView whiteNoiseView = findViewById ( R.id.noise_view );
        whiteNoiseView.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent whiteNoiseIntent = new Intent ( MainActivity.this, NoiseActivity.class );
                startActivity ( whiteNoiseIntent );
            }
        } );


        /**
         * Opens Kids Activity intent when te user click kids icon
         */

        ImageView kidsView = findViewById ( R.id.kids_view );
        kidsView.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent whiteNoiseIntent = new Intent ( MainActivity.this, KidsActivity.class );
                startActivity ( whiteNoiseIntent );
            }
        } );

        /**
         * Opens Meditation Activity intent when te user click meditation icon
         */

        ImageView meditationView = findViewById ( R.id.mediation_view );
        meditationView.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent whiteNoiseIntent = new Intent ( MainActivity.this, MeditationActivity.class );
                startActivity ( whiteNoiseIntent );
            }
        } );


    }


}
