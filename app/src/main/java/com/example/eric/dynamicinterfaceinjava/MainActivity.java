package com.example.eric.dynamicinterfaceinjava;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout ericLayout =new RelativeLayout(this);
        ericLayout.setBackgroundColor(Color.BLUE);
        RelativeLayout.LayoutParams buttonLayout = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT
        );


        buttonLayout.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonLayout.addRule(RelativeLayout.CENTER_VERTICAL);

        Button redButton = new Button(this);
        redButton.setText("Log In");
        redButton.setBackgroundColor(Color.RED);

        ericLayout.addView(redButton,buttonLayout);
        setContentView(ericLayout);


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
