package com.example.bjc90_000.testapp;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button testButton; TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testButton = (Button) findViewById(R.id.button);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              t = (TextView)  findViewById(R.id.textView);
                t.setText(generateRandomString());
            }
        });
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

    private String generateRandomString(){
        final int STRING_LENGTH =10;
        Random rg = new Random();
        char[] returnString= {'a','a','s','e','e','e','4','2','3','t'};
        int i;
        for(int j=0;j<STRING_LENGTH;j++){

            i=0;
            while (i<32)
            {
                i = rg.nextInt(126);
            }
            returnString[j]=(char) i;
            Log.e("The Random Sting is",returnString.toString());
        }










        return new String(returnString);
    }
}
