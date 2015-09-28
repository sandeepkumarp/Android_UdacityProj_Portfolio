package com.creativespringbok.portfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button buttonStreamer = null,
            buttonScores = null,
            buttonLibrary = null,
            buttonBigger = null,
            buttonReader = null,
            buttonCapstone = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //references to individual buttons.
        buttonStreamer = (Button) findViewById(R.id.btnStreamer);
        buttonScores = (Button) findViewById(R.id.btnScores);
        buttonLibrary = (Button) findViewById(R.id.btnLib);
        buttonBigger = (Button) findViewById(R.id.btnBigger);
        buttonReader = (Button) findViewById(R.id.btnReader);
        buttonCapstone = (Button) findViewById(R.id.btnCapstone);


        buttonStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Spotify Streamer App !", Toast.LENGTH_SHORT).show();
            }
        });

        buttonScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "1/2 of Super Duo : Scores App", Toast.LENGTH_SHORT).show();
            }
        });

        buttonLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "2/2 of Super Duo : Library App", Toast.LENGTH_SHORT).show();
            }
        });

        buttonBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Taking the apps to a new level!", Toast.LENGTH_SHORT).show();
            }
        });

        buttonReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "An amazing reader app!", Toast.LENGTH_SHORT).show();
            }
        });

        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "My Awesome Capstone App!!", Toast.LENGTH_SHORT).show();
            }
        });



    }



    public void displayTostMessage(View view) {
        // Do something in response to button click
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
